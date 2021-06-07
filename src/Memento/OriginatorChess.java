package Memento;

public class OriginatorChess {
    private MementoChess mementoChess;
    public OriginatorChess(MementoChess mem){
        this.mementoChess=mem;
    }
    public void setX(int x){
        mementoChess.setX(x);
    }
    public void setY(int Y){
        mementoChess.setY(Y);
    }
    public MementoChess SaveToMemento(){
        return new MementoChess(mementoChess.getLabel(),mementoChess.getX(),mementoChess.getY());
    }
    public void Restore(MementoChess mem){
        this.mementoChess.setLabel(mem.getLabel());
        this.mementoChess.setY(mem.getY());
        this.mementoChess.setX(mem.getX());
    }
    public void Show(){
        System.out.println("当前棋子状态:"+mementoChess.getLabel()+"("+mementoChess.getX()+","+mementoChess.getY()+")");
    }
}
