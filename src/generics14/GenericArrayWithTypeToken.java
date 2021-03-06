package generics14;

import java.lang.reflect.*;

/**
 * Created by 1 on 21.01.2017.
 */
public class GenericArrayWithTypeToken<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArrayWithTypeToken(Class<T> type, int sz){
        array = (T[]) Array.newInstance(type, sz);
    }
    public void put(int index, T item){
        array[index] = item;
    }
    public T get(int index){
        return array[index];
    }
    public T[] rep(){return array;}

    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> gai =
                new GenericArrayWithTypeToken<Integer>(Integer.class, 10);
        Integer[] ia = gai.rep();
    }
}
