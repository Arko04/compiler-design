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

/*GOALs:
*   1. print out scope changes each time a new scope starts
*   2. print the identifier if it is initialized
*   3. print the identifier if it is used
*   4. print out the name of the function when it is defined
*   5. print out the name of the function when it is used
*
* */

public abstract class Visitor<T> implements IVisitor<T> {
    @Override

    public T visit(Program program) {
        return null;
    }

    public T visit(TranslationUnit translationUnit) {
        return null;
    }

    public T visit(ExternalDeclaration externalDeclaration) {
        return null;
    }

    public T visit(FunctionDefinition functionDefinition) {
        return null;
    }

    public T visit(Declaration declaration) {
        return null;
    }

    public T visit(DeclarationSpecifiers declarationSpecifier) {
        return null;
    }

    public T visit(Declarator declarator) {
        return null;
    }

    public T visit(DeclarationList declarationList) {
        return null;
    }

//    public abstract Void visit(Statement statement);

    public T visit(CompoundStatement compoundStatement) {
        return null;
    }

    public T visit(IdentifierExpression identifier) {
        return null;
    }

    public T visit(ConstantExpression constant) {
        return null;
    }

    public T visit(StringLiteralExpression stringLiteral) { return null; }

    public T visit(UnaryOperator unaryOperator) {
        return null;
    }

    public T visit(TypeName typeName) {
        return null;
    }

    public T visit(CastExpression castExpression) {
        return null;
    }

    public T visit(DigitSequence digitSequence) {
        return null;
    }

    public T visit(ArgumentExpressionList argumentExpressionList) {
        return null;
    }

    public T visit(AssignmentOperator assignmentOperator) {
        return null;
    }

    public T visit(InitDeclaratorList initDeclarationList) {
        return null;
    }

    public T visit(InitDeclarator initDeclarator) {
        return null;
    }

    public T visit(ForExpression forExpression) {
        return null;
    }

    public T visit(ForDeclaration forDeclaration) {
        return null;
    }

    public T visit(ExpressionStatement expressionStatement) {
        return null;
    }

    public T visit(SelectionStatement selectionStatement) {
        return null;
    }

    public T visit(JumpStatement jumpStatement) {
        return null;
    }

    public T visit(IterationStatement iterationStatement) {
        return null;
    }

    public T visit(ForCondition forCondition) {
        return null;
    }

    public T visit(Designator designator) {
        return null;
    }

    public T visit(Designation designation) {
        return null;
    }

    public T visit(InitializerList initializerList) {
        return null;
    }

    public T visit(Initializer initializer) {
        return null;
    }

    public T visit(Pointer pointer) {
        return null;
    }

    public T visit(ParameterList parameterList) {
        return null;
    }

    public T visit(ParameterDeclaration parameterDeclaration) {
        return null;
    }

    public T visit(IdentifierList identifierList) {
        return null;
    }

    public T visit(AbstractDeclarator abstractDeclarator) {
        return null;
    }

    public T visit(DirectAbstractDeclarator directAbstractDeclarator) {
        return null;
    }

    public T visit(DeclarationSpecifier declarationSpecifier) {
        return null;
    }

    public T visit(IdentifierDeclarator identifierDeclarator) { return null; }

    public T visit(ParenDeclarator parenDeclarator) { return null; }

    public T visit(ArrayDeclarator arrayDeclarator) { return null; }

    public T visit(FunctionDeclarator functionDeclarator) { return null; }

    public T visit(DirectDeclarator directDeclarator) { return null; }

    public T visit(TypeSpecifier typeSpecifier) { return null; }

    public T visit(SpecifierQualifierList specifierQualifierList) { return null; }

    public T visit(BinaryExpression binaryExpression) { return null; }

    public T visit(ArrayAccessExpression arrayAccessExpression) { return null; }

    public T visit(PostfixExpression postfixExpression) { return null; }

    public T visit(FunctionCallExpression functionCallExpression) { return null; }

    public T visit(ParenExpression parenExpression) { return null; }

    public T visit(TernaryExpression ternaryExpression) { return null; }

    public T visit(AssignmentExpression assignmentExpression) { return null; }

    public T visit(CommaExpression commaExpression) { return null; }

    public T visit(CompoundLiteralExpression compoundLiteralExpression) { return null; }

    public T visit(TypeCastExpression typeCastExpression) { return null; }

    public T visit(PrefixExpression prefixExpression) { return null; }

}
