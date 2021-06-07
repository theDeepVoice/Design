package Decorator;

public class Fruit extends Decorating{
    public void PutFruit(){
        System.out.println("Add Fruit!!");
    }
    public Fruit(BirthdayCake birthdayCake) {
        super(birthdayCake);
    }
}
