package Facade;

public class Light {
    private String position;
    Light(String string){
        this.position=string;
    }
   public void on(){
        System.out.println(this.position+" 灯打开");
    }
    public void off(){
        System.out.println(this.position+" 灯关闭");
    }
}
