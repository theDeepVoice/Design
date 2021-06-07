package Proxy;

public class CRemoPic implements IShowPic{
    @Override
    public void ShowPic(String picName) throws InterruptedException {
        for (int i=0;i<3;i++){
            System.out.println(i+1);
            Thread.sleep(1000);
        }
    }
}
