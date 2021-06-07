package Command;

public class OrderCommand implements Command{
    private Order order;
    private Operator receiver;
    public OrderCommand(Operator receiver,Order order){
        this.receiver=receiver;
        this.order=order;

    }
    @Override
    public void execute() {
    System.out.println(order.getID()+"号顾客的成品");
    receiver.MakeFruit(order);
    }
}
