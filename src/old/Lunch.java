package old;

/**
 * Created by 1 on 03.10.2016.
 */

class Soup1{
    private Soup1(){}
    public static Soup1 makeSoup(){
        return new Soup1();
    }
}
class Soup2{
    private Soup2(){}
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access(){
        return ps1;
    }
    public void f(){
        System.out.println("f");
    }
}

public class Lunch {
    void testPrivate(){

    }
    void testStatic(){
        Soup1 soup = Soup1.makeSoup();
    }
    void testSingleton(){
        Soup2.access().f();
    }

    public static void main(String[] args) {
        System.out.println();
        Lunch l = new Lunch();
        l.testSingleton();
    }
}
