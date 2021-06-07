package Memento;

import java.util.ArrayList;

public class CareTakerChess {
    private ArrayList<MementoChess>memlist=new ArrayList<>();
    public void AddMem(MementoChess mem){
        memlist.add(mem);
    }
    public MementoChess getMem(int i){
        return memlist.get(i);
    }
}
