package innerclasses10;

/**
 * Created by 1 on 07.12.2016.
 */
public class DotThis {
    void f(){System.out.println("DotThis.f()");}

    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }

    public Inner inner(){return new Inner();}

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
