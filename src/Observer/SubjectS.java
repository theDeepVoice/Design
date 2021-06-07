package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectS {
    protected List<ObserverO> observers;
    public SubjectS(){
        observers =new ArrayList<ObserverO>();
    }
    public void Add(ObserverO observerO){
        observers.add(observerO);
    }
    public void Remove(ObserverO observerO){
        observers.remove(observerO);
    }
    public abstract void notifyObserver();

}
