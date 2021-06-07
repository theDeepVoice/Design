package Adapter;

public class OldJuicer {
    public String onePort(MyFruit fruit){
        String str=fruit.getKind()+"果汁";
        return str;
    }
}
