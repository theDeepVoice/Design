package DynamicProxy;

public class ClientClass {
    public static void main(String[] args) throws InterruptedException {
//        IShowPic isp =new CRemoPic();
//        CLocalPicShow cLocalPicShow=new CLocalPicShow(isp);
//        IShowPic localpic=(IShowPic)cLocalPicShow.getTargetInstance();
//        localpic.ShowPic("aaa");

        ITestInterface iTestInterface =new CTest();
        ITestInterface proxy =(ITestInterface)new CLocalPicShow(iTestInterface).getTargetInstance();
        proxy.SendMessage("aaaaa");

    }
}
