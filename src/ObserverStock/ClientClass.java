package ObserverStock;

public class ClientClass {
    public static void main(String[] args) {

        AStrockPrice futures1=new StockFutures("1");
        AStrockPrice futures2=new StockFutures("2");
        AStrockPrice futures3=new StockFutures("3");

        AStrockPrice common1=new StockCommon("4");
        AStrockPrice common2=new StockCommon("5");
        AStrockPrice common3=new StockCommon("6");


        IStockHolder buy1=new BuyHolder("b1");
        IStockHolder buy2=new BuyHolder("b2");
        IStockHolder buy3=new BuyHolder("b3");

        IStockHolder sell1=new SellHolder("s1");
        IStockHolder sell2=new SellHolder("s2");
        IStockHolder sell3=new SellHolder("s3");

        buy1.AddHolder(futures1);buy1.AddHolder(futures3);buy1.AddHolder(common1);
        buy2.AddHolder(futures3);buy2.AddHolder(futures2);buy2.AddHolder(common2);
        buy3.AddHolder(futures2);buy3.AddHolder(futures1);buy3.AddHolder(common3);

        sell1.AddHolder(futures1);sell1.AddHolder(futures2);sell1.AddHolder(common3);
        sell2.AddHolder(futures1);sell2.AddHolder(futures3);sell2.AddHolder(common1);
        sell3.AddHolder(futures2);sell3.AddHolder(futures3);sell3.AddHolder(common2);

        for (int i=0;i>-5;i--){
            futures1.setPrice(i+1);
            futures2.setPrice(i+1);
            futures3.setPrice(i+1);

            common1.setPrice(1+i);
            common2.setPrice(1+i);
            common3.setPrice(1+i);
        }
    }
}
