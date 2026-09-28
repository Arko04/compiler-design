grammar SimpleLang;

@header
{
   import main.ast.nodes.program.*;
   import main.ast.nodes.translation.*;
   import main.ast.nodes.function.*;
   import main.ast.nodes.declaration.*;
   import main.ast.nodes.statement.*;
   import main.ast.nodes.expression.*;
   import main.ast.nodes.type.*;
   import main.ast.nodes.initializer.*;

}

//program returns [Program programRet]
//    : {$programRet = new Program();}
//    (t = translationUnit{$programRet.setTranslationUnit($t.translationUnitRet);})? EOF;
program returns [Program programRet]
    : {$programRet = new Program();}
      tu=translationUnit {
          $programRet.setTranslationUnit($tu.translationUnitRet);
          $programRet.setLine($tu.translationUnitRet.getLine());
      }
      eof=EOF
    |
    {$programRet = new Program();}
    eof=EOF {$programRet.setLine($eof.line); }
    ;

//return returns [Return returnRet]:
//    r = Return e = expression Semi
//    {
//        $returnRet = new Return($e.exprRet);
//         $returnRet.setExpression($e.expressionRet);
//        $returnRet.setLine($r.line);
//    };

//translationUnit returns [TranslationUnit translationUnitRet]
//    : {$translationUnitRet = new TranslationUnit();}
//    (e = externalDeclaration{$translationUnitRet.addExternalDeclaration($e.externalDeclarationRet);})+ ;
translationUnit returns [TranslationUnit translationUnitRet]
    : {$translationUnitRet = new TranslationUnit();}
      e1 = externalDeclaration {
          $translationUnitRet.addExternalDeclaration($e1.externalDeclarationRet);
          $translationUnitRet.setLine($e1.externalDeclarationRet.getLine());
      }
      (eRest = externalDeclaration {
          $translationUnitRet.addExternalDeclaration($eRest.externalDeclarationRet);
      })* ;

//externalDeclaration returns [ExternalDeclaration externalDeclarationRet]
//    : {$externalDeclarationRet = new ExternalDeclaration();}
//    (f = functionDefinition {$externalDeclarationRet.setFunctionDefinition($f.functionDefinitionRet);})
//    |
//    (d = declaration { $externalDeclarationRet.setDeclaration($d.declarationRet);})
//    |
//    s = Semi {$externalDeclarationRet.setLine($s.line);}; // stray ;
externalDeclaration returns [ExternalDeclaration externalDeclarationRet]
    : f=functionDefinition {
        $externalDeclarationRet = new ExternalDeclaration();
        $externalDeclarationRet.setFunctionDefinition($f.functionDefinitionRet);
        $externalDeclarationRet.setLine($f.functionDefinitionRet.getLine());
    }
    | d=declaration {
        $externalDeclarationRet = new ExternalDeclaration();
        $externalDeclarationRet.setDeclaration($d.declarationRet);
        $externalDeclarationRet.setLine($d.declarationRet.getLine());
    }
    | s=Semi {
        $externalDeclarationRet = new ExternalDeclaration();
        $externalDeclarationRet.setLine($s.line);
    };

functionDefinition returns [FunctionDefinition functionDefinitionRet]
    : {$functionDefinitionRet = new FunctionDefinition();}
      (ds = declarationSpecifiers {
          $functionDefinitionRet.setDeclarationSpecifiers($ds.declarationSpecifiersRet);
      })?
      dr = declarator {
          $functionDefinitionRet.setDeclarator($dr.declaratorRet);
          $functionDefinitionRet.setLine($dr.declaratorRet.getLine());
      }
      (dl = declarationList {
          $functionDefinitionRet.setDeclarationList($dl.declarationListRet);
      })?
      cs = compoundStatement {
          $functionDefinitionRet.setCompoundStatement($cs.compoundStatementRet);
      } ;

declarationList returns [DeclarationList declarationListRet]
    : d1 = declaration {
          $declarationListRet = new DeclarationList();
          $declarationListRet.addDeclaration($d1.declarationRet);
          $declarationListRet.setLine($d1.declarationRet.getLine());
      }
      (dRest = declaration {
          $declarationListRet.addDeclaration($dRest.declarationRet);
      })* ;

expression returns [Expression expressionRet]
  :
  i = Identifier {
      $expressionRet = new IdentifierExpression($i.getText());
      $expressionRet.setLine($i.getLine());
    }
  |
  c = Constant {
      $expressionRet = new ConstantExpression($c.getText());
      $expressionRet.setLine($c.getLine());
    }
  |
  sl+=StringLiteral+ {
      List<String> values = new ArrayList<>();
      for (Token t : $sl) values.add(t.getText());
      $expressionRet = new StringLiteralExpression(values);
      $expressionRet.setLine($sl.get(0).getLine());
    }
  |
  lllp = LeftParen exp = expression RightParen
   {$expressionRet = new ParenExpression($exp.expressionRet);
   $expressionRet.setLine($lllp.line);} // ParenExpression
  |
  lp = LeftParen tn = typeName  RightParen LeftBrace
  il = initializerList Comma? RightBrace
  {$expressionRet = new CompoundLiteralExpression();
  ((CompoundLiteralExpression)$expressionRet).setTypeName($tn.typeNameRet);
  ((CompoundLiteralExpression)$expressionRet).setInitializerList($il.initializerListRet);
  $expressionRet.setLine($lp.line);
  }
  |
  e1 = expression lb = LeftBracket  e2 = expression rb = RightBracket
   {$expressionRet = new ArrayAccessExpression();
   ((ArrayAccessExpression)$expressionRet).setLine($e1.expressionRet.getLine());/////
   ((ArrayAccessExpression)$expressionRet).setOuterExpression($e1.expressionRet);
   ((ArrayAccessExpression)$expressionRet).setInnerExpression($e2.expressionRet);
   }// ArrayAccessExpression                              // Array indexing
  |
  e = expression
  {
  $expressionRet = new FunctionCallExpression();
  ((FunctionCallExpression)$expressionRet).setLine($e.expressionRet.getLine());
  ((FunctionCallExpression)$expressionRet).setExpression($e.expressionRet);
  }
  LeftParen (ael = argumentExpressionList
  {((FunctionCallExpression)$expressionRet)
  .setArgumentExpressionList($ael.argumentExpressionListRet);})?
  RightParen       //FunctionCallExpression                // Function call
  |
  ep = expression pf = (PlusPlus | MinusMinus)
   {$expressionRet = new PostfixExpression($ep.expressionRet,$pf.text );
   $expressionRet.setLine($pf.line);}      //PostfixExpression                                                   // Postfix increment                                                    // Postfix decrement
  |
  {$expressionRet = new PrefixExpression();}
  (prefix = (PlusPlus | MinusMinus | Sizeof)
  {((PrefixExpression)$expressionRet).addPrefix($prefix.text);})*
  (                                          // Prefix operators (zero or more)
       id=Identifier {((PrefixExpression)$expressionRet).setIdentifier($id.text);
       $expressionRet.setLine($id.line);}
       |
       ct=Constant {((PrefixExpression)$expressionRet).setConstant($ct.text);
       $expressionRet.setLine($ct.line);}
       |
       s1 = StringLiteral {
       ((PrefixExpression)$expressionRet).addStringLiteral($s1.text);
       $expressionRet.setLine($s1.line);
       }
       (s2=StringLiteral{((PrefixExpression)$expressionRet).addStringLiteral($s2.text);})*
       |
       lp = LeftParen parenp = expression RightParen
       {
       ((PrefixExpression)$expressionRet).setExpression($parenp.expressionRet);
       $expressionRet.setLine($lp.line);
       }
       |
       llp = LeftParen tpn = typeName RightParen LeftBrace ill = initializerList Comma? RightBrace
        {
        ((PrefixExpression)$expressionRet).setTypeName($tpn.typeNameRet);
        ((PrefixExpression)$expressionRet).setInitializerList($ill.initializerListRet);
         $expressionRet.setLine($llp.line);
         }
       |
       up = unaryOperator cep = castExpression
       {
       ((PrefixExpression)$expressionRet).setLine($up.unaryOperatorRet.getLine());
       ((PrefixExpression)$expressionRet).setUnaryOperator($up.unaryOperatorRet);
       ((PrefixExpression)$expressionRet).setCastExpression($cep.castExpressionRet);
       }
       |
       sz = Sizeof LeftParen tpnm = typeName RightParen
       {((PrefixExpression)$expressionRet).setTypeName($tpnm.typeNameRet);
       $expressionRet.setLine($sz.line);}
  )
  |
  lp = LeftParen tn = typeName RightParen ce = castExpression           //TypeCastExpression                       // Cast expression
  {$expressionRet = new TypeCastExpression();
   ((TypeCastExpression)$expressionRet).setTypeName($tn.typeNameRet);
   ((TypeCastExpression)$expressionRet).setCastExpression($ce.castExpressionRet);
   $expressionRet.setLine($lp.line);
  }

  | left=expression opts=(
        Star | Div | Mod           // multiplicative
      | Plus | Minus              // additive
      | LeftShift | RightShift    // shift
      | Less | Greater | LessEqual | GreaterEqual  // relational
      | Equal | NotEqual          // equality
      | And                       // bitwise AND
      | Xor                       // bitwise XOR
      | Or                        // bitwise OR
      | AndAnd                    // logical AND
      | OrOr                      // logical OR
    ) right=expression {
      $expressionRet = new BinaryExpression($left.expressionRet, $opts.text, $right.expressionRet);
      $expressionRet.setLine($opts.getLine());
    }
    | cond=expression qq = Question thenExpr=expression Colon elseExpr=expression
      {
        $expressionRet = new TernaryExpression(
          $cond.expressionRet,
          $thenExpr.expressionRet,
          $elseExpr.expressionRet
        );
        $expressionRet.setLine($qq.line);
      }
   //TernaryExpression                        // Conditional operator
    | lhs=expression asop=assignmentOperator rhs=expression
      {
        $expressionRet = new AssignmentExpression(
          $lhs.expressionRet,
          $rhs.expressionRet,
          $asop.assignmentOperatorRet
        );
        ((AssignmentExpression)$expressionRet).setLine($lhs.expressionRet.getLine());
      }                            // Assignment
  |
  e1 = expression
  {$expressionRet = new CommaExpression();
  ((CommaExpression)$expressionRet).setLine($e1.expressionRet.getLine());
  ((CommaExpression)$expressionRet).addExpression($e1.expressionRet);}
  (Comma ec = expression {((CommaExpression)$expressionRet).addExpression($ec.expressionRet);})+ ;             //CommaExpression                                 // Comma operator

argumentExpressionList returns [ArgumentExpressionList argumentExpressionListRet]
  : {
      $argumentExpressionListRet = new ArgumentExpressionList();
    }
    e1 = expression {
      $argumentExpressionListRet.addExpression($e1.expressionRet);
      $argumentExpressionListRet.setLine($e1.expressionRet.getLine()); // set line from first expression
    }
    (Comma e2 = expression {
      $argumentExpressionListRet.addExpression($e2.expressionRet);
    })*
  ;


//unaryOperator returns [UnaryOperator unaryOperatorRet]
//  : op = And   { $unaryOperatorRet = new UnaryOperator($op.getText());  $unaryOperatorRet.setLine($op.getLine()); }
//  | op = Star  { $unaryOperatorRet = new UnaryOperator($op.getText());  $unaryOperatorRet.setLine($op.getLine()); }
//  | op = Plus  { $unaryOperatorRet = new UnaryOperator($op.getText());  $unaryOperatorRet.setLine($op.getLine()); }
//  | op = Minus { $unaryOperatorRet = new UnaryOperator($op.getText());  $unaryOperatorRet.setLine($op.getLine()); }
//  | op = Tilde { $unaryOperatorRet = new UnaryOperator($op.getText());  $unaryOperatorRet.setLine($op.getLine()); }
//  | op = Not   { $unaryOperatorRet = new UnaryOperator($op.getText());  $unaryOperatorRet.setLine($op.getLine()); }
//  ;
unaryOperator returns [UnaryOperator unaryOperatorRet]
  : op = (And | Star | Plus | Minus | Tilde | Not)
    { $unaryOperatorRet = new UnaryOperator($op.getText());
      $unaryOperatorRet.setLine($op.getLine()); }
  ;

//castExpression returns [CastExpression castExpressionRet]
//    : {$castExpressionRet = new CastExpression();}
//      l1 = LeftParen {$castExpressionRet.setLine($l1.line);}
//      t = typeName
//      {$castExpressionRet.setTypeName($t.typeNameRet);}
//      RightParen
//      c = castExpression
//      {$castExpressionRet.setCastExpression($c.castExpressionRet);}
//    |
//      {$castExpressionRet = new CastExpression();}
////      l2 = LeftParen{$castExpressionRet.setLine($l2.line);}
//      e = expression
//      {$castExpressionRet.setExpression($e.expressionRet);}
////      RightParen
//    |
//      {$castExpressionRet = new CastExpression();}
//      d = DigitSequence {$castExpressionRet.setLine($d.line);}
//      {$castExpressionRet.setDigitSequence(new DigitSequence($d.getText()));}
//    ;

castExpression returns [CastExpression castExpressionRet]
    : l1=LeftParen {
          $castExpressionRet = new CastExpression();
          $castExpressionRet.setLine($l1.getLine());
      }
      t=typeName {
          $castExpressionRet.setTypeName($t.typeNameRet);
      }
      RightParen
      c=castExpression {
          $castExpressionRet.setCastExpression($c.castExpressionRet);
      }
    | e=expression {
          $castExpressionRet = new CastExpression();
          $castExpressionRet.setExpression($e.expressionRet);
          $castExpressionRet.setLine($e.expressionRet.getLine());
      }
    | d=DigitSequence {
          $castExpressionRet = new CastExpression();
          $castExpressionRet.setLine($d.getLine());
          $castExpressionRet.setDigitSequence(new DigitSequence($d.getText()));
      }
    ;



//
//assignmentOperator returns [AssignmentOperator assignmentOperatorRet]
//    : {$assignmentOperatorRet = new AssignmentOperator();}
//      Assign
//      {$assignmentOperatorRet.setOperator(AssignmentOperator.Operator.ASSIGN);}
//    |
//      StarAssign
//      {$assignmentOperatorRet.setOperator(AssignmentOperator.Operator.STAR_ASSIGN);}
//    |
//      DivAssign
//      {$assignmentOperatorRet.setOperator(AssignmentOperator.Operator.DIV_ASSIGN);}
//    |
//      ModAssign
//      {$assignmentOperatorRet.setOperator(AssignmentOperator.Operator.MOD_ASSIGN);}
//    |
//      PlusAssign
//      {$assignmentOperatorRet.setOperator(AssignmentOperator.Operator.PLUS_ASSIGN);}
//    |
//      MinusAssign
//      {$assignmentOperatorRet.setOperator(AssignmentOperator.Operator.MINUS_ASSIGN);}
//    |
//      LeftShiftAssign
//      {$assignmentOperatorRet.setOperator(AssignmentOperator.Operator.LEFT_SHIFT_ASSIGN);}
//    |
//      RightShiftAssign
//      {$assignmentOperatorRet.setOperator(AssignmentOperator.Operator.RIGHT_SHIFT_ASSIGN);}
//    |
//      AndAssign
//      {$assignmentOperatorRet.setOperator(AssignmentOperator.Operator.AND_ASSIGN);}
//    |
//      XorAssign
//      {$assignmentOperatorRet.setOperator(AssignmentOperator.Operator.XOR_ASSIGN);}
//    |
//      OrAssign
//      {$assignmentOperatorRet.setOperator(AssignmentOperator.Operator.OR_ASSIGN);}
//    ;

assignmentOperator returns [AssignmentOperator assignmentOperatorRet]
  : op = (Assign | StarAssign | DivAssign | ModAssign | PlusAssign | MinusAssign |
          LeftShiftAssign | RightShiftAssign | AndAssign | XorAssign | OrAssign)
    {
      $assignmentOperatorRet = new AssignmentOperator();
      $assignmentOperatorRet.setOperator($op.text);
      $assignmentOperatorRet.setLine($op.line);
    }
  ;

declaration returns [Declaration declarationRet]
    : {$declarationRet = new Declaration();}
    (d = declarationSpecifiers {
    $declarationRet.setDeclarationSpecifiers($d.declarationSpecifiersRet);
    $declarationRet.setLine($d.declarationSpecifiersRet.getLine());})
    (i = initDeclaratorList {$declarationRet.setInitDeclaratorList($i.initDeclaratorListRet);})? Semi ;

//declarationSpecifiers returns [DeclarationSpecifiers declarationSpecifiersRet]
//    : {$declarationSpecifiersRet = new DeclarationSpecifiers();}
//      ds = declarationSpecifier {
//        $declarationSpecifiersRet.addDeclarationSpecifier($ds.declarationSpecifierRet);
//        $declarationSpecifiersRet.setLine($ds.start.getLine());
//      }
//      (ds1 = declarationSpecifier {
//        $declarationSpecifiersRet.addDeclarationSpecifier($ds1.declarationSpecifierRet);
//      })* ;
declarationSpecifiers returns [DeclarationSpecifiers declarationSpecifiersRet]
    : ds = declarationSpecifier {
        $declarationSpecifiersRet = new DeclarationSpecifiers();
        $declarationSpecifiersRet.addDeclarationSpecifier($ds.declarationSpecifierRet);
        $declarationSpecifiersRet.setLine($ds.declarationSpecifierRet.getLine());
      }
      (ds1 = declarationSpecifier {
        $declarationSpecifiersRet.addDeclarationSpecifier($ds1.declarationSpecifierRet);
      })*
    ;

declarationSpecifier returns [DeclarationSpecifier  declarationSpecifierRet]
    : {$declarationSpecifierRet = new DeclarationSpecifier();}
    (
    (td = Typedef {$declarationSpecifierRet.setLine($td.line);} )
    |
    (ts = typeSpecifier {
    $declarationSpecifierRet.setTypeSpecifier($ts.typeSpecifierRet);
    $declarationSpecifierRet.setLine($ts.typeSpecifierRet.getLine());}) ////////////
    |
    (c= Const {{$declarationSpecifierRet.setLine($c.line);}})
    );

initDeclaratorList returns [InitDeclaratorList initDeclaratorListRet]
    : {$initDeclaratorListRet = new InitDeclaratorList();}
    (i1 = initDeclarator {
    $initDeclaratorListRet.addInitDeclarator($i1.initDeclaratorRet);
    $initDeclaratorListRet.setLine($i1.initDeclaratorRet.getLine());})
    (Comma i2 = initDeclarator {$initDeclaratorListRet.addInitDeclarator($i2.initDeclaratorRet);})* ;

initDeclarator returns [InitDeclarator initDeclaratorRet]
    : {$initDeclaratorRet = new InitDeclarator();}
    (d = declarator {$initDeclaratorRet.setDeclarator($d.declaratorRet);
    $initDeclaratorRet.setLine($d.declaratorRet.getLine());})
     (Assign i = initializer {$initDeclaratorRet.setInitializer($i.initializerRet);})? ;

typeSpecifier returns [TypeSpecifier typeSpecifierRet]
    : t = (Void | Char | Short | Int | Long | Float | Double | Signed | Unsigned | Bool | Identifier)
      {
        $typeSpecifierRet = new TypeSpecifier($t.getText());
        $typeSpecifierRet.setLine($t.getLine());
      }
    ;

specifierQualifierList returns [SpecifierQualifierList specifierQualifierListRet]
    : {$specifierQualifierListRet = new SpecifierQualifierList();}
    (
    (t = typeSpecifier {
    $specifierQualifierListRet.setTypeSpecifier($t.typeSpecifierRet);
    $specifierQualifierListRet.setLine($t.typeSpecifierRet.getLine());} )
    |
    (c = Const {$specifierQualifierListRet.setLine($c.line);})
    )
    (s = specifierQualifierList
    {$specifierQualifierListRet.setSpecifierQualifierList($s.specifierQualifierListRet);})? ;

declarator returns [Declarator declaratorRet]
    : {$declaratorRet = new Declarator();}
    (p = pointer {
    $declaratorRet.setPointer($p.pointerRet);
    $declaratorRet.setLine($p.pointerRet.getLine());})
    (d = directDeclarator {$declaratorRet.setDirectDeclarator($d.directDeclaratorRet);})
    | {$declaratorRet = new Declarator();}
    (d1 = directDeclarator {$declaratorRet.setDirectDeclarator($d1.directDeclaratorRet);
    $declaratorRet.setLine($d1.directDeclaratorRet.getLine());})
    ;


directDeclarator returns [DirectDeclarator directDeclaratorRet]
    : {$directDeclaratorRet = new IdentifierDeclarator();}
    id = Identifier {((IdentifierDeclarator)$directDeclaratorRet).setIdentifier($id.text);
    $directDeclaratorRet.setLine($id.line);}
    | {$directDeclaratorRet = new ParenDeclarator();}
    l = LeftParen d = declarator
    {((ParenDeclarator)$directDeclaratorRet).setDeclarator($d.declaratorRet);
    $directDeclaratorRet.setLine($l.line);} RightParen
    |
    d1 = directDeclarator
    {$directDeclaratorRet = new ArrayDeclarator();
    ((ArrayDeclarator)$directDeclaratorRet).setDirectDeclarator($d1.directDeclaratorRet);
    ((ArrayDeclarator)$directDeclaratorRet).setLine($d1.directDeclaratorRet.getLine());}
        LeftBracket
        (e = expression
        {((ArrayDeclarator)$directDeclaratorRet).setExpression($e.expressionRet);})?
        RightBracket
    |
    d2 = directDeclarator
     {$directDeclaratorRet = new FunctionDeclarator();
     ((FunctionDeclarator)$directDeclaratorRet).setDirectDeclarator($d2.directDeclaratorRet);
     ((FunctionDeclarator)$directDeclaratorRet).setLine($d2.directDeclaratorRet.getLine());}
        l = LeftParen
        (p = parameterList
        {((FunctionDeclarator)$directDeclaratorRet).setParameterList($p.parameterListRet);
        $directDeclaratorRet.setLine($l.line);}
        |
        (i = identifierList
        {((FunctionDeclarator)$directDeclaratorRet).setIdentifierList($i.identifierListRet);} )?)
        RightParen ;

pointer returns [Pointer pointerRet]
    : {$pointerRet = new Pointer();}
      s=Star { $pointerRet.setLine($s.getLine()); }
      (Const+)?
      ((Star) (Const+)?)* ;

parameterList returns [ParameterList parameterListRet]
    : {$parameterListRet = new ParameterList();}
     (p1 = parameterDeclaration{
     $parameterListRet.addParameterDeclaration($p1.parameterDeclarationRet);
     $parameterListRet.setLine($p1.parameterDeclarationRet.getLine());})
     (Comma
     (p2 = parameterDeclaration{$parameterListRet.addParameterDeclaration($p2.parameterDeclarationRet);}))* ;

parameterDeclaration returns [ParameterDeclaration parameterDeclarationRet]
    : {$parameterDeclarationRet = new ParameterDeclaration();}
    (ds = declarationSpecifiers {
    $parameterDeclarationRet.setDeclarationSpecifiers($ds.declarationSpecifiersRet);
    $parameterDeclarationRet.setLine($ds.declarationSpecifiersRet.getLine());} )
    (
    (d = declarator {$parameterDeclarationRet.setDeclarator($d.declaratorRet);})
    |
    (a = abstractDeclarator {$parameterDeclarationRet.setAbstractDeclarator($a.abstractDeclaratorRet);})?
    ) ;

identifierList returns [IdentifierList identifierListRet]
    : {$identifierListRet = new IdentifierList();}
      i = Identifier {
        IdentifierExpression idExpr = new IdentifierExpression($i.getText());
        idExpr.setLine($i.getLine());
        $identifierListRet.addIdentifierExpression(idExpr);
        $identifierListRet.setLine($i.getLine());
      }
      (Comma i2 = Identifier {
        IdentifierExpression idExpr2 = new IdentifierExpression($i2.getText());
        idExpr2.setLine($i2.getLine());
        $identifierListRet.addIdentifierExpression(idExpr2);
      })* ;


typeName returns [TypeName typeNameRet]
    : {$typeNameRet = new TypeName();}
    (s = specifierQualifierList {
    $typeNameRet.setSpecifierQualifierList($s.specifierQualifierListRet);
    $typeNameRet.setLine($s.specifierQualifierListRet.getLine());})
    (a = abstractDeclarator {$typeNameRet.setAbstractDeclarator($a.abstractDeclaratorRet);})? ;

abstractDeclarator returns [AbstractDeclarator abstractDeclaratorRet]
    : {$abstractDeclaratorRet = new AbstractDeclarator();}
    (p1 = pointer {
    $abstractDeclaratorRet.setPointer($p1.pointerRet);
    $abstractDeclaratorRet.setLine($p1.pointerRet.getLine());})
    |
    {$abstractDeclaratorRet = new AbstractDeclarator();}
    (d = directAbstractDeclarator
    {$abstractDeclaratorRet.setDirectAbstractDeclarator($d.directAbstractDeclaratorRet);
    $abstractDeclaratorRet.setLine($d.directAbstractDeclaratorRet.getLine());} )
    |
    {$abstractDeclaratorRet = new AbstractDeclarator();}
    (p3 = pointer {$abstractDeclaratorRet.setPointer($p3.pointerRet);
    $abstractDeclaratorRet.setLine($p3.pointerRet.getLine());})
    (d = directAbstractDeclarator
    {$abstractDeclaratorRet.setDirectAbstractDeclarator($d.directAbstractDeclaratorRet);});
//
//directAbstractDeclarator returns [DirectAbstractDeclarator directAbstractDeclaratorRet]
//    : {$directAbstractDeclaratorRet = new DirectAbstractDeclarator();}
//    lb = LeftBracket {$directAbstractDeclaratorRet.setLine($lb.line);}
//    (e1 = expression{$directAbstractDeclaratorRet.setExpression($e1.expressionRet);})?
//    RightBracket
//    |
//    {$directAbstractDeclaratorRet = new DirectAbstractDeclarator();}
//    lp = LeftParen {$directAbstractDeclaratorRet.setLine($lp.line);}
//        ((a = abstractDeclarator {$directAbstractDeclaratorRet.setAbstractDeclarator($a.abstractDeclaratorRet);})
//        |
//        (p1 = parameterList {$directAbstractDeclaratorRet.setParameterList($p1.parameterListRet);})?)
//    RightParen
//    |
//    {$directAbstractDeclaratorRet = new DirectAbstractDeclarator();}
//    d1 = directAbstractDeclarator {
//    $directAbstractDeclaratorRet.setDirectAbstractDeclarator($d1.directAbstractDeclaratorRet);
//    $directAbstractDeclaratorRet.setLine($d1.directAbstractDeclaratorRet.getLine());}
//     LeftBracket
//     (e2 = expression{$directAbstractDeclaratorRet.setExpression($e2.expressionRet);})?
//     RightBracket
//    |
//    {$directAbstractDeclaratorRet = new DirectAbstractDeclarator();}
//    d2 = directAbstractDeclarator {
//    $directAbstractDeclaratorRet.setDirectAbstractDeclarator($d2.directAbstractDeclaratorRet);
//    $directAbstractDeclaratorRet.setLine($d2.directAbstractDeclaratorRet.getLine());}
//    LeftParen
//    (p2 = parameterList {$directAbstractDeclaratorRet.setParameterList($p2.parameterListRet);})?
//    RightParen ;
directAbstractDeclarator returns [DirectAbstractDeclarator directAbstractDeclaratorRet]
    : {$directAbstractDeclaratorRet = new DirectAbstractDeclarator();}
      lb = LeftBracket {
          $directAbstractDeclaratorRet.setLine($lb.getLine());
      }
      (e1 = expression {
          $directAbstractDeclaratorRet.setExpression($e1.expressionRet);
      })?
      RightBracket

    | {$directAbstractDeclaratorRet = new DirectAbstractDeclarator();}
      lp = LeftParen {
          $directAbstractDeclaratorRet.setLine($lp.getLine());
      }
      (
        a = abstractDeclarator {
            $directAbstractDeclaratorRet.setAbstractDeclarator($a.abstractDeclaratorRet);
        }
        |
        p1 = parameterList {
            $directAbstractDeclaratorRet.setParameterList($p1.parameterListRet);
        }
      )?
      RightParen

    |
      d1 = directAbstractDeclarator {
          $directAbstractDeclaratorRet = new DirectAbstractDeclarator();
          $directAbstractDeclaratorRet.setDirectAbstractDeclarator($d1.directAbstractDeclaratorRet);
          $directAbstractDeclaratorRet.setLine($d1.directAbstractDeclaratorRet.getLine());
      }
      LeftBracket
      (e2 = expression {
          $directAbstractDeclaratorRet.setExpression($e2.expressionRet);
      })?
      RightBracket

    |
      d2 = directAbstractDeclarator {
          $directAbstractDeclaratorRet = new DirectAbstractDeclarator();
          $directAbstractDeclaratorRet.setDirectAbstractDeclarator($d2.directAbstractDeclaratorRet);
          $directAbstractDeclaratorRet.setLine($d2.directAbstractDeclaratorRet.getLine());
      }
      LeftParen
      (p2 = parameterList {
          $directAbstractDeclaratorRet.setParameterList($p2.parameterListRet);
      })?
      RightParen;


initializer returns [Initializer initializerRet]
    : {$initializerRet = new Initializer();}
    (e = expression{$initializerRet.setExpression($e.expressionRet);
    $initializerRet.setLine($e.expressionRet.getLine());} )
    |
    {$initializerRet = new Initializer();}
    (l = LeftBrace{$initializerRet.setLine($l.line);})
     (i = initializerList{$initializerRet.setInitializerList($i.initializerListRet);} )
     Comma? RightBrace ;

initializerList returns [InitializerList initializerListRet]
    : {$initializerListRet = new InitializerList();}
    (d = designation{$initializerListRet.addDesignation($d.designationRet);})?
    (i = initializer {$initializerListRet.addInitializer($i.initializerRet);
    $initializerListRet.setLine($i.initializerRet.getLine());})
    (Comma
    (d1 = designation{$initializerListRet.addDesignation($d1.designationRet);})?
     (i1 = initializer{$initializerListRet.addInitializer($i1.initializerRet);}))* ;

//designation returns [Designation designationRet]
//    : {$designationRet = new Designation();}
//    (d = designator{$designationRet.addDesignator($d.designatorRet);})+
//     Assign ;
designation returns [Designation designationRet]
    : {$designationRet = new Designation();}
      d1 = designator {
          $designationRet.addDesignator($d1.designatorRet);
          $designationRet.setLine($d1.start.getLine());
      }
      (d2 = designator { $designationRet.addDesignator($d2.designatorRet); })*
      Assign
    ;

designator returns [Designator designatorRet]
    : {$designatorRet = new Designator();}
    (l = LeftBracket {$designatorRet.setLine($l.line);})
    (e = expression {$designatorRet.setExpression($e.expressionRet);})
    RightBracket
    |
    {$designatorRet = new Designator();}
    (d = Dot {$designatorRet.setLine($d.line);})
    Identifier ;

//statement returns [Statement statementRet]
//    : compoundStatement {$statementRet = $compoundStatement.compoundStatementRet;}
//    | expressionStatement {$statementRet = $expressionStatement.expressionStatementRet;}
//    | selectionStatement {$statementRet = $selectionStatement.selectionStatementRet;}
//    | iterationStatement {$statementRet = $iterationStatement.iterationStatementRet;}
//    | jumpStatement {$statementRet = $jumpStatement.jumpStatementRet;}
//    ;
statement returns [Statement statementRet]
    : cs=compoundStatement {
        $statementRet = $cs.compoundStatementRet;
        $statementRet.setLine($cs.start.getLine());
    }
    | es=expressionStatement {
        $statementRet = $es.expressionStatementRet;
        $statementRet.setLine($es.start.getLine());
    }
    | ss=selectionStatement {
        $statementRet = $ss.selectionStatementRet;
        $statementRet.setLine($ss.start.getLine());
    }
    | is=iterationStatement {
        $statementRet = $is.iterationStatementRet;
        $statementRet.setLine($is.start.getLine());
    }
    | js=jumpStatement {
        $statementRet = $js.jumpStatementRet;
        $statementRet.setLine($js.start.getLine());
    }
    ;

compoundStatement returns[CompoundStatement compoundStatementRet]
    : {$compoundStatementRet = new CompoundStatement();}
    (l = LeftBrace{$compoundStatementRet.setLine($l.line);})
     ((b = blockItem{$compoundStatementRet.addBlockItem($b.blockItemRet);})+)?
     RightBrace ;

blockItem returns [BlockItem blockItemRet]
    : statement {$blockItemRet = $statement.statementRet;
    $blockItemRet.setLine($statement.statementRet.getLine());}
    | declaration {$blockItemRet = $declaration.declarationRet;
    $blockItemRet.setLine($declaration.declarationRet.getLine());}
    ;

expressionStatement returns [ExpressionStatement expressionStatementRet]
    : {$expressionStatementRet = new ExpressionStatement();}
    (e = expression {$expressionStatementRet.setExpression($e.expressionRet);
    $expressionStatementRet.setLine($e.expressionRet.getLine());}) Semi
    | {$expressionStatementRet = new ExpressionStatement();}
    s = Semi {$expressionStatementRet.setLine($s.line);};

selectionStatement returns [SelectionStatement selectionStatementRet]
    : {$selectionStatementRet = new SelectionStatement();}
    (i = If {$selectionStatementRet.setLine($i.line);})
    LeftParen
    (e = expression {$selectionStatementRet.setExpression($e.expressionRet);})
     RightParen
     (s1 = statement {$selectionStatementRet.setIfStatement($s1.statementRet);})
      (Else s2 = statement{$selectionStatementRet.setElseStatement($s2.statementRet) ;})? ;

//iterationStatement returns [IterationStatement iterationStatementRet]
//    : {$iterationStatementRet = new IterationStatement();}
//    (
//    (w = While {$iterationStatementRet.setLine($w.getLine());})
//    LeftParen
//    (e = expression{$iterationStatementRet.setExpression($e.expressionRet);})
//    RightParen
//    (s = statement {$iterationStatementRet.setStatement($s.statementRet);})
//    | (d = Do {$iterationStatementRet.setLine($d.getLine());})
//     (s = statement{$iterationStatementRet.setStatement($s.statementRet);})
//      While LeftParen
//      (e2 = expression{$iterationStatementRet.setExpression($e2.expressionRet);})
//      RightParen Semi
//    | (f = For{$iterationStatementRet.setLine($f.getLine());})
//     LeftParen
//     (f2 = forCondition {$iterationStatementRet.setForCondition($f2.forConditionRet);})
//     RightParen
//     (s2 = statement{$iterationStatementRet.setStatement($s2.statementRet);})
//     );

iterationStatement returns [IterationStatement iterationStatementRet]
  : w=While {
      $iterationStatementRet = new IterationStatement();
      $iterationStatementRet.setLine($w.getLine());
    } LeftParen e=expression {
      $iterationStatementRet.setExpression($e.expressionRet);
    } RightParen s=statement {
      $iterationStatementRet.setStatement($s.statementRet);
    }

  | d=Do {
      $iterationStatementRet = new IterationStatement();
      $iterationStatementRet.setLine($d.getLine());
    } s=statement {
      $iterationStatementRet.setStatement($s.statementRet);
    } While LeftParen e2=expression {
      $iterationStatementRet.setExpression($e2.expressionRet);
    } RightParen Semi

  | f=For {
      $iterationStatementRet = new IterationStatement();
      $iterationStatementRet.setLine($f.getLine());
    } LeftParen f2=forCondition {
      $iterationStatementRet.setForCondition($f2.forConditionRet);
    } RightParen s2=statement {
      $iterationStatementRet.setStatement($s2.statementRet);
    }
  ;

forCondition returns [ForCondition forConditionRet]
    : {$forConditionRet = new ForCondition();}
    (
    (f = forDeclaration{$forConditionRet.setForDeclaration($f.forDeclarationRet);})
    |
    (e = expression{$forConditionRet.setExpression($e.expressionRet);})?)
    s = Semi {$forConditionRet.setLine($s.line);} /// assuming the first semi is in the first line
    (f1 = forExpression{$forConditionRet.setForExpression1($f1.forExpressionRet);})?
    Semi
    (f2 = forExpression{$forConditionRet.setForExpression2($f2.forExpressionRet);})? ;

forDeclaration returns [ForDeclaration forDeclarationRet]
    : {$forDeclarationRet = new ForDeclaration();}
    (d = declarationSpecifiers
    {$forDeclarationRet.setDeclarationSpecifiers($d.declarationSpecifiersRet);
    $forDeclarationRet.setLine($d.declarationSpecifiersRet.getLine());})
    (i = initDeclaratorList
    {$forDeclarationRet.setInitDeclaratorList($i.initDeclaratorListRet);})? ;

forExpression returns [ForExpression forExpressionRet]
    : {$forExpressionRet = new ForExpression();}
    (e = expression {$forExpressionRet.addExpression($e.expressionRet);
    $forExpressionRet.setLine($e.expressionRet.getLine());})
    (Comma e = expression{$forExpressionRet.addExpression($e.expressionRet);})* ;

jumpStatement returns [JumpStatement jumpStatementRet]
    : {$jumpStatementRet = new JumpStatement();}
      (
        c = Continue {
            $jumpStatementRet.setLine($c.line);
        }
      | b = Break {
            $jumpStatementRet.setLine($b.line);
        }
      | r = Return {
            $jumpStatementRet.setLine($r.line);
        }
        (e = expression {
            $jumpStatementRet.setExpression($e.expressionRet);
        })?
      )
      Semi
    ;

//jumpStatement returns[JumpStatement jumpStatementRet]
//    : {$jumpStatementRet = new JumpStatement();}
//    ( (c = Continue {$jumpStatementRet.setLine($c.line);})
//    | (b = Break{$jumpStatementRet.setLine($b.line);})
//    | (r = Return{$jumpStatementRet.setLine($r.line);})
//    (e = expression{$jumpStatementRet.setExpression($e.expressionRet);})? ) Semi ;

Break                 : 'break'                 ;
Char                  : 'char'                  ;
Const                 : 'const'                 ;
Continue              : 'continue'              ;
Do                    : 'do'                    ;
Double                : 'double'                ;
Else                  : 'else'                  ;
Float                 : 'float'                 ;
For                   : 'for'                   ;
If                    : 'if'                    ;
Int                   : 'int'                   ;
Long                  : 'long'                  ;
Return                : 'return'                ;
Short                 : 'short'                 ;
Signed                : 'signed'                ;
Sizeof                : 'sizeof'                ;
Switch                : 'switch'                ;
Typedef               : 'typedef'               ;
Unsigned              : 'unsigned'              ;
Void                  : 'void'                  ;
While                 : 'while'                 ;
Bool                  : 'bool'                  ;
LeftParen             : '('                     ;
RightParen            : ')'                     ;
LeftBracket           : '['                     ;
RightBracket          : ']'                     ;
LeftBrace             : '{'                     ;
RightBrace            : '}'                     ;
Less                  : '<'                     ;
LessEqual             : '<='                    ;
Greater               : '>'                     ;
GreaterEqual          : '>='                    ;
LeftShift             : '<<'                    ;
RightShift            : '>>'                    ;
Plus                  : '+'                     ;
PlusPlus              : '++'                    ;
Minus                 : '-'                     ;
MinusMinus            : '--'                    ;
Star                  : '*'                     ;
Div                   : '/'                     ;
Mod                   : '%'                     ;
And                   : '&'                     ;
Or                    : '|'                     ;
AndAnd                : '&&'                    ;
OrOr                  : '||'                    ;
Xor                   : '^'                     ;
Not                   : '!'                     ;
Tilde                 : '~'                     ;
Question              : '?'                     ;
Colon                 : ':'                     ;
Semi                  : ';'                     ;
Comma                 : ','                     ;
Assign                : '='                     ;
StarAssign            : '*='                    ;
DivAssign             : '/='                    ;
ModAssign             : '%='                    ;
PlusAssign            : '+='                    ;
MinusAssign           : '-='                    ;
LeftShiftAssign       : '<<='                   ;
RightShiftAssign      : '>>='                   ;
AndAssign             : '&='                    ;
XorAssign             : '^='                    ;
OrAssign              : '|='                    ;
Equal                 : '=='                    ;
NotEqual              : '!='                    ;
Arrow                 : '->'                    ;
Dot                   : '.'                     ;

Identifier
    : IdentifierNondigit (IdentifierNondigit | Digit)* ;

fragment IdentifierNondigit
    : Nondigit | UniversalCharacterName ;

fragment Nondigit
    : [a-zA-Z_] ;

fragment Digit
    : [0-9] ;

fragment UniversalCharacterName
    : '\\u' HexQuad | '\\U' HexQuad HexQuad ;

fragment HexQuad
    : HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit ;

Constant
    : IntegerConstant | FloatingConstant | CharacterConstant ;

fragment IntegerConstant
    : DecimalConstant IntegerSuffix?
    | OctalConstant IntegerSuffix?
    | HexadecimalConstant IntegerSuffix?
    | BinaryConstant ;

fragment BinaryConstant
    : '0' [bB] [0-1]+ ;

fragment DecimalConstant
    : NonzeroDigit Digit* ;

fragment OctalConstant
    : '0' OctalDigit* ;

fragment HexadecimalConstant
    : HexadecimalPrefix HexadecimalDigit+ ;

fragment HexadecimalPrefix
    : '0' [xX] ;

fragment NonzeroDigit
    : [1-9] ;

fragment OctalDigit
    : [0-7] ;

fragment HexadecimalDigit
    : [0-9a-fA-F] ;

fragment IntegerSuffix
    : UnsignedSuffix LongSuffix? | UnsignedSuffix LongLongSuffix | LongSuffix UnsignedSuffix? | LongLongSuffix UnsignedSuffix? ;

fragment UnsignedSuffix
    : [uU] ;

fragment LongSuffix
    : [lL] ;

fragment LongLongSuffix
    : 'll' | 'LL' ;

fragment FloatingConstant
    : DecimalFloatingConstant | HexadecimalFloatingConstant ;

fragment DecimalFloatingConstant
    : FractionalConstant ExponentPart? FloatingSuffix? | DigitSequence ExponentPart FloatingSuffix? ;

fragment HexadecimalFloatingConstant
    : HexadecimalPrefix (HexadecimalFractionalConstant | HexadecimalDigitSequence) BinaryExponentPart FloatingSuffix? ;

fragment FractionalConstant
    : DigitSequence? Dot DigitSequence | DigitSequence Dot ;

fragment ExponentPart
    : [eE] Sign? DigitSequence ;

fragment Sign
    : [+-] ;

DigitSequence
    : Digit+ ;

fragment HexadecimalFractionalConstant
    : HexadecimalDigitSequence? Dot HexadecimalDigitSequence | HexadecimalDigitSequence Dot ;

fragment BinaryExponentPart
    : [pP] Sign? DigitSequence ;

fragment HexadecimalDigitSequence
    : HexadecimalDigit+ ;

fragment FloatingSuffix
    : [flFL] ;

fragment CharacterConstant
    : '\'' CCharSequence '\'' | 'L\'' CCharSequence '\''| 'u\'' CCharSequence '\'' | 'U\'' CCharSequence '\''
    ;

fragment CCharSequence
    : CChar+ ;

fragment CChar
    : ~['\\\r\n] | EscapeSequence ;

fragment EscapeSequence
    : SimpleEscapeSequence | OctalEscapeSequence | HexadecimalEscapeSequence | UniversalCharacterName ;

fragment SimpleEscapeSequence
    : '\\' ['"?abfnrtv\\] ;

fragment OctalEscapeSequence
    : '\\' OctalDigit OctalDigit? OctalDigit? ;

fragment HexadecimalEscapeSequence
    : '\\x' HexadecimalDigit+ ;

StringLiteral
    : EncodingPrefix? '"' SCharSequence? '"' ;

fragment EncodingPrefix
    : 'u8' | 'u' | 'U' | 'L' ;

fragment SCharSequence
    : SChar+ ;

fragment SChar
    : ~["\\\r\n] | EscapeSequence | '\\\n' | '\\\r\n' ;

MultiLineMacro
    : '#' (~[\n]*? '\\' '\r'? '\n')+ ~ [\n]+ -> channel(HIDDEN) ;

Directive
    : '#' ~[\n]* -> channel(HIDDEN) ;

Whitespace
    : [ \t]+ -> channel(HIDDEN) ;

Newline
    : ('\r' '\n'? | '\n') -> channel(HIDDEN) ;

BlockComment
    : '/*' .*? '*/' -> channel(HIDDEN) ;

LineComment
    : '//' ~[\r\n]* -> channel(HIDDEN) ;