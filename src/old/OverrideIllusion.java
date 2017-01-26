package old;

/**
 * Created by 1 on 05.10.2016.
 */
class A{
    private final void f(){
        System.out.println("old.A.f()");
    }
    private void g(){
        System.out.println("old.A.g()");
    }
}

class B extends A{
    private final void f(){
        System.out.println("old.B.f()");
    }
    private void g(){
        System.out.println("old.B.g()");
    }
}

public class OverrideIllusion extends B{
    public final void f(){
        System.out.println("OI.f()");
    }
    public void g(){
        System.out.println("OI.g()");
    }

    public static void main(String[] args) {
        OverrideIllusion oi = new OverrideIllusion();
        oi.f();
        oi.g();
        B b = new B();
    }
}
