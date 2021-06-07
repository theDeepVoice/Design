package Adapter;



public class Adapter extends OldJuicer implements NewJuicer{

    OldJuicer oldJuicer =new OldJuicer();

    @Override
    public String newPort(MyFruit fruit1,MyFruit fruit2) {
        String str ="mixed:"+onePort(fruit1);
        str+=onePort(fruit2);
        return str;
    }

}

//public class Adapter extends  implements NewJuicer{
//
//      OldJuicer oldJuicer =new OldJuicer();
//
//    @Override
//    public String newPort(MyFruit fruit1,MyFruit fruit2) {
//        String str ="mixed:"+oldJuicer.onePort(fruit1);
//        str+=oldJuicer.onePort(fruit2);
//        return str;
//    }
//
//}