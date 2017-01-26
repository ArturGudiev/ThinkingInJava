package typeinfo13;

/**
 * Created by 1 on 05.01.2017.
 */
import typeinfo13.interfacea.*;

class B implements A{
    public void f(){}
    public void g(){}
}

public class interfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        //a.g();
        System.out.println(a.getClass().getName());
        if( a instanceof B){
            B b = (B) a;
            b.g();
        }
    }
}
