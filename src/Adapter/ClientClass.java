package Adapter;

public class ClientClass {
    public static void main(String[] args) {
        NewJuicer newJuicer=new Adapter();
        MyFruit f1 =new Apple();
        MyFruit f2 =new Banana();
        System.out.println(newJuicer.newPort(f1,f2));

    }

}
