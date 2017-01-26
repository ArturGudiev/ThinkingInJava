package typeinfo13;

/**
 * Created by 1 on 24.12.2016.
 */
import java.util.*;

class Initable{
    static Random rand = new Random(47);
    static final int staticFinal = 47;
    static final int staticFinal2 =  rand.nextInt(1000);

    static{
        System.out.println("Инициализация Initable");
    }
}

class Initable2{
    static int staticNonFinal = 147;
    static{
        System.out.println("Инициализация Initable2");
    }
}
class Initable3{
    static int staticNonFinal = 74;
    static{
        System.out.println("Инициализация Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception{
        Class initable = Initable.class;
        System.out.println("After Initable");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("typeinfo13.Initable3");
        System.out.println("After initable3");
        System.out.println(Initable3.staticNonFinal);

    }
}
