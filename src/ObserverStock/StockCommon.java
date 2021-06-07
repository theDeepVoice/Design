package ObserverStock;

public class StockCommon extends AStrockPrice{
    public StockCommon(String code){
    super(code);
}
    @Override
    protected void notifyHolder() {
        System.out.println("普通股票更新了,code:"+code);
        for (IStockHolder iStockHolder:stockHoldersList)
            iStockHolder.update(this);
        price2=price;
    }
}
