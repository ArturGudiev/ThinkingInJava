package typeinfo13;

/**
 * Created by 1 on 04.01.2017.
 */

class Base {}
class Derived extends Base{}

public class FamilyVsExactType {
    static void test(Object x){
        System.out.println("тестируем x типа " + x.getClass());
        System.out.println("x instanceof base " + (x instanceof Base));
        System.out.println("x instanceof Derived " + (x instanceof Derived));
        System.out.println("Base.isInstance(x) " + Base.class.isInstance(x));
        System.out.println("Derived.isInstance(x) " + Derived.class.isInstance(x));
        System.out.println("x.getClass == Base.getClass " + (x.getClass() == Base.class));
        System.out.println("x.getClass == Derived.getClass " + (x.getClass() == Derived.class));
        System.out.println("x.getClass().equals(Base.class) " + (x.getClass()).equals(Base.class));
        System.out.println("x.getClass().equals(Derived.class) " + (x.getClass()).equals(Derived.class));
    }

    public static void main(String[] args) {
        test(new Base());
        test(new Derived());
    }
}
