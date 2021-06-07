package FlyWeight;

public abstract class APiece {
    protected String inKind;
    public APiece(String inKind){
        this.inKind=inKind;
    }
    public abstract void Play(int x,int y);
}
