package Proxy;

public class CLocalPicShow implements IShowPic, Runnable {
    private IShowPic pic;
    private String picname;

    @Override
    public void ShowPic(String picName) throws InterruptedException {
        pic = new CRemoPic();
        this.picname = picName;
        System.out.println("准备载入图片：" + picname);
        Thread th = new Thread(this);
        th.start();
    }

    @Override
    public void run() {
        try {
            pic.ShowPic(picname);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(picname + "图片调用完成!");
    }
}
