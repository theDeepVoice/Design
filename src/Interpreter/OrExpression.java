package Interpreter;

public class OrExpression implements Expression{
    private Expression expression1=null;
    private Expression expression2=null;
    public OrExpression(Expression e1,Expression e2){
        this.expression1=e1;
        this.expression2=e2;
    }
    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context)||expression2.interpret(context);
    }
}
