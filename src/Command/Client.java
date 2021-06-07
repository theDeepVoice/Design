package Command;

public class Client {
    public static void main(String[] args) {
        //创建多个订单
        Order order1=new Order();
        order1.setID(1);
        order1.setFruitMap("梨子",1);
        order1.setFruitMap("桃子",2);
        order1.setFruitMap("香蕉",3);

        Order order2=new Order();
        order2.setID(2);
        order2.setFruitMap("苹果",1);
        order2.setFruitMap("西瓜",2);
        order2.setFruitMap("菠萝",3);
        //创建操作者
        Operator op =new Operator();

        //将多个订单封装成命令对象
        OrderCommand cmd1=new OrderCommand(op,order1);
        OrderCommand cmd2=new OrderCommand(op,order2);

        //创建调用者并加命令
        WaiterInvoker waiter =new WaiterInvoker();
        waiter.setCommands(cmd1);
        waiter.setCommands(cmd2);


        //执行命令
        waiter.OrderUp();
    }
}
