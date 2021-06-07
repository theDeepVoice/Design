package Command;

import java.util.ArrayList;

public class WaiterInvoker {
    private ArrayList<Command>commands=null;
    public WaiterInvoker(){
        commands=new ArrayList<Command>();

    }

    public void setCommands(Command cmd) {
        commands.add(cmd);
    }
    public void OrderUp(){
        System.out.println("有订单");
        for (Command cmd:commands){
            if (cmd!=null)
                cmd.execute();
        }
    }
}
