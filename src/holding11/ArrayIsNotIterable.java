package holding11;

import java.util.Arrays;

/**
 * Created by 1 on 19.12.2016.
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib){
        for(T t : ib){
            System.out.println(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1,2,3));
        String[] strings = {"A", "B", "C"};
        test(Arrays.asList(strings));
    }
}
