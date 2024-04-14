public class TestExpressionConverter {
    public static void main(String[] args) {
        String infixExpression = "A + B * C - (D / E + F) * G";

        String postfixExpression = ExpressionConverter.infixToPostfix(infixExpression);
        System.out.println("Postfix expression: " + postfixExpression); // prints "ABC*+DE/F+G*-"

        String prefixExpression = ExpressionConverter.infixToPrefix(infixExpression);
        System.out.println("Prefix expression: " + prefixExpression); // prints "-+A*BC-*D/E+FG"
    }
}