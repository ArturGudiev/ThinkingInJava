package generics14;

/**
 * Created by 1 on 22.01.2017.
 */
import java.util.*;

public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples){
        apples.add(new Apple());
        apples.add(new Jonathan());
    }
}
