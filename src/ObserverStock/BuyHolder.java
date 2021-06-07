package ObserverStock;

import java.util.ArrayList;
import java.util.List;

public class BuyHolder implements IStockHolder{
    private List<AStrockPrice>attentionList;
    private String name;
    public BuyHolder (String name){
        attentionList =new ArrayList<AStrockPrice>();
        this.name=name;
    }

    @Override
    public void AddHolder(AStrockPrice asp) {
    attentionList.add(asp);
    asp.Add(this);
    }
    @Override
    public void update(AStrockPrice asp) {
        if (attentionList.contains(asp)){
            System.out.println(name);
            if (asp.getPrice()-asp.getPrice2()>0){
                System.out.println(asp.code+":");
                System.out.println("原价"+asp.price2+" 现价："+asp.price);
                System.out.println("涨价了");
            }
            else {
                System.out.println(asp.code+":");
                System.out.println("原价"+asp.price2+" 现价："+asp.price);
                System.out.println("贬值了");
            }

        }


    }

}
