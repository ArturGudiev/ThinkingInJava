package innerclasses10;

/**
 * Created by 1 on 11.12.2016.
 */

class WithInner{
    class Inner{}
}

public class InheritInner extends WithInner.Inner{
    InheritInner(WithInner wi){
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
