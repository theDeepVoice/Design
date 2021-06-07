package ObserverStock;

public class StockFutures extends AStrockPrice{
    public StockFutures(String code){
        super(code);
    }
    @Override
    protected void notifyHolder() {
        System.out.println("期货更新了,code:"+code);
        for (IStockHolder iStockHolder:stockHoldersList)
            iStockHolder.update(this);
        price2=price;
    }
}
