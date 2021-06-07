package Observer;

public class ConcreteObserver1 implements ObserverO{
    @Override
    public void response() {
        System.out.println("目标变化了，1的反应");
    }
}
