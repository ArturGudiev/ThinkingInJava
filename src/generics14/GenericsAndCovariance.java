package generics14;

/**
 * Created by 1 on 22.01.2017.
 */
import java.util.*;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<Apple>();
//        flist.add(new Apple());
//        flist.add(new Orange());
        flist.add(null);
        Fruit f = flist.get(0);
    }
}
