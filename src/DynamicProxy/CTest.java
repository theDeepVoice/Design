package DynamicProxy;

public class CTest implements ITestInterface{
    @Override
    public void SendMessage(String message) throws InterruptedException {
        for (int i=5;i>0;i--){
            System.out.println(message+"  i="+i);
            Thread.sleep(1000);
        }
        System.out.println("i is ok!");
    }
}
