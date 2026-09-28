package main.ast.nodes.expression;

import main.ast.nodes.initializer.InitializerList;
import main.ast.nodes.type.TypeName;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class PrefixExpression extends Expression {

    public PrefixExpression() { }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }

    private TypeName typeName;

    public InitializerList getInitializerList() {
        return initializerList;
    }

    public void setInitializerList(InitializerList initializerList) {
        this.initializerList = initializerList;
    }

    private InitializerList initializerList;

    public UnaryOperator getUnaryOperator() {
        return unaryOperator;
    }

    public void setUnaryOperator(UnaryOperator unaryOperator) {
        this.unaryOperator = unaryOperator;
    }

    private UnaryOperator unaryOperator;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    private Expression expression;

    public CastExpression getCastExpression() {
        return castExpression;
    }

    public void setCastExpression(CastExpression castExpression) {
        this.castExpression = castExpression;
    }

    private CastExpression castExpression;


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {

        this.identifier = identifier;
        this.identifierExpression = new IdentifierExpression(identifier);
    }

    private String identifier;

    public IdentifierExpression getIdentifierExpression() {
        return identifierExpression;
    }

    public void setIdentifierExpression(IdentifierExpression identifierExpression) {
        this.identifierExpression = identifierExpression;
    }

    private IdentifierExpression identifierExpression;

    public String getConstant() {
        return constant;
    }

    public void setConstant(String constant) {
        this.constant = constant;
    }

    private String constant;

    public ArrayList<String> getStringLiterals() {
        return stringLiterals;
    }

    public void setStringLiterals(ArrayList<String> stringLiteralExpressions) {
        this.stringLiterals = stringLiteralExpressions;
    }

    public void addStringLiteral(String stringLiteralExpression) {
        this.stringLiterals.add(stringLiteralExpression);
    }

    private ArrayList<String> stringLiterals;

    public ArrayList<String> getPrefixes() {
        return prefixes;
    }

    public void setPrefixes(ArrayList<String> prefixes) {
        this.prefixes = prefixes;
    }

    public void addPrefix(String prefix) {
        this.prefixes.add(prefix);
    }

    private ArrayList<String> prefixes = new ArrayList<>();


}
