package Template;

public abstract class ADefiniteIntegral {
    abstract protected double getA();//下限
    abstract protected double getB();//上限
    abstract protected int getC();//切分单元格
    abstract protected double function(double x);
    public final double CalDefiniteIntegral(){
        double a=0,b=0,t=0,sum=0;
        int c=0;
        a=getA();b=getB();c=getC();
        if (a>b){
            t=a;a=b;b=t;
        }
        t=(b-a)/(double) c;
        for (int i=0;i<c;i++){
            sum=sum+t*function(a+i*t);
        }
        return sum;

    }
}
