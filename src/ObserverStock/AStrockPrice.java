package ObserverStock;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AStrockPrice {
    protected float price,price2;
    protected String code;
    protected List<IStockHolder> stockHoldersList;
    public void Add(IStockHolder ish){
        stockHoldersList.add(ish);
    }
    public void Remove(IStockHolder ish){
        stockHoldersList.remove(ish);
    }
    public AStrockPrice(String code){
        this.code=code;
        price =price2=0;
        stockHoldersList=new ArrayList<IStockHolder>();
    }

    public float getPrice() {
        return price;
    }
    public float getPrice2() {
        return price2;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyHolder();
    }

    protected abstract void notifyHolder();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AStrockPrice)) return false;

        AStrockPrice that = (AStrockPrice) o;

        if (Float.compare(that.price2, price2) != 0) return false;
        if (!Objects.equals(code, that.code)) return false;
        return Objects.equals(stockHoldersList, that.stockHoldersList);
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (stockHoldersList != null ? stockHoldersList.hashCode() : 0);
        return result;
    }
}
