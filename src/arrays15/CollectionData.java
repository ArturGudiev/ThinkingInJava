package arrays15;

import generics14.Generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by 1 on 25.01.2017.
 */
public class CollectionData<T> {
    Collection collect;
    CollectionData(Generator<T> gen, int length){
        collect = new ArrayList<T>();
        for (int i = 0; i < length; i++) {
            collect.add(gen.next());
        }
    }

    public T[] toArray(T[] a){
        collect.toArray(a);
        return a;
    }

    public static void main(String[] args) {
        CollectionData<Integer> col = new CollectionData<Integer>(new CountingGenerator.Integer(), 5);
        System.out.println(Arrays.toString(col.toArray(new Integer[5])));
    }
}
