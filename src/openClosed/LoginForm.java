package openClosed;

public class LoginForm {
    private abstractButton button;

    public void display( abstractButton button){
        button.view();
    }

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();

        abstractButton button1 = new CircleButton();
        loginForm.display(button1);

        abstractButton button2 = new RectangleButton();
        loginForm.display(button2);



    }

}
