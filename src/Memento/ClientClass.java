package Memento;

public class ClientClass {
    public static void main(String[] args) {
        OriginatorChess chess=new OriginatorChess(new MementoChess("黑",2,2));
        play(chess);
        chess.setX(3);
        play(chess);
        chess.setY(6);
        play(chess);
        undo(chess,index);
        undo(chess,index);
        redo(chess,index);
        redo(chess,index);
    }
    private static int index = 0;
    private static CareTakerChess careTakerChess=new CareTakerChess();

   static void play(OriginatorChess chess){
       ClientClass.index++;
       careTakerChess.AddMem(chess.SaveToMemento());

       chess.Show();
   }

   static void undo(OriginatorChess chess,int index){
       System.out.println("悔棋");
       ClientClass.index--;
       chess.Restore(careTakerChess.getMem(index-1));
       chess.Show();
   }
   static void redo(OriginatorChess chess,int index){
       System.out.println("撤销悔棋");
       chess.Restore(careTakerChess.getMem(index));
       ClientClass.index++;
       chess.Show();
   }

}
