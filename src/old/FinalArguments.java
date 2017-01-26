package old;

/**
 * Created by 1 on 05.10.2016.
 */
class Gizmo{
    public void spin(){}
}
public class FinalArguments {
    void with(final Gizmo g){
        //g = new old.Gizmo();
    }

    void without(Gizmo g){
        g = new Gizmo();
        g.spin();
    }

    //void f(final int i){i++;}
    int g(final int i){return i+1;}

    public static void main(String[] args) {
        FinalArguments fa = new FinalArguments();
        fa.with(null);
        fa.without(null);
    }
}
