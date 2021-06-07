package Strategy;

public class ClientClass {
    public static void main(String[] args) {
        Chef chef=new Chef();
        ICutFruit cut=new MultiBlade();
        chef.SetCutMethod(cut);
        chef.CutFruit("橙子");
    }
}
