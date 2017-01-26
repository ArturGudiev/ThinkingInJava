package typeinfo13.packageaccess;

/**
 * Created by 1 on 06.01.2017.
 */
import typeinfo13.interfacea.*;

class C implements A{
    @Override
    public void f() { System.out.println("public C.f()"); }
    public void g() { System.out.println("public C.g()"); }
    void u() { System.out.println("package C.u()"); }
    protected void v() { System.out.println("protected C.v()"); }
    protected void w() { System.out.println("protected C.w()"); }
}


public class HiddenC {
    public static A makeA(){return new C();}
}
