package old;

/**
 * Created by 1 on 06.10.2016.
 */

class Insect{
    private int i = 9;
    protected int j ;
    Insect(){
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("Поле static old.Insect x1 инициализировано ");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect{
    private int k = printInit("Поле old.Beetle k проинициализировано");
    public Beetle(){
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("Поле static old.Beetle x2 проинициализировано");

    public static void main(String[] args) {
        System.out.println("Конструктор old.Beetle");
        Beetle b = new Beetle();
    }
}
