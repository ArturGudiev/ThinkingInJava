package generics14;

import java.util.*;

/**
 * Created by 1 on 20.01.2017.
 */
public class FilledListMaker<T> {
    List<T> create (T t, int n){
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < n; i++) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledListMaker<String> stringMaker =
                new FilledListMaker<String>();
        List<String> list = stringMaker.create("Hello", 4);
        System.out.println(list);
    }
}
