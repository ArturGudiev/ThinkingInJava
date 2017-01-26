package typeinfo13;
//приватные внутренние классы не скрываются от рефлексии
/**
 * Created by 1 on 06.01.2017.
 */
import typeinfo13.interfacea.*;

class InnerA{
    private static class C implements A{

        public void f() { System.out.println("public C.f()"); }
        public void g() { System.out.println("public C.g()"); }
        void u() { System.out.println("package C.u()"); }
        protected void v() { System.out.println("protected C.v()"); }
        protected void w() { System.out.println("protected C.w()"); }
    }
    public static A makeA(){return new C();}
}
public class InnerImplementation {
    public static void main(String[] args) {
        A a = InnerA.makeA();
        a.f();
        try {
            System.out.println(a.getClass().getName());
            HiddenImplementation.callHiddenMethod(a, "g");
            HiddenImplementation.callHiddenMethod(a, "u");
            HiddenImplementation.callHiddenMethod(a, "v");
            HiddenImplementation.callHiddenMethod(a, "w");
        }catch (Exception e){}
        }
}
