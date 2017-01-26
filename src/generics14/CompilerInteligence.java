package generics14;

/**
 * Created by 1 on 22.01.2017.
 */
import java.util.*;

public class CompilerInteligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist
                = Arrays.asList(new Apple());
        Apple a = (Apple)flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());

    }
}
