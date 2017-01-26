package old;

/**
 * Created by 1 on 04.10.2016.
 */

class Art {
    Art(){
        System.out.println("old.Art's constructor");
    }
}

class Drawing extends Art{
    Drawing(){
        System.out.println("old.Drawing's constructor");
    }
}

public class Cartoon extends Drawing{
    Cartoon(){
        System.out.println("old.Cartoon's constructor");
    }

    public static void main(String[] args) {
        Cartoon c = new Cartoon();
    }
}
