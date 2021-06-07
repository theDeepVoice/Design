package Decorator;

public class ClientClass {
    public static void main(String[] args) {
        BirthdayCake birthdayCake =new Cake();
        birthdayCake.Show();
        Cream cream= new Cream(birthdayCake);
        cream.PutCream();
        Fruit fruit=new Fruit(cream);
        fruit.PutFruit();
        fruit.Show();


    }
}
