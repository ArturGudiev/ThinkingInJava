package generics14;

import generics14.GenericHolder;

/**
 * Created by 1 on 21.01.2017.
 */
public class ArrayOfGeneric {
    static final int SIZE = 100;
    static GenericHolder<Integer>[] gia;
    @SuppressWarnings("unchecked")

    public static void main(String[] args) {/*
        //gia = (Generic<Integer>[])new Object[SIZE];
        gia = (Generic<Integer>[])new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<Integer>();
        gia[1] = new Object();
        gia[2] = new Generic<Double>();*/
    }
}
