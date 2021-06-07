package Memento;

public class MementoChess {
    private int X;
    private int Y;
    private String Label;

    public MementoChess(String label,int x,int y){
        this.Label=label;
        this.X=x;
        this.Y=y;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }
}
