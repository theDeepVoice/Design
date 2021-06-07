package Decorator;

public class Cream extends Decorating{
    public void PutCream(){
        System.out.println("Add Cream!!");
    }
    public Cream(BirthdayCake birthdayCake) {
        super(birthdayCake);
    }
}
