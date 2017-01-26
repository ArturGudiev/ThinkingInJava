package old;

/**
 * Created by 1 on 04.10.2016.
 */

class Game{
    Game(int i){
        System.out.println("old.Game's constructor");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("old.BoardGame's constructor");
    }
}

class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("old.Chess's constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
public class ChessGame {
}
