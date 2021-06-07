package Template;

public class DefIntegralLn extends ADefiniteIntegral{
    private double a,b;
    private int c;
    public DefIntegralLn(double a, double b, int c){
        this.a=a;this.b=b;this.c=c;
    }
    @Override
    protected double getA() {
        return a;
    }

    @Override
    protected double getB() {
        return b;
    }

    @Override
    protected int getC() {
        return c;
    }

    @Override
    protected double function(double x) {
        return Math.log(x);
    }
}
