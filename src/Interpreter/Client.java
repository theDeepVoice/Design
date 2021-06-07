package Interpreter;

public class Client {
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        System.out.println("John is male?" + isMale.interpret("John"));
        System.out.println("Julie is married women?" + isMarriedWoman.interpret("Married Julie"));


    }


    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression Julie = new TerminalExpression("Julie");
        Expression Married = new TerminalExpression("Married");
        return new AndExpression(Julie, Married);

    }

}
