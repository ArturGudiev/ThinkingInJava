package innerclasses10;

/**
 * Created by 1 on 09.12.2016.
 */
public class TestBed {
    public void f(){
        System.out.println("f()");
    }
    public static class Tester{
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }

    public static void main(String[] args) {
        Tester.main(args);
    }
}
