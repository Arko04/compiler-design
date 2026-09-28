package main.visitor;

import main.ast.nodes.declaration.*;
import main.ast.nodes.function.*;
import main.ast.nodes.initializer.Designation;
import main.ast.nodes.initializer.Designator;
import main.ast.nodes.initializer.Initializer;
import main.ast.nodes.initializer.InitializerList;
import main.ast.nodes.statement.*;
import main.ast.nodes.type.SpecifierQualifierList;
import main.ast.nodes.type.TypeName;
import main.ast.nodes.expression.*;
import main.ast.nodes.translation.ExternalDeclaration;
import main.ast.nodes.program.Program;
import main.ast.nodes.translation.TranslationUnit;
import main.ast.nodes.type.TypeSpecifier;

public interface IVisitor<T> {

    T visit(Program program);

    T visit(TranslationUnit translationUnit);

    T visit(ExternalDeclaration externalDeclaration);

    T visit(FunctionDefinition functionDefinition);

    T visit(Declaration declaration);

    T visit(DeclarationSpecifiers declarationSpecifier);

    T visit(Declarator declarator);

    T visit(DeclarationList declarationList);

    T visit(CompoundStatement compoundStatement);

    T visit(IdentifierExpression identifier);

    T visit(ConstantExpression constant);

    T visit(StringLiteralExpression stringLiteral);

    T visit(UnaryOperator unaryOperator);

    T visit(TypeName typeName);

    T visit(CastExpression castExpression);

    T visit(DigitSequence digitSequence);

    T visit(ArgumentExpressionList argumentExpressionList);

    T visit(AssignmentOperator assignmentOperator);

    T visit(InitDeclaratorList initDeclaratorList);

    T visit(InitDeclarator initDeclarator);

    T visit(ForExpression forExpression);

    T visit(ForDeclaration forDeclaration);

    T visit(ExpressionStatement expressionStatement);

    T visit(SelectionStatement selectionStatement);

    T visit(JumpStatement jumpStatement);

    T visit(IterationStatement iterationStatement);

    T visit(ForCondition forCondition);

    T visit(Designator designator);

    T visit(Designation designation);

    T visit(InitializerList initializerList);

    T visit(Initializer initializer);

    T visit(Pointer pointer);

    T visit(ParameterList parameterList);

    T visit(ParameterDeclaration parameterDeclaration);

    T visit(IdentifierList identifierList);

    T visit(AbstractDeclarator abstractDeclarator);

    T visit(DirectAbstractDeclarator directAbstractDeclarator);

    T visit(DeclarationSpecifier declarationSpecifier);

    T visit(IdentifierDeclarator identifierDeclarator);

    T visit(ParenDeclarator parenDeclarator);

    T visit(ArrayDeclarator arrayDeclarator);

    T visit(FunctionDeclarator functionDeclarator);

//    T visit(DirectDeclarator directDeclarator);

    T visit(TypeSpecifier typeSpecifier);

    T visit(SpecifierQualifierList specifierQualifierList);

    T visit(BinaryExpression binaryExpression);

    T visit(ArrayAccessExpression arrayAccessExpression);

    T visit(PostfixExpression postfixExpression);

    T visit(FunctionCallExpression functionCallExpression);

    T visit(ParenExpression parenExpression);

    T visit(TernaryExpression ternaryExpression);

    T visit(AssignmentExpression assignmentExpression);

    T visit(CommaExpression commaExpression);

    T visit(CompoundLiteralExpression compoundLiteralExpression);

    T visit(TypeCastExpression typeCastExpression);

    T visit(PrefixExpression prefixExpression);

    T visit(DirectDeclarator directDeclarator);
}
