package Strategy;

public class Chef {
    private ICutFruit cutMethod;
    public void SetCutMethod(ICutFruit cutMethod){
        this.cutMethod=cutMethod;
    }
    public void CutFruit(String fruitName){
        cutMethod.CutStrategy(fruitName);
    }

}
