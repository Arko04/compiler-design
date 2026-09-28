// Generated from /Users/alireza/Documents/uni/term6/PLC/CA/1/SimpleLang/src/main/grammar/SimpleLang.g4 by ANTLR 4.13.2
package main.grammar;

   import main.ast.nodes.program.*;
   import main.ast.nodes.translation.*;
   import main.ast.nodes.function.*;
   import main.ast.nodes.declaration.*;
   import main.ast.nodes.statement.*;
   import main.ast.nodes.expression.*;
   import main.ast.nodes.type.*;
   import main.ast.nodes.initializer.*;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Break=1, Char=2, Const=3, Continue=4, Do=5, Double=6, Else=7, Float=8, 
		For=9, If=10, Int=11, Long=12, Return=13, Short=14, Signed=15, Sizeof=16, 
		Switch=17, Typedef=18, Unsigned=19, Void=20, While=21, Bool=22, LeftParen=23, 
		RightParen=24, LeftBracket=25, RightBracket=26, LeftBrace=27, RightBrace=28, 
		Less=29, LessEqual=30, Greater=31, GreaterEqual=32, LeftShift=33, RightShift=34, 
		Plus=35, PlusPlus=36, Minus=37, MinusMinus=38, Star=39, Div=40, Mod=41, 
		And=42, Or=43, AndAnd=44, OrOr=45, Xor=46, Not=47, Tilde=48, Question=49, 
		Colon=50, Semi=51, Comma=52, Assign=53, StarAssign=54, DivAssign=55, ModAssign=56, 
		PlusAssign=57, MinusAssign=58, LeftShiftAssign=59, RightShiftAssign=60, 
		AndAssign=61, XorAssign=62, OrAssign=63, Equal=64, NotEqual=65, Arrow=66, 
		Dot=67, Identifier=68, Constant=69, DigitSequence=70, StringLiteral=71, 
		MultiLineMacro=72, Directive=73, Whitespace=74, Newline=75, BlockComment=76, 
		LineComment=77;
	public static final int
		RULE_program = 0, RULE_translationUnit = 1, RULE_externalDeclaration = 2, 
		RULE_functionDefinition = 3, RULE_declarationList = 4, RULE_expression = 5, 
		RULE_argumentExpressionList = 6, RULE_unaryOperator = 7, RULE_castExpression = 8, 
		RULE_assignmentOperator = 9, RULE_declaration = 10, RULE_declarationSpecifiers = 11, 
		RULE_declarationSpecifier = 12, RULE_initDeclaratorList = 13, RULE_initDeclarator = 14, 
		RULE_typeSpecifier = 15, RULE_specifierQualifierList = 16, RULE_declarator = 17, 
		RULE_directDeclarator = 18, RULE_pointer = 19, RULE_parameterList = 20, 
		RULE_parameterDeclaration = 21, RULE_identifierList = 22, RULE_typeName = 23, 
		RULE_abstractDeclarator = 24, RULE_directAbstractDeclarator = 25, RULE_initializer = 26, 
		RULE_initializerList = 27, RULE_designation = 28, RULE_designator = 29, 
		RULE_statement = 30, RULE_compoundStatement = 31, RULE_blockItem = 32, 
		RULE_expressionStatement = 33, RULE_selectionStatement = 34, RULE_iterationStatement = 35, 
		RULE_forCondition = 36, RULE_forDeclaration = 37, RULE_forExpression = 38, 
		RULE_jumpStatement = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "translationUnit", "externalDeclaration", "functionDefinition", 
			"declarationList", "expression", "argumentExpressionList", "unaryOperator", 
			"castExpression", "assignmentOperator", "declaration", "declarationSpecifiers", 
			"declarationSpecifier", "initDeclaratorList", "initDeclarator", "typeSpecifier", 
			"specifierQualifierList", "declarator", "directDeclarator", "pointer", 
			"parameterList", "parameterDeclaration", "identifierList", "typeName", 
			"abstractDeclarator", "directAbstractDeclarator", "initializer", "initializerList", 
			"designation", "designator", "statement", "compoundStatement", "blockItem", 
			"expressionStatement", "selectionStatement", "iterationStatement", "forCondition", 
			"forDeclaration", "forExpression", "jumpStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'char'", "'const'", "'continue'", "'do'", "'double'", 
			"'else'", "'float'", "'for'", "'if'", "'int'", "'long'", "'return'", 
			"'short'", "'signed'", "'sizeof'", "'switch'", "'typedef'", "'unsigned'", 
			"'void'", "'while'", "'bool'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", 
			"'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", 
			"'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Break", "Char", "Const", "Continue", "Do", "Double", "Else", "Float", 
			"For", "If", "Int", "Long", "Return", "Short", "Signed", "Sizeof", "Switch", 
			"Typedef", "Unsigned", "Void", "While", "Bool", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", 
			"Greater", "GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", 
			"Minus", "MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", 
			"Xor", "Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Assign", 
			"StarAssign", "DivAssign", "ModAssign", "PlusAssign", "MinusAssign", 
			"LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", 
			"Equal", "NotEqual", "Arrow", "Dot", "Identifier", "Constant", "DigitSequence", 
			"StringLiteral", "MultiLineMacro", "Directive", "Whitespace", "Newline", 
			"BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public TranslationUnitContext tu;
		public Token eof;
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SimpleLangParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Const:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Typedef:
			case Unsigned:
			case Void:
			case Bool:
			case LeftParen:
			case Star:
			case Semi:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				((ProgramContext)_localctx).programRet =  new Program();
				setState(81);
				((ProgramContext)_localctx).tu = translationUnit();

				          _localctx.programRet.setTranslationUnit(((ProgramContext)_localctx).tu.translationUnitRet);
				          _localctx.programRet.setLine(((ProgramContext)_localctx).tu.translationUnitRet.getLine());
				      
				setState(83);
				((ProgramContext)_localctx).eof = match(EOF);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				((ProgramContext)_localctx).programRet =  new Program();
				setState(86);
				((ProgramContext)_localctx).eof = match(EOF);
				_localctx.programRet.setLine((((ProgramContext)_localctx).eof!=null?((ProgramContext)_localctx).eof.getLine():0)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public TranslationUnit translationUnitRet;
		public ExternalDeclarationContext e1;
		public ExternalDeclarationContext eRest;
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TranslationUnitContext)_localctx).translationUnitRet =  new TranslationUnit();
			setState(91);
			((TranslationUnitContext)_localctx).e1 = externalDeclaration();

			          _localctx.translationUnitRet.addExternalDeclaration(((TranslationUnitContext)_localctx).e1.externalDeclarationRet);
			          _localctx.translationUnitRet.setLine(((TranslationUnitContext)_localctx).e1.externalDeclarationRet.getLine());
			      
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2252349583972684L) != 0) || _la==Identifier) {
				{
				{
				setState(93);
				((TranslationUnitContext)_localctx).eRest = externalDeclaration();

				          _localctx.translationUnitRet.addExternalDeclaration(((TranslationUnitContext)_localctx).eRest.externalDeclarationRet);
				      
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExternalDeclarationContext extends ParserRuleContext {
		public ExternalDeclaration externalDeclarationRet;
		public FunctionDefinitionContext f;
		public DeclarationContext d;
		public Token s;
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExternalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_externalDeclaration);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				((ExternalDeclarationContext)_localctx).f = functionDefinition();

				        ((ExternalDeclarationContext)_localctx).externalDeclarationRet =  new ExternalDeclaration();
				        _localctx.externalDeclarationRet.setFunctionDefinition(((ExternalDeclarationContext)_localctx).f.functionDefinitionRet);
				        _localctx.externalDeclarationRet.setLine(((ExternalDeclarationContext)_localctx).f.functionDefinitionRet.getLine());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				((ExternalDeclarationContext)_localctx).d = declaration();

				        ((ExternalDeclarationContext)_localctx).externalDeclarationRet =  new ExternalDeclaration();
				        _localctx.externalDeclarationRet.setDeclaration(((ExternalDeclarationContext)_localctx).d.declarationRet);
				        _localctx.externalDeclarationRet.setLine(((ExternalDeclarationContext)_localctx).d.declarationRet.getLine());
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				((ExternalDeclarationContext)_localctx).s = match(Semi);

				        ((ExternalDeclarationContext)_localctx).externalDeclarationRet =  new ExternalDeclaration();
				        _localctx.externalDeclarationRet.setLine((((ExternalDeclarationContext)_localctx).s!=null?((ExternalDeclarationContext)_localctx).s.getLine():0));
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDefinition functionDefinitionRet;
		public DeclarationSpecifiersContext ds;
		public DeclaratorContext dr;
		public DeclarationListContext dl;
		public CompoundStatementContext cs;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FunctionDefinitionContext)_localctx).functionDefinitionRet =  new FunctionDefinition();
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(112);
				((FunctionDefinitionContext)_localctx).ds = declarationSpecifiers();

				          _localctx.functionDefinitionRet.setDeclarationSpecifiers(((FunctionDefinitionContext)_localctx).ds.declarationSpecifiersRet);
				      
				}
				break;
			}
			setState(117);
			((FunctionDefinitionContext)_localctx).dr = declarator();

			          _localctx.functionDefinitionRet.setDeclarator(((FunctionDefinitionContext)_localctx).dr.declaratorRet);
			          _localctx.functionDefinitionRet.setLine(((FunctionDefinitionContext)_localctx).dr.declaratorRet.getLine());
			      
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6084940L) != 0) || _la==Identifier) {
				{
				setState(119);
				((FunctionDefinitionContext)_localctx).dl = declarationList();

				          _localctx.functionDefinitionRet.setDeclarationList(((FunctionDefinitionContext)_localctx).dl.declarationListRet);
				      
				}
			}

			setState(124);
			((FunctionDefinitionContext)_localctx).cs = compoundStatement();

			          _localctx.functionDefinitionRet.setCompoundStatement(((FunctionDefinitionContext)_localctx).cs.compoundStatementRet);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationList declarationListRet;
		public DeclarationContext d1;
		public DeclarationContext dRest;
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((DeclarationListContext)_localctx).d1 = declaration();

			          ((DeclarationListContext)_localctx).declarationListRet =  new DeclarationList();
			          _localctx.declarationListRet.addDeclaration(((DeclarationListContext)_localctx).d1.declarationRet);
			          _localctx.declarationListRet.setLine(((DeclarationListContext)_localctx).d1.declarationRet.getLine());
			      
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6084940L) != 0) || _la==Identifier) {
				{
				{
				setState(129);
				((DeclarationListContext)_localctx).dRest = declaration();

				          _localctx.declarationListRet.addDeclaration(((DeclarationListContext)_localctx).dRest.declarationRet);
				      
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression expressionRet;
		public ExpressionContext e1;
		public ExpressionContext e;
		public ExpressionContext ep;
		public ExpressionContext left;
		public ExpressionContext cond;
		public ExpressionContext lhs;
		public Token i;
		public Token c;
		public Token StringLiteral;
		public List<Token> sl = new ArrayList<Token>();
		public Token lllp;
		public ExpressionContext exp;
		public Token lp;
		public TypeNameContext tn;
		public InitializerListContext il;
		public Token prefix;
		public Token id;
		public Token ct;
		public Token s1;
		public Token s2;
		public ExpressionContext parenp;
		public Token llp;
		public TypeNameContext tpn;
		public InitializerListContext ill;
		public UnaryOperatorContext up;
		public CastExpressionContext cep;
		public Token sz;
		public TypeNameContext tpnm;
		public CastExpressionContext ce;
		public Token opts;
		public ExpressionContext right;
		public Token qq;
		public ExpressionContext thenExpr;
		public ExpressionContext elseExpr;
		public AssignmentOperatorContext asop;
		public ExpressionContext rhs;
		public Token lb;
		public ExpressionContext e2;
		public Token rb;
		public ArgumentExpressionListContext ael;
		public Token pf;
		public ExpressionContext ec;
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(SimpleLangParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(SimpleLangParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(SimpleLangParser.StringLiteral, i);
		}
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LeftBrace() { return getToken(SimpleLangParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(SimpleLangParser.RightBrace, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public List<TerminalNode> Sizeof() { return getTokens(SimpleLangParser.Sizeof); }
		public TerminalNode Sizeof(int i) {
			return getToken(SimpleLangParser.Sizeof, i);
		}
		public List<TerminalNode> PlusPlus() { return getTokens(SimpleLangParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(SimpleLangParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(SimpleLangParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(SimpleLangParser.MinusMinus, i);
		}
		public TerminalNode Star() { return getToken(SimpleLangParser.Star, 0); }
		public TerminalNode Div() { return getToken(SimpleLangParser.Div, 0); }
		public TerminalNode Mod() { return getToken(SimpleLangParser.Mod, 0); }
		public TerminalNode Plus() { return getToken(SimpleLangParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleLangParser.Minus, 0); }
		public TerminalNode LeftShift() { return getToken(SimpleLangParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(SimpleLangParser.RightShift, 0); }
		public TerminalNode Less() { return getToken(SimpleLangParser.Less, 0); }
		public TerminalNode Greater() { return getToken(SimpleLangParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(SimpleLangParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(SimpleLangParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(SimpleLangParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(SimpleLangParser.NotEqual, 0); }
		public TerminalNode And() { return getToken(SimpleLangParser.And, 0); }
		public TerminalNode Xor() { return getToken(SimpleLangParser.Xor, 0); }
		public TerminalNode Or() { return getToken(SimpleLangParser.Or, 0); }
		public TerminalNode AndAnd() { return getToken(SimpleLangParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(SimpleLangParser.OrOr, 0); }
		public TerminalNode Colon() { return getToken(SimpleLangParser.Colon, 0); }
		public TerminalNode Question() { return getToken(SimpleLangParser.Question, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(138);
				((ExpressionContext)_localctx).i = match(Identifier);

				      ((ExpressionContext)_localctx).expressionRet =  new IdentifierExpression(((ExpressionContext)_localctx).i.getText());
				      _localctx.expressionRet.setLine(((ExpressionContext)_localctx).i.getLine());
				    
				}
				break;
			case 2:
				{
				setState(140);
				((ExpressionContext)_localctx).c = match(Constant);

				      ((ExpressionContext)_localctx).expressionRet =  new ConstantExpression(((ExpressionContext)_localctx).c.getText());
				      _localctx.expressionRet.setLine(((ExpressionContext)_localctx).c.getLine());
				    
				}
				break;
			case 3:
				{
				setState(143); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(142);
						((ExpressionContext)_localctx).StringLiteral = match(StringLiteral);
						((ExpressionContext)_localctx).sl.add(((ExpressionContext)_localctx).StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(145); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				      List<String> values = new ArrayList<>();
				      for (Token t : ((ExpressionContext)_localctx).sl) values.add(t.getText());
				      ((ExpressionContext)_localctx).expressionRet =  new StringLiteralExpression(values);
				      _localctx.expressionRet.setLine(((ExpressionContext)_localctx).sl.get(0).getLine());
				    
				}
				break;
			case 4:
				{
				setState(148);
				((ExpressionContext)_localctx).lllp = match(LeftParen);
				setState(149);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(150);
				match(RightParen);
				((ExpressionContext)_localctx).expressionRet =  new ParenExpression(((ExpressionContext)_localctx).exp.expressionRet);
				   _localctx.expressionRet.setLine((((ExpressionContext)_localctx).lllp!=null?((ExpressionContext)_localctx).lllp.getLine():0));
				}
				break;
			case 5:
				{
				setState(153);
				((ExpressionContext)_localctx).lp = match(LeftParen);
				setState(154);
				((ExpressionContext)_localctx).tn = typeName();
				setState(155);
				match(RightParen);
				setState(156);
				match(LeftBrace);
				setState(157);
				((ExpressionContext)_localctx).il = initializerList();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(158);
					match(Comma);
					}
				}

				setState(161);
				match(RightBrace);
				((ExpressionContext)_localctx).expressionRet =  new CompoundLiteralExpression();
				  ((CompoundLiteralExpression)_localctx.expressionRet).setTypeName(((ExpressionContext)_localctx).tn.typeNameRet);
				  ((CompoundLiteralExpression)_localctx.expressionRet).setInitializerList(((ExpressionContext)_localctx).il.initializerListRet);
				  _localctx.expressionRet.setLine((((ExpressionContext)_localctx).lp!=null?((ExpressionContext)_localctx).lp.getLine():0));
				  
				}
				break;
			case 6:
				{
				((ExpressionContext)_localctx).expressionRet =  new PrefixExpression();
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(165);
						((ExpressionContext)_localctx).prefix = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 343597449216L) != 0)) ) {
							((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						((PrefixExpression)_localctx.expressionRet).addPrefix((((ExpressionContext)_localctx).prefix!=null?((ExpressionContext)_localctx).prefix.getText():null));
						}
						} 
					}
					setState(171);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(172);
					((ExpressionContext)_localctx).id = match(Identifier);
					((PrefixExpression)_localctx.expressionRet).setIdentifier((((ExpressionContext)_localctx).id!=null?((ExpressionContext)_localctx).id.getText():null));
					       _localctx.expressionRet.setLine((((ExpressionContext)_localctx).id!=null?((ExpressionContext)_localctx).id.getLine():0));
					}
					break;
				case 2:
					{
					setState(174);
					((ExpressionContext)_localctx).ct = match(Constant);
					((PrefixExpression)_localctx.expressionRet).setConstant((((ExpressionContext)_localctx).ct!=null?((ExpressionContext)_localctx).ct.getText():null));
					       _localctx.expressionRet.setLine((((ExpressionContext)_localctx).ct!=null?((ExpressionContext)_localctx).ct.getLine():0));
					}
					break;
				case 3:
					{
					setState(176);
					((ExpressionContext)_localctx).s1 = match(StringLiteral);

					       ((PrefixExpression)_localctx.expressionRet).addStringLiteral((((ExpressionContext)_localctx).s1!=null?((ExpressionContext)_localctx).s1.getText():null));
					       _localctx.expressionRet.setLine((((ExpressionContext)_localctx).s1!=null?((ExpressionContext)_localctx).s1.getLine():0));
					       
					setState(182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(178);
							((ExpressionContext)_localctx).s2 = match(StringLiteral);
							((PrefixExpression)_localctx.expressionRet).addStringLiteral((((ExpressionContext)_localctx).s2!=null?((ExpressionContext)_localctx).s2.getText():null));
							}
							} 
						}
						setState(184);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					}
					break;
				case 4:
					{
					setState(185);
					((ExpressionContext)_localctx).lp = match(LeftParen);
					setState(186);
					((ExpressionContext)_localctx).parenp = expression(0);
					setState(187);
					match(RightParen);

					       ((PrefixExpression)_localctx.expressionRet).setExpression(((ExpressionContext)_localctx).parenp.expressionRet);
					       _localctx.expressionRet.setLine((((ExpressionContext)_localctx).lp!=null?((ExpressionContext)_localctx).lp.getLine():0));
					       
					}
					break;
				case 5:
					{
					setState(190);
					((ExpressionContext)_localctx).llp = match(LeftParen);
					setState(191);
					((ExpressionContext)_localctx).tpn = typeName();
					setState(192);
					match(RightParen);
					setState(193);
					match(LeftBrace);
					setState(194);
					((ExpressionContext)_localctx).ill = initializerList();
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(195);
						match(Comma);
						}
					}

					setState(198);
					match(RightBrace);

					        ((PrefixExpression)_localctx.expressionRet).setTypeName(((ExpressionContext)_localctx).tpn.typeNameRet);
					        ((PrefixExpression)_localctx.expressionRet).setInitializerList(((ExpressionContext)_localctx).ill.initializerListRet);
					         _localctx.expressionRet.setLine((((ExpressionContext)_localctx).llp!=null?((ExpressionContext)_localctx).llp.getLine():0));
					         
					}
					break;
				case 6:
					{
					setState(201);
					((ExpressionContext)_localctx).up = unaryOperator();
					setState(202);
					((ExpressionContext)_localctx).cep = castExpression();

					       ((PrefixExpression)_localctx.expressionRet).setLine(((ExpressionContext)_localctx).up.unaryOperatorRet.getLine());
					       ((PrefixExpression)_localctx.expressionRet).setUnaryOperator(((ExpressionContext)_localctx).up.unaryOperatorRet);
					       ((PrefixExpression)_localctx.expressionRet).setCastExpression(((ExpressionContext)_localctx).cep.castExpressionRet);
					       
					}
					break;
				case 7:
					{
					setState(205);
					((ExpressionContext)_localctx).sz = match(Sizeof);
					setState(206);
					match(LeftParen);
					setState(207);
					((ExpressionContext)_localctx).tpnm = typeName();
					setState(208);
					match(RightParen);
					((PrefixExpression)_localctx.expressionRet).setTypeName(((ExpressionContext)_localctx).tpnm.typeNameRet);
					       _localctx.expressionRet.setLine((((ExpressionContext)_localctx).sz!=null?((ExpressionContext)_localctx).sz.getLine():0));
					}
					break;
				}
				}
				break;
			case 7:
				{
				setState(213);
				((ExpressionContext)_localctx).lp = match(LeftParen);
				setState(214);
				((ExpressionContext)_localctx).tn = typeName();
				setState(215);
				match(RightParen);
				setState(216);
				((ExpressionContext)_localctx).ce = castExpression();
				((ExpressionContext)_localctx).expressionRet =  new TypeCastExpression();
				   ((TypeCastExpression)_localctx.expressionRet).setTypeName(((ExpressionContext)_localctx).tn.typeNameRet);
				   ((TypeCastExpression)_localctx.expressionRet).setCastExpression(((ExpressionContext)_localctx).ce.castExpressionRet);
				   _localctx.expressionRet.setLine((((ExpressionContext)_localctx).lp!=null?((ExpressionContext)_localctx).lp.getLine():0));
				  
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(266);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(222);
						((ExpressionContext)_localctx).opts = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & 103079476607L) != 0)) ) {
							((ExpressionContext)_localctx).opts = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(223);
						((ExpressionContext)_localctx).right = expression(5);

						                ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).left.expressionRet, (((ExpressionContext)_localctx).opts!=null?((ExpressionContext)_localctx).opts.getText():null), ((ExpressionContext)_localctx).right.expressionRet);
						                _localctx.expressionRet.setLine(((ExpressionContext)_localctx).opts.getLine());
						              
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.cond = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(227);
						((ExpressionContext)_localctx).qq = match(Question);
						setState(228);
						((ExpressionContext)_localctx).thenExpr = expression(0);
						setState(229);
						match(Colon);
						setState(230);
						((ExpressionContext)_localctx).elseExpr = expression(4);

						                  ((ExpressionContext)_localctx).expressionRet =  new TernaryExpression(
						                    ((ExpressionContext)_localctx).cond.expressionRet,
						                    ((ExpressionContext)_localctx).thenExpr.expressionRet,
						                    ((ExpressionContext)_localctx).elseExpr.expressionRet
						                  );
						                  _localctx.expressionRet.setLine((((ExpressionContext)_localctx).qq!=null?((ExpressionContext)_localctx).qq.getLine():0));
						                
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(234);
						((ExpressionContext)_localctx).asop = assignmentOperator();
						setState(235);
						((ExpressionContext)_localctx).rhs = expression(3);

						                  ((ExpressionContext)_localctx).expressionRet =  new AssignmentExpression(
						                    ((ExpressionContext)_localctx).lhs.expressionRet,
						                    ((ExpressionContext)_localctx).rhs.expressionRet,
						                    ((ExpressionContext)_localctx).asop.assignmentOperatorRet
						                  );
						                  ((AssignmentExpression)_localctx.expressionRet).setLine(((ExpressionContext)_localctx).lhs.expressionRet.getLine());
						                
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(239);
						((ExpressionContext)_localctx).lb = match(LeftBracket);
						setState(240);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(241);
						((ExpressionContext)_localctx).rb = match(RightBracket);
						((ExpressionContext)_localctx).expressionRet =  new ArrayAccessExpression();
						             ((ArrayAccessExpression)_localctx.expressionRet).setLine(((ExpressionContext)_localctx).e1.expressionRet.getLine());/////
						             ((ArrayAccessExpression)_localctx.expressionRet).setOuterExpression(((ExpressionContext)_localctx).e1.expressionRet);
						             ((ArrayAccessExpression)_localctx.expressionRet).setInnerExpression(((ExpressionContext)_localctx).e2.expressionRet);
						             
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");

						            ((ExpressionContext)_localctx).expressionRet =  new FunctionCallExpression();
						            ((FunctionCallExpression)_localctx.expressionRet).setLine(((ExpressionContext)_localctx).e.expressionRet.getLine());
						            ((FunctionCallExpression)_localctx.expressionRet).setExpression(((ExpressionContext)_localctx).e.expressionRet);
						            
						setState(246);
						match(LeftParen);
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
							{
							setState(247);
							((ExpressionContext)_localctx).ael = argumentExpressionList();
							((FunctionCallExpression)_localctx.expressionRet)
							            .setArgumentExpressionList(((ExpressionContext)_localctx).ael.argumentExpressionListRet);
							}
						}

						setState(252);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ep = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(254);
						((ExpressionContext)_localctx).pf = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PlusPlus || _la==MinusMinus) ) {
							((ExpressionContext)_localctx).pf = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						((ExpressionContext)_localctx).expressionRet =  new PostfixExpression(((ExpressionContext)_localctx).ep.expressionRet,(((ExpressionContext)_localctx).pf!=null?((ExpressionContext)_localctx).pf.getText():null) );
						             _localctx.expressionRet.setLine((((ExpressionContext)_localctx).pf!=null?((ExpressionContext)_localctx).pf.getLine():0));
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						((ExpressionContext)_localctx).expressionRet =  new CommaExpression();
						            ((CommaExpression)_localctx.expressionRet).setLine(((ExpressionContext)_localctx).e1.expressionRet.getLine());
						            ((CommaExpression)_localctx.expressionRet).addExpression(((ExpressionContext)_localctx).e1.expressionRet);
						setState(262); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(258);
								match(Comma);
								setState(259);
								((ExpressionContext)_localctx).ec = expression(0);
								((CommaExpression)_localctx.expressionRet).addExpression(((ExpressionContext)_localctx).ec.expressionRet);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(264); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public ArgumentExpressionList argumentExpressionListRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			      ((ArgumentExpressionListContext)_localctx).argumentExpressionListRet =  new ArgumentExpressionList();
			    
			setState(272);
			((ArgumentExpressionListContext)_localctx).e1 = expression(0);

			      _localctx.argumentExpressionListRet.addExpression(((ArgumentExpressionListContext)_localctx).e1.expressionRet);
			      _localctx.argumentExpressionListRet.setLine(((ArgumentExpressionListContext)_localctx).e1.expressionRet.getLine()); // set line from first expression
			    
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(274);
				match(Comma);
				setState(275);
				((ArgumentExpressionListContext)_localctx).e2 = expression(0);

				      _localctx.argumentExpressionListRet.addExpression(((ArgumentExpressionListContext)_localctx).e2.expressionRet);
				    
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperator unaryOperatorRet;
		public Token op;
		public TerminalNode And() { return getToken(SimpleLangParser.And, 0); }
		public TerminalNode Star() { return getToken(SimpleLangParser.Star, 0); }
		public TerminalNode Plus() { return getToken(SimpleLangParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleLangParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(SimpleLangParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(SimpleLangParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			((UnaryOperatorContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 427332066082816L) != 0)) ) {
				((UnaryOperatorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 ((UnaryOperatorContext)_localctx).unaryOperatorRet =  new UnaryOperator(((UnaryOperatorContext)_localctx).op.getText());
			      _localctx.unaryOperatorRet.setLine(((UnaryOperatorContext)_localctx).op.getLine()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpression castExpressionRet;
		public Token l1;
		public TypeNameContext t;
		public CastExpressionContext c;
		public ExpressionContext e;
		public Token d;
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(SimpleLangParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_castExpression);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				((CastExpressionContext)_localctx).l1 = match(LeftParen);

				          ((CastExpressionContext)_localctx).castExpressionRet =  new CastExpression();
				          _localctx.castExpressionRet.setLine(((CastExpressionContext)_localctx).l1.getLine());
				      
				setState(288);
				((CastExpressionContext)_localctx).t = typeName();

				          _localctx.castExpressionRet.setTypeName(((CastExpressionContext)_localctx).t.typeNameRet);
				      
				setState(290);
				match(RightParen);
				setState(291);
				((CastExpressionContext)_localctx).c = castExpression();

				          _localctx.castExpressionRet.setCastExpression(((CastExpressionContext)_localctx).c.castExpressionRet);
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				((CastExpressionContext)_localctx).e = expression(0);

				          ((CastExpressionContext)_localctx).castExpressionRet =  new CastExpression();
				          _localctx.castExpressionRet.setExpression(((CastExpressionContext)_localctx).e.expressionRet);
				          _localctx.castExpressionRet.setLine(((CastExpressionContext)_localctx).e.expressionRet.getLine());
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				((CastExpressionContext)_localctx).d = match(DigitSequence);

				          ((CastExpressionContext)_localctx).castExpressionRet =  new CastExpression();
				          _localctx.castExpressionRet.setLine(((CastExpressionContext)_localctx).d.getLine());
				          _localctx.castExpressionRet.setDigitSequence(new DigitSequence(((CastExpressionContext)_localctx).d.getText()));
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperator assignmentOperatorRet;
		public Token op;
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(SimpleLangParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(SimpleLangParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(SimpleLangParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(SimpleLangParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(SimpleLangParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(SimpleLangParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(SimpleLangParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(SimpleLangParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(SimpleLangParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(SimpleLangParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((AssignmentOperatorContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -9007199254740992L) != 0)) ) {
				((AssignmentOperatorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			      ((AssignmentOperatorContext)_localctx).assignmentOperatorRet =  new AssignmentOperator();
			      _localctx.assignmentOperatorRet.setOperator((((AssignmentOperatorContext)_localctx).op!=null?((AssignmentOperatorContext)_localctx).op.getText():null));
			      _localctx.assignmentOperatorRet.setLine((((AssignmentOperatorContext)_localctx).op!=null?((AssignmentOperatorContext)_localctx).op.getLine():0));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Declaration declarationRet;
		public DeclarationSpecifiersContext d;
		public InitDeclaratorListContext i;
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DeclarationContext)_localctx).declarationRet =  new Declaration();
			{
			setState(305);
			((DeclarationContext)_localctx).d = declarationSpecifiers();

			    _localctx.declarationRet.setDeclarationSpecifiers(((DeclarationContext)_localctx).d.declarationSpecifiersRet);
			    _localctx.declarationRet.setLine(((DeclarationContext)_localctx).d.declarationSpecifiersRet.getLine());
			}
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 35184372154369L) != 0)) {
				{
				setState(308);
				((DeclarationContext)_localctx).i = initDeclaratorList();
				_localctx.declarationRet.setInitDeclaratorList(((DeclarationContext)_localctx).i.initDeclaratorListRet);
				}
			}

			setState(313);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public DeclarationSpecifiers declarationSpecifiersRet;
		public DeclarationSpecifierContext ds;
		public DeclarationSpecifierContext ds1;
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			((DeclarationSpecifiersContext)_localctx).ds = declarationSpecifier();

			        ((DeclarationSpecifiersContext)_localctx).declarationSpecifiersRet =  new DeclarationSpecifiers();
			        _localctx.declarationSpecifiersRet.addDeclarationSpecifier(((DeclarationSpecifiersContext)_localctx).ds.declarationSpecifierRet);
			        _localctx.declarationSpecifiersRet.setLine(((DeclarationSpecifiersContext)_localctx).ds.declarationSpecifierRet.getLine());
			      
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(317);
					((DeclarationSpecifiersContext)_localctx).ds1 = declarationSpecifier();

					        _localctx.declarationSpecifiersRet.addDeclarationSpecifier(((DeclarationSpecifiersContext)_localctx).ds1.declarationSpecifierRet);
					      
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public DeclarationSpecifier declarationSpecifierRet;
		public Token td;
		public TypeSpecifierContext ts;
		public Token c;
		public TerminalNode Typedef() { return getToken(SimpleLangParser.Typedef, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Const() { return getToken(SimpleLangParser.Const, 0); }
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declarationSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DeclarationSpecifierContext)_localctx).declarationSpecifierRet =  new DeclarationSpecifier();
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Typedef:
				{
				{
				setState(326);
				((DeclarationSpecifierContext)_localctx).td = match(Typedef);
				_localctx.declarationSpecifierRet.setLine((((DeclarationSpecifierContext)_localctx).td!=null?((DeclarationSpecifierContext)_localctx).td.getLine():0));
				}
				}
				break;
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Identifier:
				{
				{
				setState(328);
				((DeclarationSpecifierContext)_localctx).ts = typeSpecifier();

				    _localctx.declarationSpecifierRet.setTypeSpecifier(((DeclarationSpecifierContext)_localctx).ts.typeSpecifierRet);
				    _localctx.declarationSpecifierRet.setLine(((DeclarationSpecifierContext)_localctx).ts.typeSpecifierRet.getLine());
				}
				}
				break;
			case Const:
				{
				{
				setState(331);
				((DeclarationSpecifierContext)_localctx).c = match(Const);
				{_localctx.declarationSpecifierRet.setLine((((DeclarationSpecifierContext)_localctx).c!=null?((DeclarationSpecifierContext)_localctx).c.getLine():0));}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorList initDeclaratorListRet;
		public InitDeclaratorContext i1;
		public InitDeclaratorContext i2;
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InitDeclaratorListContext)_localctx).initDeclaratorListRet =  new InitDeclaratorList();
			{
			setState(336);
			((InitDeclaratorListContext)_localctx).i1 = initDeclarator();

			    _localctx.initDeclaratorListRet.addInitDeclarator(((InitDeclaratorListContext)_localctx).i1.initDeclaratorRet);
			    _localctx.initDeclaratorListRet.setLine(((InitDeclaratorListContext)_localctx).i1.initDeclaratorRet.getLine());
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(339);
				match(Comma);
				setState(340);
				((InitDeclaratorListContext)_localctx).i2 = initDeclarator();
				_localctx.initDeclaratorListRet.addInitDeclarator(((InitDeclaratorListContext)_localctx).i2.initDeclaratorRet);
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorContext extends ParserRuleContext {
		public InitDeclarator initDeclaratorRet;
		public DeclaratorContext d;
		public InitializerContext i;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InitDeclaratorContext)_localctx).initDeclaratorRet =  new InitDeclarator();
			{
			setState(349);
			((InitDeclaratorContext)_localctx).d = declarator();
			_localctx.initDeclaratorRet.setDeclarator(((InitDeclaratorContext)_localctx).d.declaratorRet);
			    _localctx.initDeclaratorRet.setLine(((InitDeclaratorContext)_localctx).d.declaratorRet.getLine());
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(352);
				match(Assign);
				setState(353);
				((InitDeclaratorContext)_localctx).i = initializer();
				_localctx.initDeclaratorRet.setInitializer(((InitDeclaratorContext)_localctx).i.initializerRet);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifier typeSpecifierRet;
		public Token t;
		public TerminalNode Void() { return getToken(SimpleLangParser.Void, 0); }
		public TerminalNode Char() { return getToken(SimpleLangParser.Char, 0); }
		public TerminalNode Short() { return getToken(SimpleLangParser.Short, 0); }
		public TerminalNode Int() { return getToken(SimpleLangParser.Int, 0); }
		public TerminalNode Long() { return getToken(SimpleLangParser.Long, 0); }
		public TerminalNode Float() { return getToken(SimpleLangParser.Float, 0); }
		public TerminalNode Double() { return getToken(SimpleLangParser.Double, 0); }
		public TerminalNode Signed() { return getToken(SimpleLangParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(SimpleLangParser.Unsigned, 0); }
		public TerminalNode Bool() { return getToken(SimpleLangParser.Bool, 0); }
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((TypeSpecifierContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 5822788L) != 0) || _la==Identifier) ) {
				((TypeSpecifierContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			        ((TypeSpecifierContext)_localctx).typeSpecifierRet =  new TypeSpecifier(((TypeSpecifierContext)_localctx).t.getText());
			        _localctx.typeSpecifierRet.setLine(((TypeSpecifierContext)_localctx).t.getLine());
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public SpecifierQualifierList specifierQualifierListRet;
		public TypeSpecifierContext t;
		public Token c;
		public SpecifierQualifierListContext s;
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Const() { return getToken(SimpleLangParser.Const, 0); }
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSpecifierQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_specifierQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SpecifierQualifierListContext)_localctx).specifierQualifierListRet =  new SpecifierQualifierList();
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Identifier:
				{
				{
				setState(362);
				((SpecifierQualifierListContext)_localctx).t = typeSpecifier();

				    _localctx.specifierQualifierListRet.setTypeSpecifier(((SpecifierQualifierListContext)_localctx).t.typeSpecifierRet);
				    _localctx.specifierQualifierListRet.setLine(((SpecifierQualifierListContext)_localctx).t.typeSpecifierRet.getLine());
				}
				}
				break;
			case Const:
				{
				{
				setState(365);
				((SpecifierQualifierListContext)_localctx).c = match(Const);
				_localctx.specifierQualifierListRet.setLine((((SpecifierQualifierListContext)_localctx).c!=null?((SpecifierQualifierListContext)_localctx).c.getLine():0));
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5822796L) != 0) || _la==Identifier) {
				{
				setState(369);
				((SpecifierQualifierListContext)_localctx).s = specifierQualifierList();
				_localctx.specifierQualifierListRet.setSpecifierQualifierList(((SpecifierQualifierListContext)_localctx).s.specifierQualifierListRet);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorContext extends ParserRuleContext {
		public Declarator declaratorRet;
		public PointerContext p;
		public DirectDeclaratorContext d;
		public DirectDeclaratorContext d1;
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarator);
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				((DeclaratorContext)_localctx).declaratorRet =  new Declarator();
				{
				setState(375);
				((DeclaratorContext)_localctx).p = pointer();

				    _localctx.declaratorRet.setPointer(((DeclaratorContext)_localctx).p.pointerRet);
				    _localctx.declaratorRet.setLine(((DeclaratorContext)_localctx).p.pointerRet.getLine());
				}
				{
				setState(378);
				((DeclaratorContext)_localctx).d = directDeclarator(0);
				_localctx.declaratorRet.setDirectDeclarator(((DeclaratorContext)_localctx).d.directDeclaratorRet);
				}
				}
				break;
			case LeftParen:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				((DeclaratorContext)_localctx).declaratorRet =  new Declarator();
				{
				setState(382);
				((DeclaratorContext)_localctx).d1 = directDeclarator(0);
				_localctx.declaratorRet.setDirectDeclarator(((DeclaratorContext)_localctx).d1.directDeclaratorRet);
				    _localctx.declaratorRet.setLine(((DeclaratorContext)_localctx).d1.directDeclaratorRet.getLine());
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectDeclaratorContext extends ParserRuleContext {
		public DirectDeclarator directDeclaratorRet;
		public DirectDeclaratorContext d1;
		public DirectDeclaratorContext d2;
		public Token id;
		public Token l;
		public DeclaratorContext d;
		public ExpressionContext e;
		public ParameterListContext p;
		public IdentifierListContext i;
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDirectDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				((DirectDeclaratorContext)_localctx).directDeclaratorRet =  new IdentifierDeclarator();
				setState(389);
				((DirectDeclaratorContext)_localctx).id = match(Identifier);
				((IdentifierDeclarator)_localctx.directDeclaratorRet).setIdentifier((((DirectDeclaratorContext)_localctx).id!=null?((DirectDeclaratorContext)_localctx).id.getText():null));
				    _localctx.directDeclaratorRet.setLine((((DirectDeclaratorContext)_localctx).id!=null?((DirectDeclaratorContext)_localctx).id.getLine():0));
				}
				break;
			case LeftParen:
				{
				((DirectDeclaratorContext)_localctx).directDeclaratorRet =  new ParenDeclarator();
				setState(392);
				((DirectDeclaratorContext)_localctx).l = match(LeftParen);
				setState(393);
				((DirectDeclaratorContext)_localctx).d = declarator();
				((ParenDeclarator)_localctx.directDeclaratorRet).setDeclarator(((DirectDeclaratorContext)_localctx).d.declaratorRet);
				    _localctx.directDeclaratorRet.setLine((((DirectDeclaratorContext)_localctx).l!=null?((DirectDeclaratorContext)_localctx).l.getLine():0));
				setState(395);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(422);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						_localctx.d1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(399);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						((DirectDeclaratorContext)_localctx).directDeclaratorRet =  new ArrayDeclarator();
						              ((ArrayDeclarator)_localctx.directDeclaratorRet).setDirectDeclarator(((DirectDeclaratorContext)_localctx).d1.directDeclaratorRet);
						              ((ArrayDeclarator)_localctx.directDeclaratorRet).setLine(((DirectDeclaratorContext)_localctx).d1.directDeclaratorRet.getLine());
						setState(401);
						match(LeftBracket);
						setState(405);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
							{
							setState(402);
							((DirectDeclaratorContext)_localctx).e = expression(0);
							((ArrayDeclarator)_localctx.directDeclaratorRet).setExpression(((DirectDeclaratorContext)_localctx).e.expressionRet);
							}
						}

						setState(407);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						_localctx.d2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(408);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						((DirectDeclaratorContext)_localctx).directDeclaratorRet =  new FunctionDeclarator();
						               ((FunctionDeclarator)_localctx.directDeclaratorRet).setDirectDeclarator(((DirectDeclaratorContext)_localctx).d2.directDeclaratorRet);
						               ((FunctionDeclarator)_localctx.directDeclaratorRet).setLine(((DirectDeclaratorContext)_localctx).d2.directDeclaratorRet.getLine());
						setState(410);
						((DirectDeclaratorContext)_localctx).l = match(LeftParen);
						setState(419);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(411);
							((DirectDeclaratorContext)_localctx).p = parameterList();
							((FunctionDeclarator)_localctx.directDeclaratorRet).setParameterList(((DirectDeclaratorContext)_localctx).p.parameterListRet);
							                  _localctx.directDeclaratorRet.setLine((((DirectDeclaratorContext)_localctx).l!=null?((DirectDeclaratorContext)_localctx).l.getLine():0));
							}
							break;
						case 2:
							{
							setState(417);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Identifier) {
								{
								setState(414);
								((DirectDeclaratorContext)_localctx).i = identifierList();
								((FunctionDeclarator)_localctx.directDeclaratorRet).setIdentifierList(((DirectDeclaratorContext)_localctx).i.identifierListRet);
								}
							}

							}
							break;
						}
						setState(421);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointerContext extends ParserRuleContext {
		public Pointer pointerRet;
		public Token s;
		public List<TerminalNode> Star() { return getTokens(SimpleLangParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(SimpleLangParser.Star, i);
		}
		public List<TerminalNode> Const() { return getTokens(SimpleLangParser.Const); }
		public TerminalNode Const(int i) {
			return getToken(SimpleLangParser.Const, i);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((PointerContext)_localctx).pointerRet =  new Pointer();
			setState(428);
			((PointerContext)_localctx).s = match(Star);
			 _localctx.pointerRet.setLine(((PointerContext)_localctx).s.getLine()); 
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(431); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(430);
					match(Const);
					}
					}
					setState(433); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Const );
				}
			}

			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Star) {
				{
				{
				{
				setState(437);
				match(Star);
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(439); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(438);
						match(Const);
						}
						}
						setState(441); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Const );
					}
				}

				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public ParameterList parameterListRet;
		public ParameterDeclarationContext p1;
		public ParameterDeclarationContext p2;
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ParameterListContext)_localctx).parameterListRet =  new ParameterList();
			{
			setState(451);
			((ParameterListContext)_localctx).p1 = parameterDeclaration();

			     _localctx.parameterListRet.addParameterDeclaration(((ParameterListContext)_localctx).p1.parameterDeclarationRet);
			     _localctx.parameterListRet.setLine(((ParameterListContext)_localctx).p1.parameterDeclarationRet.getLine());
			}
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(454);
				match(Comma);
				{
				setState(455);
				((ParameterListContext)_localctx).p2 = parameterDeclaration();
				_localctx.parameterListRet.addParameterDeclaration(((ParameterListContext)_localctx).p2.parameterDeclarationRet);
				}
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public ParameterDeclaration parameterDeclarationRet;
		public DeclarationSpecifiersContext ds;
		public DeclaratorContext d;
		public AbstractDeclaratorContext a;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ParameterDeclarationContext)_localctx).parameterDeclarationRet =  new ParameterDeclaration();
			{
			setState(464);
			((ParameterDeclarationContext)_localctx).ds = declarationSpecifiers();

			    _localctx.parameterDeclarationRet.setDeclarationSpecifiers(((ParameterDeclarationContext)_localctx).ds.declarationSpecifiersRet);
			    _localctx.parameterDeclarationRet.setLine(((ParameterDeclarationContext)_localctx).ds.declarationSpecifiersRet.getLine());
			}
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				{
				setState(467);
				((ParameterDeclarationContext)_localctx).d = declarator();
				_localctx.parameterDeclarationRet.setDeclarator(((ParameterDeclarationContext)_localctx).d.declaratorRet);
				}
				}
				break;
			case 2:
				{
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549797756928L) != 0)) {
					{
					setState(470);
					((ParameterDeclarationContext)_localctx).a = abstractDeclarator();
					_localctx.parameterDeclarationRet.setAbstractDeclarator(((ParameterDeclarationContext)_localctx).a.abstractDeclaratorRet);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierList identifierListRet;
		public Token i;
		public Token i2;
		public List<TerminalNode> Identifier() { return getTokens(SimpleLangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleLangParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((IdentifierListContext)_localctx).identifierListRet =  new IdentifierList();
			setState(478);
			((IdentifierListContext)_localctx).i = match(Identifier);

			        IdentifierExpression idExpr = new IdentifierExpression(((IdentifierListContext)_localctx).i.getText());
			        idExpr.setLine(((IdentifierListContext)_localctx).i.getLine());
			        _localctx.identifierListRet.addIdentifierExpression(idExpr);
			        _localctx.identifierListRet.setLine(((IdentifierListContext)_localctx).i.getLine());
			      
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(480);
				match(Comma);
				setState(481);
				((IdentifierListContext)_localctx).i2 = match(Identifier);

				        IdentifierExpression idExpr2 = new IdentifierExpression(((IdentifierListContext)_localctx).i2.getText());
				        idExpr2.setLine(((IdentifierListContext)_localctx).i2.getLine());
				        _localctx.identifierListRet.addIdentifierExpression(idExpr2);
				      
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TypeName typeNameRet;
		public SpecifierQualifierListContext s;
		public AbstractDeclaratorContext a;
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TypeNameContext)_localctx).typeNameRet =  new TypeName();
			{
			setState(489);
			((TypeNameContext)_localctx).s = specifierQualifierList();

			    _localctx.typeNameRet.setSpecifierQualifierList(((TypeNameContext)_localctx).s.specifierQualifierListRet);
			    _localctx.typeNameRet.setLine(((TypeNameContext)_localctx).s.specifierQualifierListRet.getLine());
			}
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549797756928L) != 0)) {
				{
				setState(492);
				((TypeNameContext)_localctx).a = abstractDeclarator();
				_localctx.typeNameRet.setAbstractDeclarator(((TypeNameContext)_localctx).a.abstractDeclaratorRet);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public AbstractDeclarator abstractDeclaratorRet;
		public PointerContext p1;
		public DirectAbstractDeclaratorContext d;
		public PointerContext p3;
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_abstractDeclarator);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((AbstractDeclaratorContext)_localctx).abstractDeclaratorRet =  new AbstractDeclarator();
				{
				setState(498);
				((AbstractDeclaratorContext)_localctx).p1 = pointer();

				    _localctx.abstractDeclaratorRet.setPointer(((AbstractDeclaratorContext)_localctx).p1.pointerRet);
				    _localctx.abstractDeclaratorRet.setLine(((AbstractDeclaratorContext)_localctx).p1.pointerRet.getLine());
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((AbstractDeclaratorContext)_localctx).abstractDeclaratorRet =  new AbstractDeclarator();
				{
				setState(502);
				((AbstractDeclaratorContext)_localctx).d = directAbstractDeclarator(0);
				_localctx.abstractDeclaratorRet.setDirectAbstractDeclarator(((AbstractDeclaratorContext)_localctx).d.directAbstractDeclaratorRet);
				    _localctx.abstractDeclaratorRet.setLine(((AbstractDeclaratorContext)_localctx).d.directAbstractDeclaratorRet.getLine());
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				((AbstractDeclaratorContext)_localctx).abstractDeclaratorRet =  new AbstractDeclarator();
				{
				setState(506);
				((AbstractDeclaratorContext)_localctx).p3 = pointer();
				_localctx.abstractDeclaratorRet.setPointer(((AbstractDeclaratorContext)_localctx).p3.pointerRet);
				    _localctx.abstractDeclaratorRet.setLine(((AbstractDeclaratorContext)_localctx).p3.pointerRet.getLine());
				}
				{
				setState(509);
				((AbstractDeclaratorContext)_localctx).d = directAbstractDeclarator(0);
				_localctx.abstractDeclaratorRet.setDirectAbstractDeclarator(((AbstractDeclaratorContext)_localctx).d.directAbstractDeclaratorRet);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public DirectAbstractDeclarator directAbstractDeclaratorRet;
		public DirectAbstractDeclaratorContext d1;
		public DirectAbstractDeclaratorContext d2;
		public Token lb;
		public ExpressionContext e1;
		public Token lp;
		public AbstractDeclaratorContext a;
		public ParameterListContext p1;
		public ExpressionContext e2;
		public ParameterListContext p2;
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDirectAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDirectAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDirectAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				{
				((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet =  new DirectAbstractDeclarator();
				setState(516);
				((DirectAbstractDeclaratorContext)_localctx).lb = match(LeftBracket);

				          _localctx.directAbstractDeclaratorRet.setLine(((DirectAbstractDeclaratorContext)_localctx).lb.getLine());
				      
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
					{
					setState(518);
					((DirectAbstractDeclaratorContext)_localctx).e1 = expression(0);

					          _localctx.directAbstractDeclaratorRet.setExpression(((DirectAbstractDeclaratorContext)_localctx).e1.expressionRet);
					      
					}
				}

				setState(523);
				match(RightBracket);
				}
				break;
			case LeftParen:
				{
				((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet =  new DirectAbstractDeclarator();
				setState(525);
				((DirectAbstractDeclaratorContext)_localctx).lp = match(LeftParen);

				          _localctx.directAbstractDeclaratorRet.setLine(((DirectAbstractDeclaratorContext)_localctx).lp.getLine());
				      
				setState(533);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
				case LeftBracket:
				case Star:
					{
					setState(527);
					((DirectAbstractDeclaratorContext)_localctx).a = abstractDeclarator();

					            _localctx.directAbstractDeclaratorRet.setAbstractDeclarator(((DirectAbstractDeclaratorContext)_localctx).a.abstractDeclaratorRet);
					        
					}
					break;
				case Char:
				case Const:
				case Double:
				case Float:
				case Int:
				case Long:
				case Short:
				case Signed:
				case Typedef:
				case Unsigned:
				case Void:
				case Bool:
				case Identifier:
					{
					setState(530);
					((DirectAbstractDeclaratorContext)_localctx).p1 = parameterList();

					            _localctx.directAbstractDeclaratorRet.setParameterList(((DirectAbstractDeclaratorContext)_localctx).p1.parameterListRet);
					        
					}
					break;
				case RightParen:
					break;
				default:
					break;
				}
				setState(535);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(556);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						_localctx.d1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(538);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");

						                    ((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet =  new DirectAbstractDeclarator();
						                    _localctx.directAbstractDeclaratorRet.setDirectAbstractDeclarator(((DirectAbstractDeclaratorContext)_localctx).d1.directAbstractDeclaratorRet);
						                    _localctx.directAbstractDeclaratorRet.setLine(((DirectAbstractDeclaratorContext)_localctx).d1.directAbstractDeclaratorRet.getLine());
						                
						setState(540);
						match(LeftBracket);
						setState(544);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
							{
							setState(541);
							((DirectAbstractDeclaratorContext)_localctx).e2 = expression(0);

							                    _localctx.directAbstractDeclaratorRet.setExpression(((DirectAbstractDeclaratorContext)_localctx).e2.expressionRet);
							                
							}
						}

						setState(546);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						_localctx.d2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(547);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");

						                    ((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet =  new DirectAbstractDeclarator();
						                    _localctx.directAbstractDeclaratorRet.setDirectAbstractDeclarator(((DirectAbstractDeclaratorContext)_localctx).d2.directAbstractDeclaratorRet);
						                    _localctx.directAbstractDeclaratorRet.setLine(((DirectAbstractDeclaratorContext)_localctx).d2.directAbstractDeclaratorRet.getLine());
						                
						setState(549);
						match(LeftParen);
						setState(553);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6084940L) != 0) || _la==Identifier) {
							{
							setState(550);
							((DirectAbstractDeclaratorContext)_localctx).p2 = parameterList();

							                    _localctx.directAbstractDeclaratorRet.setParameterList(((DirectAbstractDeclaratorContext)_localctx).p2.parameterListRet);
							                
							}
						}

						setState(555);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public Initializer initializerRet;
		public ExpressionContext e;
		public Token l;
		public InitializerListContext i;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(SimpleLangParser.RightBrace, 0); }
		public TerminalNode LeftBrace() { return getToken(SimpleLangParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(SimpleLangParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_initializer);
		int _la;
		try {
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Sizeof:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				((InitializerContext)_localctx).initializerRet =  new Initializer();
				{
				setState(562);
				((InitializerContext)_localctx).e = expression(0);
				_localctx.initializerRet.setExpression(((InitializerContext)_localctx).e.expressionRet);
				    _localctx.initializerRet.setLine(((InitializerContext)_localctx).e.expressionRet.getLine());
				}
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				((InitializerContext)_localctx).initializerRet =  new Initializer();
				{
				setState(566);
				((InitializerContext)_localctx).l = match(LeftBrace);
				_localctx.initializerRet.setLine((((InitializerContext)_localctx).l!=null?((InitializerContext)_localctx).l.getLine():0));
				}
				{
				setState(569);
				((InitializerContext)_localctx).i = initializerList();
				_localctx.initializerRet.setInitializerList(((InitializerContext)_localctx).i.initializerListRet);
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(572);
					match(Comma);
					}
				}

				setState(575);
				match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerListContext extends ParserRuleContext {
		public InitializerList initializerListRet;
		public DesignationContext d;
		public InitializerContext i;
		public DesignationContext d1;
		public InitializerContext i1;
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public List<DesignationContext> designation() {
			return getRuleContexts(DesignationContext.class);
		}
		public DesignationContext designation(int i) {
			return getRuleContext(DesignationContext.class,i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((InitializerListContext)_localctx).initializerListRet =  new InitializerList();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(580);
				((InitializerListContext)_localctx).d = designation();
				_localctx.initializerListRet.addDesignation(((InitializerListContext)_localctx).d.designationRet);
				}
			}

			{
			setState(585);
			((InitializerListContext)_localctx).i = initializer();
			_localctx.initializerListRet.addInitializer(((InitializerListContext)_localctx).i.initializerRet);
			    _localctx.initializerListRet.setLine(((InitializerListContext)_localctx).i.initializerRet.getLine());
			}
			setState(599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(588);
					match(Comma);
					setState(592);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(589);
						((InitializerListContext)_localctx).d1 = designation();
						_localctx.initializerListRet.addDesignation(((InitializerListContext)_localctx).d1.designationRet);
						}
					}

					{
					setState(594);
					((InitializerListContext)_localctx).i1 = initializer();
					_localctx.initializerListRet.addInitializer(((InitializerListContext)_localctx).i1.initializerRet);
					}
					}
					} 
				}
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DesignationContext extends ParserRuleContext {
		public Designation designationRet;
		public DesignatorContext d1;
		public DesignatorContext d2;
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public List<DesignatorContext> designator() {
			return getRuleContexts(DesignatorContext.class);
		}
		public DesignatorContext designator(int i) {
			return getRuleContext(DesignatorContext.class,i);
		}
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_designation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DesignationContext)_localctx).designationRet =  new Designation();
			setState(603);
			((DesignationContext)_localctx).d1 = designator();

			          _localctx.designationRet.addDesignator(((DesignationContext)_localctx).d1.designatorRet);
			          _localctx.designationRet.setLine((((DesignationContext)_localctx).d1!=null?(((DesignationContext)_localctx).d1.start):null).getLine());
			      
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftBracket || _la==Dot) {
				{
				{
				setState(605);
				((DesignationContext)_localctx).d2 = designator();
				 _localctx.designationRet.addDesignator(((DesignationContext)_localctx).d2.designatorRet); 
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DesignatorContext extends ParserRuleContext {
		public Designator designatorRet;
		public Token l;
		public ExpressionContext e;
		public Token d;
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TerminalNode Dot() { return getToken(SimpleLangParser.Dot, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_designator);
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				((DesignatorContext)_localctx).designatorRet =  new Designator();
				{
				setState(616);
				((DesignatorContext)_localctx).l = match(LeftBracket);
				_localctx.designatorRet.setLine((((DesignatorContext)_localctx).l!=null?((DesignatorContext)_localctx).l.getLine():0));
				}
				{
				setState(619);
				((DesignatorContext)_localctx).e = expression(0);
				_localctx.designatorRet.setExpression(((DesignatorContext)_localctx).e.expressionRet);
				}
				setState(622);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				((DesignatorContext)_localctx).designatorRet =  new Designator();
				{
				setState(625);
				((DesignatorContext)_localctx).d = match(Dot);
				_localctx.designatorRet.setLine((((DesignatorContext)_localctx).d!=null?((DesignatorContext)_localctx).d.getLine():0));
				}
				setState(628);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Statement statementRet;
		public CompoundStatementContext cs;
		public ExpressionStatementContext es;
		public SelectionStatementContext ss;
		public IterationStatementContext is;
		public JumpStatementContext js;
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				((StatementContext)_localctx).cs = compoundStatement();

				        ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).cs.compoundStatementRet;
				        _localctx.statementRet.setLine((((StatementContext)_localctx).cs!=null?(((StatementContext)_localctx).cs.start):null).getLine());
				    
				}
				break;
			case Sizeof:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case Semi:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				((StatementContext)_localctx).es = expressionStatement();

				        ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).es.expressionStatementRet;
				        _localctx.statementRet.setLine((((StatementContext)_localctx).es!=null?(((StatementContext)_localctx).es.start):null).getLine());
				    
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				((StatementContext)_localctx).ss = selectionStatement();

				        ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).ss.selectionStatementRet;
				        _localctx.statementRet.setLine((((StatementContext)_localctx).ss!=null?(((StatementContext)_localctx).ss.start):null).getLine());
				    
				}
				break;
			case Do:
			case For:
			case While:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				((StatementContext)_localctx).is = iterationStatement();

				        ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).is.iterationStatementRet;
				        _localctx.statementRet.setLine((((StatementContext)_localctx).is!=null?(((StatementContext)_localctx).is.start):null).getLine());
				    
				}
				break;
			case Break:
			case Continue:
			case Return:
				enterOuterAlt(_localctx, 5);
				{
				setState(643);
				((StatementContext)_localctx).js = jumpStatement();

				        ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).js.jumpStatementRet;
				        _localctx.statementRet.setLine((((StatementContext)_localctx).js!=null?(((StatementContext)_localctx).js.start):null).getLine());
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public CompoundStatement compoundStatementRet;
		public Token l;
		public BlockItemContext b;
		public TerminalNode RightBrace() { return getToken(SimpleLangParser.RightBrace, 0); }
		public TerminalNode LeftBrace() { return getToken(SimpleLangParser.LeftBrace, 0); }
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((CompoundStatementContext)_localctx).compoundStatementRet =  new CompoundStatement();
			{
			setState(649);
			((CompoundStatementContext)_localctx).l = match(LeftBrace);
			_localctx.compoundStatementRet.setLine((((CompoundStatementContext)_localctx).l!=null?((CompoundStatementContext)_localctx).l.getLine():0));
			}
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2679475628015486L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 11L) != 0)) {
				{
				setState(655); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(652);
					((CompoundStatementContext)_localctx).b = blockItem();
					_localctx.compoundStatementRet.addBlockItem(((CompoundStatementContext)_localctx).b.blockItemRet);
					}
					}
					setState(657); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2679475628015486L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 11L) != 0) );
				}
			}

			setState(661);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockItemContext extends ParserRuleContext {
		public BlockItem blockItemRet;
		public StatementContext statement;
		public DeclarationContext declaration;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_blockItem);
		try {
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				((BlockItemContext)_localctx).statement = statement();
				((BlockItemContext)_localctx).blockItemRet =  ((BlockItemContext)_localctx).statement.statementRet;
				    _localctx.blockItemRet.setLine(((BlockItemContext)_localctx).statement.statementRet.getLine());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				((BlockItemContext)_localctx).declaration = declaration();
				((BlockItemContext)_localctx).blockItemRet =  ((BlockItemContext)_localctx).declaration.declarationRet;
				    _localctx.blockItemRet.setLine(((BlockItemContext)_localctx).declaration.declarationRet.getLine());
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatement expressionStatementRet;
		public ExpressionContext e;
		public Token s;
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionStatement);
		try {
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Sizeof:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				((ExpressionStatementContext)_localctx).expressionStatementRet =  new ExpressionStatement();
				{
				setState(672);
				((ExpressionStatementContext)_localctx).e = expression(0);
				_localctx.expressionStatementRet.setExpression(((ExpressionStatementContext)_localctx).e.expressionRet);
				    _localctx.expressionStatementRet.setLine(((ExpressionStatementContext)_localctx).e.expressionRet.getLine());
				}
				setState(675);
				match(Semi);
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionStatementContext)_localctx).expressionStatementRet =  new ExpressionStatement();
				setState(678);
				((ExpressionStatementContext)_localctx).s = match(Semi);
				_localctx.expressionStatementRet.setLine((((ExpressionStatementContext)_localctx).s!=null?((ExpressionStatementContext)_localctx).s.getLine():0));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectionStatementContext extends ParserRuleContext {
		public SelectionStatement selectionStatementRet;
		public Token i;
		public ExpressionContext e;
		public StatementContext s1;
		public StatementContext s2;
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TerminalNode If() { return getToken(SimpleLangParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(SimpleLangParser.Else, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_selectionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SelectionStatementContext)_localctx).selectionStatementRet =  new SelectionStatement();
			{
			setState(683);
			((SelectionStatementContext)_localctx).i = match(If);
			_localctx.selectionStatementRet.setLine((((SelectionStatementContext)_localctx).i!=null?((SelectionStatementContext)_localctx).i.getLine():0));
			}
			setState(686);
			match(LeftParen);
			{
			setState(687);
			((SelectionStatementContext)_localctx).e = expression(0);
			_localctx.selectionStatementRet.setExpression(((SelectionStatementContext)_localctx).e.expressionRet);
			}
			setState(690);
			match(RightParen);
			{
			setState(691);
			((SelectionStatementContext)_localctx).s1 = statement();
			_localctx.selectionStatementRet.setIfStatement(((SelectionStatementContext)_localctx).s1.statementRet);
			}
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(694);
				match(Else);
				setState(695);
				((SelectionStatementContext)_localctx).s2 = statement();
				_localctx.selectionStatementRet.setElseStatement(((SelectionStatementContext)_localctx).s2.statementRet) ;
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatement iterationStatementRet;
		public Token w;
		public ExpressionContext e;
		public StatementContext s;
		public Token d;
		public ExpressionContext e2;
		public Token f;
		public ForConditionContext f2;
		public StatementContext s2;
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TerminalNode While() { return getToken(SimpleLangParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public TerminalNode Do() { return getToken(SimpleLangParser.Do, 0); }
		public TerminalNode For() { return getToken(SimpleLangParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_iterationStatement);
		try {
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				((IterationStatementContext)_localctx).w = match(While);

				      ((IterationStatementContext)_localctx).iterationStatementRet =  new IterationStatement();
				      _localctx.iterationStatementRet.setLine(((IterationStatementContext)_localctx).w.getLine());
				    
				setState(702);
				match(LeftParen);
				setState(703);
				((IterationStatementContext)_localctx).e = expression(0);

				      _localctx.iterationStatementRet.setExpression(((IterationStatementContext)_localctx).e.expressionRet);
				    
				setState(705);
				match(RightParen);
				setState(706);
				((IterationStatementContext)_localctx).s = statement();

				      _localctx.iterationStatementRet.setStatement(((IterationStatementContext)_localctx).s.statementRet);
				    
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				((IterationStatementContext)_localctx).d = match(Do);

				      ((IterationStatementContext)_localctx).iterationStatementRet =  new IterationStatement();
				      _localctx.iterationStatementRet.setLine(((IterationStatementContext)_localctx).d.getLine());
				    
				setState(711);
				((IterationStatementContext)_localctx).s = statement();

				      _localctx.iterationStatementRet.setStatement(((IterationStatementContext)_localctx).s.statementRet);
				    
				setState(713);
				match(While);
				setState(714);
				match(LeftParen);
				setState(715);
				((IterationStatementContext)_localctx).e2 = expression(0);

				      _localctx.iterationStatementRet.setExpression(((IterationStatementContext)_localctx).e2.expressionRet);
				    
				setState(717);
				match(RightParen);
				setState(718);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				((IterationStatementContext)_localctx).f = match(For);

				      ((IterationStatementContext)_localctx).iterationStatementRet =  new IterationStatement();
				      _localctx.iterationStatementRet.setLine(((IterationStatementContext)_localctx).f.getLine());
				    
				setState(722);
				match(LeftParen);
				setState(723);
				((IterationStatementContext)_localctx).f2 = forCondition();

				      _localctx.iterationStatementRet.setForCondition(((IterationStatementContext)_localctx).f2.forConditionRet);
				    
				setState(725);
				match(RightParen);
				setState(726);
				((IterationStatementContext)_localctx).s2 = statement();

				      _localctx.iterationStatementRet.setStatement(((IterationStatementContext)_localctx).s2.statementRet);
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForConditionContext extends ParserRuleContext {
		public ForCondition forConditionRet;
		public ForDeclarationContext f;
		public ExpressionContext e;
		public Token s;
		public ForExpressionContext f1;
		public ForExpressionContext f2;
		public List<TerminalNode> Semi() { return getTokens(SimpleLangParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(SimpleLangParser.Semi, i);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ForConditionContext)_localctx).forConditionRet =  new ForCondition();
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				{
				setState(732);
				((ForConditionContext)_localctx).f = forDeclaration();
				_localctx.forConditionRet.setForDeclaration(((ForConditionContext)_localctx).f.forDeclarationRet);
				}
				}
				break;
			case 2:
				{
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
					{
					setState(735);
					((ForConditionContext)_localctx).e = expression(0);
					_localctx.forConditionRet.setExpression(((ForConditionContext)_localctx).e.expressionRet);
					}
				}

				}
				break;
			}
			setState(742);
			((ForConditionContext)_localctx).s = match(Semi);
			_localctx.forConditionRet.setLine((((ForConditionContext)_localctx).s!=null?((ForConditionContext)_localctx).s.getLine():0));
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
				{
				setState(744);
				((ForConditionContext)_localctx).f1 = forExpression();
				_localctx.forConditionRet.setForExpression1(((ForConditionContext)_localctx).f1.forExpressionRet);
				}
			}

			setState(749);
			match(Semi);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
				{
				setState(750);
				((ForConditionContext)_localctx).f2 = forExpression();
				_localctx.forConditionRet.setForExpression2(((ForConditionContext)_localctx).f2.forExpressionRet);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForDeclarationContext extends ParserRuleContext {
		public ForDeclaration forDeclarationRet;
		public DeclarationSpecifiersContext d;
		public InitDeclaratorListContext i;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ForDeclarationContext)_localctx).forDeclarationRet =  new ForDeclaration();
			{
			setState(756);
			((ForDeclarationContext)_localctx).d = declarationSpecifiers();
			_localctx.forDeclarationRet.setDeclarationSpecifiers(((ForDeclarationContext)_localctx).d.declarationSpecifiersRet);
			    _localctx.forDeclarationRet.setLine(((ForDeclarationContext)_localctx).d.declarationSpecifiersRet.getLine());
			}
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 35184372154369L) != 0)) {
				{
				setState(759);
				((ForDeclarationContext)_localctx).i = initDeclaratorList();
				_localctx.forDeclarationRet.setInitDeclaratorList(((ForDeclarationContext)_localctx).i.initDeclaratorListRet);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForExpressionContext extends ParserRuleContext {
		public ForExpression forExpressionRet;
		public ExpressionContext e;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ForExpressionContext)_localctx).forExpressionRet =  new ForExpression();
			{
			setState(765);
			((ForExpressionContext)_localctx).e = expression(0);
			_localctx.forExpressionRet.addExpression(((ForExpressionContext)_localctx).e.expressionRet);
			    _localctx.forExpressionRet.setLine(((ForExpressionContext)_localctx).e.expressionRet.getLine());
			}
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(768);
				match(Comma);
				setState(769);
				((ForExpressionContext)_localctx).e = expression(0);
				_localctx.forExpressionRet.addExpression(((ForExpressionContext)_localctx).e.expressionRet);
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatement jumpStatementRet;
		public Token c;
		public Token b;
		public Token r;
		public ExpressionContext e;
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public TerminalNode Continue() { return getToken(SimpleLangParser.Continue, 0); }
		public TerminalNode Break() { return getToken(SimpleLangParser.Break, 0); }
		public TerminalNode Return() { return getToken(SimpleLangParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((JumpStatementContext)_localctx).jumpStatementRet =  new JumpStatement();
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Continue:
				{
				setState(778);
				((JumpStatementContext)_localctx).c = match(Continue);

				            _localctx.jumpStatementRet.setLine((((JumpStatementContext)_localctx).c!=null?((JumpStatementContext)_localctx).c.getLine():0));
				        
				}
				break;
			case Break:
				{
				setState(780);
				((JumpStatementContext)_localctx).b = match(Break);

				            _localctx.jumpStatementRet.setLine((((JumpStatementContext)_localctx).b!=null?((JumpStatementContext)_localctx).b.getLine():0));
				        
				}
				break;
			case Return:
				{
				setState(782);
				((JumpStatementContext)_localctx).r = match(Return);

				            _localctx.jumpStatementRet.setLine((((JumpStatementContext)_localctx).r!=null?((JumpStatementContext)_localctx).r.getLine():0));
				        
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
					{
					setState(784);
					((JumpStatementContext)_localctx).e = expression(0);

					            _localctx.jumpStatementRet.setExpression(((JumpStatementContext)_localctx).e.expressionRet);
					        
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(791);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 18:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 25:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001M\u031a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000Y\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001a\b\u0001\n\u0001"+
		"\f\u0001d\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002n\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003t\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003{\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0085\b\u0004\n\u0004\f\u0004"+
		"\u0088\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005\u0090\b\u0005\u000b\u0005\f\u0005\u0091\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00a0\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00a8\b\u0005\n\u0005\f\u0005\u00ab\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00b5\b\u0005\n\u0005\f\u0005\u00b8"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00c5\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d4\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00dc"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00fb\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u0005\u0107\b\u0005\u000b\u0005\f\u0005\u0108\u0005\u0005\u010b\b\u0005"+
		"\n\u0005\f\u0005\u010e\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0117\b\u0006\n"+
		"\u0006\f\u0006\u011a\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u012c\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0138\b\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0141\b\u000b\n\u000b\f\u000b\u0144\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u014e\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0158"+
		"\b\r\n\r\f\r\u015b\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0165\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0170\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0175\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0182\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u018e\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0196\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u01a2\b\u0012\u0003\u0012\u01a4\b\u0012\u0001\u0012\u0005\u0012\u01a7"+
		"\b\u0012\n\u0012\f\u0012\u01aa\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0004\u0013\u01b0\b\u0013\u000b\u0013\f\u0013\u01b1\u0003"+
		"\u0013\u01b4\b\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u01b8\b\u0013"+
		"\u000b\u0013\f\u0013\u01b9\u0003\u0013\u01bc\b\u0013\u0005\u0013\u01be"+
		"\b\u0013\n\u0013\f\u0013\u01c1\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u01cb\b\u0014\n\u0014\f\u0014\u01ce\t\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u01da\b\u0015\u0003\u0015\u01dc\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u01e4\b\u0016\n\u0016\f\u0016\u01e7\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01f0\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0201"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u020a\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0216\b\u0019\u0001\u0019\u0003\u0019\u0219"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0221\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u022a\b\u0019\u0001"+
		"\u0019\u0005\u0019\u022d\b\u0019\n\u0019\f\u0019\u0230\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u023e\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0242\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0248\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0251\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u0256\b\u001b\n\u001b\f\u001b\u0259\t\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0261\b\u001c"+
		"\n\u001c\f\u001c\u0264\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0276\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0287\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u0290\b\u001f\u000b\u001f\f"+
		"\u001f\u0291\u0003\u001f\u0294\b\u001f\u0001\u001f\u0001\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u029e\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u02a9\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02bb\b\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u02da\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u02e3\b$\u0003$\u02e5"+
		"\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u02ec\b$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u02f2\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u02fb\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0005&\u0305\b&\n&\f&\u0308\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0314\b\'\u0003\'\u0316"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0000\u0003\n$2(\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLN\u0000\u0006\u0003\u0000\u0010\u0010$$&&\u0004\u0000\u001d"+
		"#%%\'.@A\u0002\u0000$$&&\u0005\u0000##%%\'\'**/0\u0001\u00005?\b\u0000"+
		"\u0002\u0002\u0006\u0006\b\b\u000b\f\u000e\u000f\u0013\u0014\u0016\u0016"+
		"DD\u0353\u0000X\u0001\u0000\u0000\u0000\u0002Z\u0001\u0000\u0000\u0000"+
		"\u0004m\u0001\u0000\u0000\u0000\u0006o\u0001\u0000\u0000\u0000\b\u007f"+
		"\u0001\u0000\u0000\u0000\n\u00db\u0001\u0000\u0000\u0000\f\u010f\u0001"+
		"\u0000\u0000\u0000\u000e\u011b\u0001\u0000\u0000\u0000\u0010\u012b\u0001"+
		"\u0000\u0000\u0000\u0012\u012d\u0001\u0000\u0000\u0000\u0014\u0130\u0001"+
		"\u0000\u0000\u0000\u0016\u013b\u0001\u0000\u0000\u0000\u0018\u0145\u0001"+
		"\u0000\u0000\u0000\u001a\u014f\u0001\u0000\u0000\u0000\u001c\u015c\u0001"+
		"\u0000\u0000\u0000\u001e\u0166\u0001\u0000\u0000\u0000 \u0169\u0001\u0000"+
		"\u0000\u0000\"\u0181\u0001\u0000\u0000\u0000$\u018d\u0001\u0000\u0000"+
		"\u0000&\u01ab\u0001\u0000\u0000\u0000(\u01c2\u0001\u0000\u0000\u0000*"+
		"\u01cf\u0001\u0000\u0000\u0000,\u01dd\u0001\u0000\u0000\u0000.\u01e8\u0001"+
		"\u0000\u0000\u00000\u0200\u0001\u0000\u0000\u00002\u0218\u0001\u0000\u0000"+
		"\u00004\u0241\u0001\u0000\u0000\u00006\u0243\u0001\u0000\u0000\u00008"+
		"\u025a\u0001\u0000\u0000\u0000:\u0275\u0001\u0000\u0000\u0000<\u0286\u0001"+
		"\u0000\u0000\u0000>\u0288\u0001\u0000\u0000\u0000@\u029d\u0001\u0000\u0000"+
		"\u0000B\u02a8\u0001\u0000\u0000\u0000D\u02aa\u0001\u0000\u0000\u0000F"+
		"\u02d9\u0001\u0000\u0000\u0000H\u02db\u0001\u0000\u0000\u0000J\u02f3\u0001"+
		"\u0000\u0000\u0000L\u02fc\u0001\u0000\u0000\u0000N\u0309\u0001\u0000\u0000"+
		"\u0000PQ\u0006\u0000\uffff\uffff\u0000QR\u0003\u0002\u0001\u0000RS\u0006"+
		"\u0000\uffff\uffff\u0000ST\u0005\u0000\u0000\u0001TY\u0001\u0000\u0000"+
		"\u0000UV\u0006\u0000\uffff\uffff\u0000VW\u0005\u0000\u0000\u0001WY\u0006"+
		"\u0000\uffff\uffff\u0000XP\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000"+
		"\u0000Y\u0001\u0001\u0000\u0000\u0000Z[\u0006\u0001\uffff\uffff\u0000"+
		"[\\\u0003\u0004\u0002\u0000\\b\u0006\u0001\uffff\uffff\u0000]^\u0003\u0004"+
		"\u0002\u0000^_\u0006\u0001\uffff\uffff\u0000_a\u0001\u0000\u0000\u0000"+
		"`]\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\u0003\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000ef\u0003\u0006\u0003\u0000fg\u0006\u0002\uffff\uffff"+
		"\u0000gn\u0001\u0000\u0000\u0000hi\u0003\u0014\n\u0000ij\u0006\u0002\uffff"+
		"\uffff\u0000jn\u0001\u0000\u0000\u0000kl\u00053\u0000\u0000ln\u0006\u0002"+
		"\uffff\uffff\u0000me\u0001\u0000\u0000\u0000mh\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000n\u0005\u0001\u0000\u0000\u0000os\u0006\u0003"+
		"\uffff\uffff\u0000pq\u0003\u0016\u000b\u0000qr\u0006\u0003\uffff\uffff"+
		"\u0000rt\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0003\"\u0011\u0000vz\u0006\u0003"+
		"\uffff\uffff\u0000wx\u0003\b\u0004\u0000xy\u0006\u0003\uffff\uffff\u0000"+
		"y{\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|}\u0003>\u001f\u0000}~\u0006\u0003\uffff"+
		"\uffff\u0000~\u0007\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u0014\n"+
		"\u0000\u0080\u0086\u0006\u0004\uffff\uffff\u0000\u0081\u0082\u0003\u0014"+
		"\n\u0000\u0082\u0083\u0006\u0004\uffff\uffff\u0000\u0083\u0085\u0001\u0000"+
		"\u0000\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\t\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0006\u0005\uffff\uffff\u0000\u008a\u008b\u0005D\u0000"+
		"\u0000\u008b\u00dc\u0006\u0005\uffff\uffff\u0000\u008c\u008d\u0005E\u0000"+
		"\u0000\u008d\u00dc\u0006\u0005\uffff\uffff\u0000\u008e\u0090\u0005G\u0000"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u00dc\u0006\u0005\uffff"+
		"\uffff\u0000\u0094\u0095\u0005\u0017\u0000\u0000\u0095\u0096\u0003\n\u0005"+
		"\u0000\u0096\u0097\u0005\u0018\u0000\u0000\u0097\u0098\u0006\u0005\uffff"+
		"\uffff\u0000\u0098\u00dc\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0017"+
		"\u0000\u0000\u009a\u009b\u0003.\u0017\u0000\u009b\u009c\u0005\u0018\u0000"+
		"\u0000\u009c\u009d\u0005\u001b\u0000\u0000\u009d\u009f\u00036\u001b\u0000"+
		"\u009e\u00a0\u00054\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005\u001c\u0000\u0000\u00a2\u00a3\u0006\u0005\uffff\uffff\u0000"+
		"\u00a3\u00dc\u0001\u0000\u0000\u0000\u00a4\u00a9\u0006\u0005\uffff\uffff"+
		"\u0000\u00a5\u00a6\u0007\u0000\u0000\u0000\u00a6\u00a8\u0006\u0005\uffff"+
		"\uffff\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00d3\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005D\u0000\u0000\u00ad\u00d4\u0006\u0005\uffff"+
		"\uffff\u0000\u00ae\u00af\u0005E\u0000\u0000\u00af\u00d4\u0006\u0005\uffff"+
		"\uffff\u0000\u00b0\u00b1\u0005G\u0000\u0000\u00b1\u00b6\u0006\u0005\uffff"+
		"\uffff\u0000\u00b2\u00b3\u0005G\u0000\u0000\u00b3\u00b5\u0006\u0005\uffff"+
		"\uffff\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00d4\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0005\u0017\u0000\u0000\u00ba\u00bb\u0003\n\u0005"+
		"\u0000\u00bb\u00bc\u0005\u0018\u0000\u0000\u00bc\u00bd\u0006\u0005\uffff"+
		"\uffff\u0000\u00bd\u00d4\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0017"+
		"\u0000\u0000\u00bf\u00c0\u0003.\u0017\u0000\u00c0\u00c1\u0005\u0018\u0000"+
		"\u0000\u00c1\u00c2\u0005\u001b\u0000\u0000\u00c2\u00c4\u00036\u001b\u0000"+
		"\u00c3\u00c5\u00054\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0005\u001c\u0000\u0000\u00c7\u00c8\u0006\u0005\uffff\uffff\u0000"+
		"\u00c8\u00d4\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003\u000e\u0007\u0000"+
		"\u00ca\u00cb\u0003\u0010\b\u0000\u00cb\u00cc\u0006\u0005\uffff\uffff\u0000"+
		"\u00cc\u00d4\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0010\u0000\u0000"+
		"\u00ce\u00cf\u0005\u0017\u0000\u0000\u00cf\u00d0\u0003.\u0017\u0000\u00d0"+
		"\u00d1\u0005\u0018\u0000\u0000\u00d1\u00d2\u0006\u0005\uffff\uffff\u0000"+
		"\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00ac\u0001\u0000\u0000\u0000"+
		"\u00d3\u00ae\u0001\u0000\u0000\u0000\u00d3\u00b0\u0001\u0000\u0000\u0000"+
		"\u00d3\u00b9\u0001\u0000\u0000\u0000\u00d3\u00be\u0001\u0000\u0000\u0000"+
		"\u00d3\u00c9\u0001\u0000\u0000\u0000\u00d3\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d4\u00dc\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0017\u0000\u0000"+
		"\u00d6\u00d7\u0003.\u0017\u0000\u00d7\u00d8\u0005\u0018\u0000\u0000\u00d8"+
		"\u00d9\u0003\u0010\b\u0000\u00d9\u00da\u0006\u0005\uffff\uffff\u0000\u00da"+
		"\u00dc\u0001\u0000\u0000\u0000\u00db\u0089\u0001\u0000\u0000\u0000\u00db"+
		"\u008c\u0001\u0000\u0000\u0000\u00db\u008f\u0001\u0000\u0000\u0000\u00db"+
		"\u0094\u0001\u0000\u0000\u0000\u00db\u0099\u0001\u0000\u0000\u0000\u00db"+
		"\u00a4\u0001\u0000\u0000\u0000\u00db\u00d5\u0001\u0000\u0000\u0000\u00dc"+
		"\u010c\u0001\u0000\u0000\u0000\u00dd\u00de\n\u0004\u0000\u0000\u00de\u00df"+
		"\u0007\u0001\u0000\u0000\u00df\u00e0\u0003\n\u0005\u0005\u00e0\u00e1\u0006"+
		"\u0005\uffff\uffff\u0000\u00e1\u010b\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\n\u0003\u0000\u0000\u00e3\u00e4\u00051\u0000\u0000\u00e4\u00e5\u0003"+
		"\n\u0005\u0000\u00e5\u00e6\u00052\u0000\u0000\u00e6\u00e7\u0003\n\u0005"+
		"\u0004\u00e7\u00e8\u0006\u0005\uffff\uffff\u0000\u00e8\u010b\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\n\u0002\u0000\u0000\u00ea\u00eb\u0003\u0012\t"+
		"\u0000\u00eb\u00ec\u0003\n\u0005\u0003\u00ec\u00ed\u0006\u0005\uffff\uffff"+
		"\u0000\u00ed\u010b\u0001\u0000\u0000\u0000\u00ee\u00ef\n\t\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0019\u0000\u0000\u00f0\u00f1\u0003\n\u0005\u0000\u00f1"+
		"\u00f2\u0005\u001a\u0000\u0000\u00f2\u00f3\u0006\u0005\uffff\uffff\u0000"+
		"\u00f3\u010b\u0001\u0000\u0000\u0000\u00f4\u00f5\n\b\u0000\u0000\u00f5"+
		"\u00f6\u0006\u0005\uffff\uffff\u0000\u00f6\u00fa\u0005\u0017\u0000\u0000"+
		"\u00f7\u00f8\u0003\f\u0006\u0000\u00f8\u00f9\u0006\u0005\uffff\uffff\u0000"+
		"\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fc\u010b\u0005\u0018\u0000\u0000\u00fd\u00fe\n\u0007\u0000\u0000\u00fe"+
		"\u00ff\u0007\u0002\u0000\u0000\u00ff\u010b\u0006\u0005\uffff\uffff\u0000"+
		"\u0100\u0101\n\u0001\u0000\u0000\u0101\u0106\u0006\u0005\uffff\uffff\u0000"+
		"\u0102\u0103\u00054\u0000\u0000\u0103\u0104\u0003\n\u0005\u0000\u0104"+
		"\u0105\u0006\u0005\uffff\uffff\u0000\u0105\u0107\u0001\u0000\u0000\u0000"+
		"\u0106\u0102\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u00dd\u0001\u0000\u0000\u0000"+
		"\u010a\u00e2\u0001\u0000\u0000\u0000\u010a\u00e9\u0001\u0000\u0000\u0000"+
		"\u010a\u00ee\u0001\u0000\u0000\u0000\u010a\u00f4\u0001\u0000\u0000\u0000"+
		"\u010a\u00fd\u0001\u0000\u0000\u0000\u010a\u0100\u0001\u0000\u0000\u0000"+
		"\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u000b\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0110\u0006\u0006\uffff\uffff"+
		"\u0000\u0110\u0111\u0003\n\u0005\u0000\u0111\u0118\u0006\u0006\uffff\uffff"+
		"\u0000\u0112\u0113\u00054\u0000\u0000\u0113\u0114\u0003\n\u0005\u0000"+
		"\u0114\u0115\u0006\u0006\uffff\uffff\u0000\u0115\u0117\u0001\u0000\u0000"+
		"\u0000\u0116\u0112\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\r\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0007\u0003\u0000\u0000\u011c\u011d\u0006\u0007\uffff\uffff"+
		"\u0000\u011d\u000f\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u0017\u0000"+
		"\u0000\u011f\u0120\u0006\b\uffff\uffff\u0000\u0120\u0121\u0003.\u0017"+
		"\u0000\u0121\u0122\u0006\b\uffff\uffff\u0000\u0122\u0123\u0005\u0018\u0000"+
		"\u0000\u0123\u0124\u0003\u0010\b\u0000\u0124\u0125\u0006\b\uffff\uffff"+
		"\u0000\u0125\u012c\u0001\u0000\u0000\u0000\u0126\u0127\u0003\n\u0005\u0000"+
		"\u0127\u0128\u0006\b\uffff\uffff\u0000\u0128\u012c\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0005F\u0000\u0000\u012a\u012c\u0006\b\uffff\uffff\u0000"+
		"\u012b\u011e\u0001\u0000\u0000\u0000\u012b\u0126\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u0011\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0007\u0004\u0000\u0000\u012e\u012f\u0006\t\uffff\uffff\u0000"+
		"\u012f\u0013\u0001\u0000\u0000\u0000\u0130\u0131\u0006\n\uffff\uffff\u0000"+
		"\u0131\u0132\u0003\u0016\u000b\u0000\u0132\u0133\u0006\n\uffff\uffff\u0000"+
		"\u0133\u0137\u0001\u0000\u0000\u0000\u0134\u0135\u0003\u001a\r\u0000\u0135"+
		"\u0136\u0006\n\uffff\uffff\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137"+
		"\u0134\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u00053\u0000\u0000\u013a\u0015"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0003\u0018\f\u0000\u013c\u0142\u0006"+
		"\u000b\uffff\uffff\u0000\u013d\u013e\u0003\u0018\f\u0000\u013e\u013f\u0006"+
		"\u000b\uffff\uffff\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u013d"+
		"\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0017"+
		"\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u014d"+
		"\u0006\f\uffff\uffff\u0000\u0146\u0147\u0005\u0012\u0000\u0000\u0147\u014e"+
		"\u0006\f\uffff\uffff\u0000\u0148\u0149\u0003\u001e\u000f\u0000\u0149\u014a"+
		"\u0006\f\uffff\uffff\u0000\u014a\u014e\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0005\u0003\u0000\u0000\u014c\u014e\u0006\f\uffff\uffff\u0000\u014d\u0146"+
		"\u0001\u0000\u0000\u0000\u014d\u0148\u0001\u0000\u0000\u0000\u014d\u014b"+
		"\u0001\u0000\u0000\u0000\u014e\u0019\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0006\r\uffff\uffff\u0000\u0150\u0151\u0003\u001c\u000e\u0000\u0151\u0152"+
		"\u0006\r\uffff\uffff\u0000\u0152\u0159\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u00054\u0000\u0000\u0154\u0155\u0003\u001c\u000e\u0000\u0155\u0156\u0006"+
		"\r\uffff\uffff\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157\u0153\u0001"+
		"\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u001b\u0001"+
		"\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0006"+
		"\u000e\uffff\uffff\u0000\u015d\u015e\u0003\"\u0011\u0000\u015e\u015f\u0006"+
		"\u000e\uffff\uffff\u0000\u015f\u0164\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u00055\u0000\u0000\u0161\u0162\u00034\u001a\u0000\u0162\u0163\u0006\u000e"+
		"\uffff\uffff\u0000\u0163\u0165\u0001\u0000\u0000\u0000\u0164\u0160\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u001d\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0007\u0005\u0000\u0000\u0167\u0168\u0006"+
		"\u000f\uffff\uffff\u0000\u0168\u001f\u0001\u0000\u0000\u0000\u0169\u016f"+
		"\u0006\u0010\uffff\uffff\u0000\u016a\u016b\u0003\u001e\u000f\u0000\u016b"+
		"\u016c\u0006\u0010\uffff\uffff\u0000\u016c\u0170\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0005\u0003\u0000\u0000\u016e\u0170\u0006\u0010\uffff\uffff"+
		"\u0000\u016f\u016a\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000"+
		"\u0000\u0170\u0174\u0001\u0000\u0000\u0000\u0171\u0172\u0003 \u0010\u0000"+
		"\u0172\u0173\u0006\u0010\uffff\uffff\u0000\u0173\u0175\u0001\u0000\u0000"+
		"\u0000\u0174\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000"+
		"\u0000\u0175!\u0001\u0000\u0000\u0000\u0176\u0177\u0006\u0011\uffff\uffff"+
		"\u0000\u0177\u0178\u0003&\u0013\u0000\u0178\u0179\u0006\u0011\uffff\uffff"+
		"\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0003$\u0012\u0000"+
		"\u017b\u017c\u0006\u0011\uffff\uffff\u0000\u017c\u0182\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0006\u0011\uffff\uffff\u0000\u017e\u017f\u0003$\u0012"+
		"\u0000\u017f\u0180\u0006\u0011\uffff\uffff\u0000\u0180\u0182\u0001\u0000"+
		"\u0000\u0000\u0181\u0176\u0001\u0000\u0000\u0000\u0181\u017d\u0001\u0000"+
		"\u0000\u0000\u0182#\u0001\u0000\u0000\u0000\u0183\u0184\u0006\u0012\uffff"+
		"\uffff\u0000\u0184\u0185\u0006\u0012\uffff\uffff\u0000\u0185\u0186\u0005"+
		"D\u0000\u0000\u0186\u018e\u0006\u0012\uffff\uffff\u0000\u0187\u0188\u0006"+
		"\u0012\uffff\uffff\u0000\u0188\u0189\u0005\u0017\u0000\u0000\u0189\u018a"+
		"\u0003\"\u0011\u0000\u018a\u018b\u0006\u0012\uffff\uffff\u0000\u018b\u018c"+
		"\u0005\u0018\u0000\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u0183"+
		"\u0001\u0000\u0000\u0000\u018d\u0187\u0001\u0000\u0000\u0000\u018e\u01a8"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\n\u0002\u0000\u0000\u0190\u0191\u0006"+
		"\u0012\uffff\uffff\u0000\u0191\u0195\u0005\u0019\u0000\u0000\u0192\u0193"+
		"\u0003\n\u0005\u0000\u0193\u0194\u0006\u0012\uffff\uffff\u0000\u0194\u0196"+
		"\u0001\u0000\u0000\u0000\u0195\u0192\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u01a7"+
		"\u0005\u001a\u0000\u0000\u0198\u0199\n\u0001\u0000\u0000\u0199\u019a\u0006"+
		"\u0012\uffff\uffff\u0000\u019a\u01a3\u0005\u0017\u0000\u0000\u019b\u019c"+
		"\u0003(\u0014\u0000\u019c\u019d\u0006\u0012\uffff\uffff\u0000\u019d\u01a4"+
		"\u0001\u0000\u0000\u0000\u019e\u019f\u0003,\u0016\u0000\u019f\u01a0\u0006"+
		"\u0012\uffff\uffff\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u019e"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a3\u019b\u0001\u0000\u0000\u0000\u01a3\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a7"+
		"\u0005\u0018\u0000\u0000\u01a6\u018f\u0001\u0000\u0000\u0000\u01a6\u0198"+
		"\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9%\u0001"+
		"\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ac\u0006"+
		"\u0013\uffff\uffff\u0000\u01ac\u01ad\u0005\'\u0000\u0000\u01ad\u01b3\u0006"+
		"\u0013\uffff\uffff\u0000\u01ae\u01b0\u0005\u0003\u0000\u0000\u01af\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01af"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b3\u01af\u0001\u0000\u0000\u0000\u01b3\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b4\u01bf\u0001\u0000\u0000\u0000\u01b5\u01bb"+
		"\u0005\'\u0000\u0000\u01b6\u01b8\u0005\u0003\u0000\u0000\u01b7\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b7\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01b5\u0001"+
		"\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\'\u0001\u0000"+
		"\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c3\u0006\u0014"+
		"\uffff\uffff\u0000\u01c3\u01c4\u0003*\u0015\u0000\u01c4\u01c5\u0006\u0014"+
		"\uffff\uffff\u0000\u01c5\u01cc\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005"+
		"4\u0000\u0000\u01c7\u01c8\u0003*\u0015\u0000\u01c8\u01c9\u0006\u0014\uffff"+
		"\uffff\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01c6\u0001\u0000"+
		"\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd)\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d0\u0006\u0015\uffff"+
		"\uffff\u0000\u01d0\u01d1\u0003\u0016\u000b\u0000\u01d1\u01d2\u0006\u0015"+
		"\uffff\uffff\u0000\u01d2\u01db\u0001\u0000\u0000\u0000\u01d3\u01d4\u0003"+
		"\"\u0011\u0000\u01d4\u01d5\u0006\u0015\uffff\uffff\u0000\u01d5\u01dc\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d7\u00030\u0018\u0000\u01d7\u01d8\u0006\u0015"+
		"\uffff\uffff\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001"+
		"\u0000\u0000\u0000\u01db\u01d3\u0001\u0000\u0000\u0000\u01db\u01d9\u0001"+
		"\u0000\u0000\u0000\u01dc+\u0001\u0000\u0000\u0000\u01dd\u01de\u0006\u0016"+
		"\uffff\uffff\u0000\u01de\u01df\u0005D\u0000\u0000\u01df\u01e5\u0006\u0016"+
		"\uffff\uffff\u0000\u01e0\u01e1\u00054\u0000\u0000\u01e1\u01e2\u0005D\u0000"+
		"\u0000\u01e2\u01e4\u0006\u0016\uffff\uffff\u0000\u01e3\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6-\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e9\u0006\u0017\uffff"+
		"\uffff\u0000\u01e9\u01ea\u0003 \u0010\u0000\u01ea\u01eb\u0006\u0017\uffff"+
		"\uffff\u0000\u01eb\u01ef\u0001\u0000\u0000\u0000\u01ec\u01ed\u00030\u0018"+
		"\u0000\u01ed\u01ee\u0006\u0017\uffff\uffff\u0000\u01ee\u01f0\u0001\u0000"+
		"\u0000\u0000\u01ef\u01ec\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f0/\u0001\u0000\u0000\u0000\u01f1\u01f2\u0006\u0018\uffff"+
		"\uffff\u0000\u01f2\u01f3\u0003&\u0013\u0000\u01f3\u01f4\u0006\u0018\uffff"+
		"\uffff\u0000\u01f4\u0201\u0001\u0000\u0000\u0000\u01f5\u01f6\u0006\u0018"+
		"\uffff\uffff\u0000\u01f6\u01f7\u00032\u0019\u0000\u01f7\u01f8\u0006\u0018"+
		"\uffff\uffff\u0000\u01f8\u0201\u0001\u0000\u0000\u0000\u01f9\u01fa\u0006"+
		"\u0018\uffff\uffff\u0000\u01fa\u01fb\u0003&\u0013\u0000\u01fb\u01fc\u0006"+
		"\u0018\uffff\uffff\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u00032\u0019\u0000\u01fe\u01ff\u0006\u0018\uffff\uffff\u0000\u01ff\u0201"+
		"\u0001\u0000\u0000\u0000\u0200\u01f1\u0001\u0000\u0000\u0000\u0200\u01f5"+
		"\u0001\u0000\u0000\u0000\u0200\u01f9\u0001\u0000\u0000\u0000\u02011\u0001"+
		"\u0000\u0000\u0000\u0202\u0203\u0006\u0019\uffff\uffff\u0000\u0203\u0204"+
		"\u0006\u0019\uffff\uffff\u0000\u0204\u0205\u0005\u0019\u0000\u0000\u0205"+
		"\u0209\u0006\u0019\uffff\uffff\u0000\u0206\u0207\u0003\n\u0005\u0000\u0207"+
		"\u0208\u0006\u0019\uffff\uffff\u0000\u0208\u020a\u0001\u0000\u0000\u0000"+
		"\u0209\u0206\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000"+
		"\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u0219\u0005\u001a\u0000\u0000"+
		"\u020c\u020d\u0006\u0019\uffff\uffff\u0000\u020d\u020e\u0005\u0017\u0000"+
		"\u0000\u020e\u0215\u0006\u0019\uffff\uffff\u0000\u020f\u0210\u00030\u0018"+
		"\u0000\u0210\u0211\u0006\u0019\uffff\uffff\u0000\u0211\u0216\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u0003(\u0014\u0000\u0213\u0214\u0006\u0019\uffff"+
		"\uffff\u0000\u0214\u0216\u0001\u0000\u0000\u0000\u0215\u020f\u0001\u0000"+
		"\u0000\u0000\u0215\u0212\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0219\u0005\u0018"+
		"\u0000\u0000\u0218\u0202\u0001\u0000\u0000\u0000\u0218\u020c\u0001\u0000"+
		"\u0000\u0000\u0219\u022e\u0001\u0000\u0000\u0000\u021a\u021b\n\u0002\u0000"+
		"\u0000\u021b\u021c\u0006\u0019\uffff\uffff\u0000\u021c\u0220\u0005\u0019"+
		"\u0000\u0000\u021d\u021e\u0003\n\u0005\u0000\u021e\u021f\u0006\u0019\uffff"+
		"\uffff\u0000\u021f\u0221\u0001\u0000\u0000\u0000\u0220\u021d\u0001\u0000"+
		"\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000"+
		"\u0000\u0000\u0222\u022d\u0005\u001a\u0000\u0000\u0223\u0224\n\u0001\u0000"+
		"\u0000\u0224\u0225\u0006\u0019\uffff\uffff\u0000\u0225\u0229\u0005\u0017"+
		"\u0000\u0000\u0226\u0227\u0003(\u0014\u0000\u0227\u0228\u0006\u0019\uffff"+
		"\uffff\u0000\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u0226\u0001\u0000"+
		"\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000"+
		"\u0000\u0000\u022b\u022d\u0005\u0018\u0000\u0000\u022c\u021a\u0001\u0000"+
		"\u0000\u0000\u022c\u0223\u0001\u0000\u0000\u0000\u022d\u0230\u0001\u0000"+
		"\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000"+
		"\u0000\u0000\u022f3\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000"+
		"\u0000\u0231\u0232\u0006\u001a\uffff\uffff\u0000\u0232\u0233\u0003\n\u0005"+
		"\u0000\u0233\u0234\u0006\u001a\uffff\uffff\u0000\u0234\u0242\u0001\u0000"+
		"\u0000\u0000\u0235\u0236\u0006\u001a\uffff\uffff\u0000\u0236\u0237\u0005"+
		"\u001b\u0000\u0000\u0237\u0238\u0006\u001a\uffff\uffff\u0000\u0238\u0239"+
		"\u0001\u0000\u0000\u0000\u0239\u023a\u00036\u001b\u0000\u023a\u023b\u0006"+
		"\u001a\uffff\uffff\u0000\u023b\u023d\u0001\u0000\u0000\u0000\u023c\u023e"+
		"\u00054\u0000\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023d\u023e\u0001"+
		"\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240\u0005"+
		"\u001c\u0000\u0000\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u0231\u0001"+
		"\u0000\u0000\u0000\u0241\u0235\u0001\u0000\u0000\u0000\u02425\u0001\u0000"+
		"\u0000\u0000\u0243\u0247\u0006\u001b\uffff\uffff\u0000\u0244\u0245\u0003"+
		"8\u001c\u0000\u0245\u0246\u0006\u001b\uffff\uffff\u0000\u0246\u0248\u0001"+
		"\u0000\u0000\u0000\u0247\u0244\u0001\u0000\u0000\u0000\u0247\u0248\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024a\u0003"+
		"4\u001a\u0000\u024a\u024b\u0006\u001b\uffff\uffff\u0000\u024b\u0257\u0001"+
		"\u0000\u0000\u0000\u024c\u0250\u00054\u0000\u0000\u024d\u024e\u00038\u001c"+
		"\u0000\u024e\u024f\u0006\u001b\uffff\uffff\u0000\u024f\u0251\u0001\u0000"+
		"\u0000\u0000\u0250\u024d\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000"+
		"\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0253\u00034\u001a"+
		"\u0000\u0253\u0254\u0006\u001b\uffff\uffff\u0000\u0254\u0256\u0001\u0000"+
		"\u0000\u0000\u0255\u024c\u0001\u0000\u0000\u0000\u0256\u0259\u0001\u0000"+
		"\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000"+
		"\u0000\u0000\u02587\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0006\u001c\uffff\uffff\u0000\u025b\u025c\u0003:\u001d"+
		"\u0000\u025c\u0262\u0006\u001c\uffff\uffff\u0000\u025d\u025e\u0003:\u001d"+
		"\u0000\u025e\u025f\u0006\u001c\uffff\uffff\u0000\u025f\u0261\u0001\u0000"+
		"\u0000\u0000\u0260\u025d\u0001\u0000\u0000\u0000\u0261\u0264\u0001\u0000"+
		"\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000"+
		"\u0000\u0000\u0263\u0265\u0001\u0000\u0000\u0000\u0264\u0262\u0001\u0000"+
		"\u0000\u0000\u0265\u0266\u00055\u0000\u0000\u02669\u0001\u0000\u0000\u0000"+
		"\u0267\u0268\u0006\u001d\uffff\uffff\u0000\u0268\u0269\u0005\u0019\u0000"+
		"\u0000\u0269\u026a\u0006\u001d\uffff\uffff\u0000\u026a\u026b\u0001\u0000"+
		"\u0000\u0000\u026b\u026c\u0003\n\u0005\u0000\u026c\u026d\u0006\u001d\uffff"+
		"\uffff\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026f\u0005\u001a"+
		"\u0000\u0000\u026f\u0276\u0001\u0000\u0000\u0000\u0270\u0271\u0006\u001d"+
		"\uffff\uffff\u0000\u0271\u0272\u0005C\u0000\u0000\u0272\u0273\u0006\u001d"+
		"\uffff\uffff\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0276\u0005"+
		"D\u0000\u0000\u0275\u0267\u0001\u0000\u0000\u0000\u0275\u0270\u0001\u0000"+
		"\u0000\u0000\u0276;\u0001\u0000\u0000\u0000\u0277\u0278\u0003>\u001f\u0000"+
		"\u0278\u0279\u0006\u001e\uffff\uffff\u0000\u0279\u0287\u0001\u0000\u0000"+
		"\u0000\u027a\u027b\u0003B!\u0000\u027b\u027c\u0006\u001e\uffff\uffff\u0000"+
		"\u027c\u0287\u0001\u0000\u0000\u0000\u027d\u027e\u0003D\"\u0000\u027e"+
		"\u027f\u0006\u001e\uffff\uffff\u0000\u027f\u0287\u0001\u0000\u0000\u0000"+
		"\u0280\u0281\u0003F#\u0000\u0281\u0282\u0006\u001e\uffff\uffff\u0000\u0282"+
		"\u0287\u0001\u0000\u0000\u0000\u0283\u0284\u0003N\'\u0000\u0284\u0285"+
		"\u0006\u001e\uffff\uffff\u0000\u0285\u0287\u0001\u0000\u0000\u0000\u0286"+
		"\u0277\u0001\u0000\u0000\u0000\u0286\u027a\u0001\u0000\u0000\u0000\u0286"+
		"\u027d\u0001\u0000\u0000\u0000\u0286\u0280\u0001\u0000\u0000\u0000\u0286"+
		"\u0283\u0001\u0000\u0000\u0000\u0287=\u0001\u0000\u0000\u0000\u0288\u0289"+
		"\u0006\u001f\uffff\uffff\u0000\u0289\u028a\u0005\u001b\u0000\u0000\u028a"+
		"\u028b\u0006\u001f\uffff\uffff\u0000\u028b\u0293\u0001\u0000\u0000\u0000"+
		"\u028c\u028d\u0003@ \u0000\u028d\u028e\u0006\u001f\uffff\uffff\u0000\u028e"+
		"\u0290\u0001\u0000\u0000\u0000\u028f\u028c\u0001\u0000\u0000\u0000\u0290"+
		"\u0291\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0291"+
		"\u0292\u0001\u0000\u0000\u0000\u0292\u0294\u0001\u0000\u0000\u0000\u0293"+
		"\u028f\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294"+
		"\u0295\u0001\u0000\u0000\u0000\u0295\u0296\u0005\u001c\u0000\u0000\u0296"+
		"?\u0001\u0000\u0000\u0000\u0297\u0298\u0003<\u001e\u0000\u0298\u0299\u0006"+
		" \uffff\uffff\u0000\u0299\u029e\u0001\u0000\u0000\u0000\u029a\u029b\u0003"+
		"\u0014\n\u0000\u029b\u029c\u0006 \uffff\uffff\u0000\u029c\u029e\u0001"+
		"\u0000\u0000\u0000\u029d\u0297\u0001\u0000\u0000\u0000\u029d\u029a\u0001"+
		"\u0000\u0000\u0000\u029eA\u0001\u0000\u0000\u0000\u029f\u02a0\u0006!\uffff"+
		"\uffff\u0000\u02a0\u02a1\u0003\n\u0005\u0000\u02a1\u02a2\u0006!\uffff"+
		"\uffff\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a4\u00053\u0000"+
		"\u0000\u02a4\u02a9\u0001\u0000\u0000\u0000\u02a5\u02a6\u0006!\uffff\uffff"+
		"\u0000\u02a6\u02a7\u00053\u0000\u0000\u02a7\u02a9\u0006!\uffff\uffff\u0000"+
		"\u02a8\u029f\u0001\u0000\u0000\u0000\u02a8\u02a5\u0001\u0000\u0000\u0000"+
		"\u02a9C\u0001\u0000\u0000\u0000\u02aa\u02ab\u0006\"\uffff\uffff\u0000"+
		"\u02ab\u02ac\u0005\n\u0000\u0000\u02ac\u02ad\u0006\"\uffff\uffff\u0000"+
		"\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02af\u0005\u0017\u0000\u0000"+
		"\u02af\u02b0\u0003\n\u0005\u0000\u02b0\u02b1\u0006\"\uffff\uffff\u0000"+
		"\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005\u0018\u0000\u0000"+
		"\u02b3\u02b4\u0003<\u001e\u0000\u02b4\u02b5\u0006\"\uffff\uffff\u0000"+
		"\u02b5\u02ba\u0001\u0000\u0000\u0000\u02b6\u02b7\u0005\u0007\u0000\u0000"+
		"\u02b7\u02b8\u0003<\u001e\u0000\u02b8\u02b9\u0006\"\uffff\uffff\u0000"+
		"\u02b9\u02bb\u0001\u0000\u0000\u0000\u02ba\u02b6\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bbE\u0001\u0000\u0000\u0000\u02bc"+
		"\u02bd\u0005\u0015\u0000\u0000\u02bd\u02be\u0006#\uffff\uffff\u0000\u02be"+
		"\u02bf\u0005\u0017\u0000\u0000\u02bf\u02c0\u0003\n\u0005\u0000\u02c0\u02c1"+
		"\u0006#\uffff\uffff\u0000\u02c1\u02c2\u0005\u0018\u0000\u0000\u02c2\u02c3"+
		"\u0003<\u001e\u0000\u02c3\u02c4\u0006#\uffff\uffff\u0000\u02c4\u02da\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c6\u0005\u0005\u0000\u0000\u02c6\u02c7\u0006"+
		"#\uffff\uffff\u0000\u02c7\u02c8\u0003<\u001e\u0000\u02c8\u02c9\u0006#"+
		"\uffff\uffff\u0000\u02c9\u02ca\u0005\u0015\u0000\u0000\u02ca\u02cb\u0005"+
		"\u0017\u0000\u0000\u02cb\u02cc\u0003\n\u0005\u0000\u02cc\u02cd\u0006#"+
		"\uffff\uffff\u0000\u02cd\u02ce\u0005\u0018\u0000\u0000\u02ce\u02cf\u0005"+
		"3\u0000\u0000\u02cf\u02da\u0001\u0000\u0000\u0000\u02d0\u02d1\u0005\t"+
		"\u0000\u0000\u02d1\u02d2\u0006#\uffff\uffff\u0000\u02d2\u02d3\u0005\u0017"+
		"\u0000\u0000\u02d3\u02d4\u0003H$\u0000\u02d4\u02d5\u0006#\uffff\uffff"+
		"\u0000\u02d5\u02d6\u0005\u0018\u0000\u0000\u02d6\u02d7\u0003<\u001e\u0000"+
		"\u02d7\u02d8\u0006#\uffff\uffff\u0000\u02d8\u02da\u0001\u0000\u0000\u0000"+
		"\u02d9\u02bc\u0001\u0000\u0000\u0000\u02d9\u02c5\u0001\u0000\u0000\u0000"+
		"\u02d9\u02d0\u0001\u0000\u0000\u0000\u02daG\u0001\u0000\u0000\u0000\u02db"+
		"\u02e4\u0006$\uffff\uffff\u0000\u02dc\u02dd\u0003J%\u0000\u02dd\u02de"+
		"\u0006$\uffff\uffff\u0000\u02de\u02e5\u0001\u0000\u0000\u0000\u02df\u02e0"+
		"\u0003\n\u0005\u0000\u02e0\u02e1\u0006$\uffff\uffff\u0000\u02e1\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e2\u02df\u0001\u0000\u0000\u0000\u02e2\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e5\u0001\u0000\u0000\u0000\u02e4\u02dc"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e5\u02e6"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e7\u00053\u0000\u0000\u02e7\u02eb\u0006"+
		"$\uffff\uffff\u0000\u02e8\u02e9\u0003L&\u0000\u02e9\u02ea\u0006$\uffff"+
		"\uffff\u0000\u02ea\u02ec\u0001\u0000\u0000\u0000\u02eb\u02e8\u0001\u0000"+
		"\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000"+
		"\u0000\u0000\u02ed\u02f1\u00053\u0000\u0000\u02ee\u02ef\u0003L&\u0000"+
		"\u02ef\u02f0\u0006$\uffff\uffff\u0000\u02f0\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f1\u02ee\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f2I\u0001\u0000\u0000\u0000\u02f3\u02f4\u0006%\uffff\uffff\u0000\u02f4"+
		"\u02f5\u0003\u0016\u000b\u0000\u02f5\u02f6\u0006%\uffff\uffff\u0000\u02f6"+
		"\u02fa\u0001\u0000\u0000\u0000\u02f7\u02f8\u0003\u001a\r\u0000\u02f8\u02f9"+
		"\u0006%\uffff\uffff\u0000\u02f9\u02fb\u0001\u0000\u0000\u0000\u02fa\u02f7"+
		"\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fbK\u0001"+
		"\u0000\u0000\u0000\u02fc\u02fd\u0006&\uffff\uffff\u0000\u02fd\u02fe\u0003"+
		"\n\u0005\u0000\u02fe\u02ff\u0006&\uffff\uffff\u0000\u02ff\u0306\u0001"+
		"\u0000\u0000\u0000\u0300\u0301\u00054\u0000\u0000\u0301\u0302\u0003\n"+
		"\u0005\u0000\u0302\u0303\u0006&\uffff\uffff\u0000\u0303\u0305\u0001\u0000"+
		"\u0000\u0000\u0304\u0300\u0001\u0000\u0000\u0000\u0305\u0308\u0001\u0000"+
		"\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000"+
		"\u0000\u0000\u0307M\u0001\u0000\u0000\u0000\u0308\u0306\u0001\u0000\u0000"+
		"\u0000\u0309\u0315\u0006\'\uffff\uffff\u0000\u030a\u030b\u0005\u0004\u0000"+
		"\u0000\u030b\u0316\u0006\'\uffff\uffff\u0000\u030c\u030d\u0005\u0001\u0000"+
		"\u0000\u030d\u0316\u0006\'\uffff\uffff\u0000\u030e\u030f\u0005\r\u0000"+
		"\u0000\u030f\u0313\u0006\'\uffff\uffff\u0000\u0310\u0311\u0003\n\u0005"+
		"\u0000\u0311\u0312\u0006\'\uffff\uffff\u0000\u0312\u0314\u0001\u0000\u0000"+
		"\u0000\u0313\u0310\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000\u0000"+
		"\u0000\u0314\u0316\u0001\u0000\u0000\u0000\u0315\u030a\u0001\u0000\u0000"+
		"\u0000\u0315\u030c\u0001\u0000\u0000\u0000\u0315\u030e\u0001\u0000\u0000"+
		"\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0318\u00053\u0000\u0000"+
		"\u0318O\u0001\u0000\u0000\u0000IXbmsz\u0086\u0091\u009f\u00a9\u00b6\u00c4"+
		"\u00d3\u00db\u00fa\u0108\u010a\u010c\u0118\u012b\u0137\u0142\u014d\u0159"+
		"\u0164\u016f\u0174\u0181\u018d\u0195\u01a1\u01a3\u01a6\u01a8\u01b1\u01b3"+
		"\u01b9\u01bb\u01bf\u01cc\u01d9\u01db\u01e5\u01ef\u0200\u0209\u0215\u0218"+
		"\u0220\u0229\u022c\u022e\u023d\u0241\u0247\u0250\u0257\u0262\u0275\u0286"+
		"\u0291\u0293\u029d\u02a8\u02ba\u02d9\u02e2\u02e4\u02eb\u02f1\u02fa\u0306"+
		"\u0313\u0315";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}