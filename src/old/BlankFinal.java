package old;

/**
 * Created by 1 on 05.10.2016.
 */
class Poppet{
    private int i;
    Poppet(int ii){i = ii;}
}

public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;

    BlankFinal(){
        j = 0 ;
        p = new Poppet(0);
    }

    BlankFinal(int k){
        j = k;
        p = new Poppet(0);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}

