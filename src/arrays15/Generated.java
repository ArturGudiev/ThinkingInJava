package arrays15;

import generics14.Generator;

import java.util.*;

/**
 * Created by 1 on 25.01.2017.
 */
public class Generated {
    public static <T> T[] array(T[] a, Generator<T> gen){
        return new CollectionData<T>(gen, a.length).toArray(a);
    }
    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> type, Generator<T> gen, int size){
        T[] a = (T[])java.lang.reflect.Array.newInstance(type, size);
        return new CollectionData<T>(gen, size).toArray(a);
    }
}
