package Observer;

public class ConcreteSubjectB extends SubjectS{
    public ConcreteSubjectB(){
        super();
    }
    @Override
    public void notifyObserver() {
        System.out.println("B目标发生变化了");
        for (ObserverO obs:observers){
            obs.response();
        }
    }
}
