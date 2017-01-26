package old.explicitStatic;

/**
 * Created by 1 on 27.09.2016.
 */
public class Cups {
    static Cup cup1;
    static Cup cup2;
    static{
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }
    public static void main(String[] args) {
        System.out.println("main");
        Cups.cup1.f(99);
    }
}
