package generics14;

/**
 * Created by 1 on 06.01.2017.
 */
public class TwoTuple<A,B> {
    public final A first;
    public final B second;
    public TwoTuple(A a, B b){this.first = a; this.second = b;}
    public String toString(){return "( " + first + ", " + second + ")";}
}
