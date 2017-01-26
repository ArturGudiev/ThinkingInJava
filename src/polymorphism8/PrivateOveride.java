package polymorphism8;

/**
 * Created by 1 on 07.10.2016.
 */
public class PrivateOveride {
    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOveride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOveride{
    public void f(){
        System.out.println("public f()");
    }
}
