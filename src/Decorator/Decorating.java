package Decorator;

public class Decorating implements BirthdayCake{
    private  BirthdayCake birthdayCake;
    public Decorating(BirthdayCake birthdayCake){
        this.birthdayCake=birthdayCake;
    }

    @Override
    public void Show() {
        birthdayCake.Show();
    }
}
