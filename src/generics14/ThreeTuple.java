package generics14;

/**
 * Created by 1 on 06.01.2017.
 */
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    public final C third;
    public ThreeTuple(A a, B b, C c){
        super(a,b);
        third = c;
    }
    public String toString(){return "(" + first + ", " + second + ", " + third + ")";}
}
