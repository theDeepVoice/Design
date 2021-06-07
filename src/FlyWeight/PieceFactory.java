package FlyWeight;

import java.util.HashMap;

public class PieceFactory {
    private HashMap<String, APiece> PiecePool =new HashMap<>();
    public APiece GetPiece(String key){
        if (!PiecePool.containsKey(key)){
            APiece p=new OnePiece(key);
            PiecePool.put(key,p);
            return p;
        }
        return PiecePool.get(key);
    }
    public int GetPieceCount(){
        return PiecePool.size();
    }
}
