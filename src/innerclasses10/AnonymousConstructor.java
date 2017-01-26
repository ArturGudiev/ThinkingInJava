package innerclasses10;

/**
 * Created by 1 on 08.12.2016.
 */

abstract class Base{
    public Base(int i) {
        System.out.println("Base's constructor, i = " + i);
    }
        public abstract void f();
}

public class AnonymousConstructor{
    public static Base getBase(int i){
        return new Base(i){
            {System.out.println("Initialization "); }
            public void f(){
                System.out.println("Anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();

    }
}

