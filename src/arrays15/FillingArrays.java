package arrays15;

/**
 * Created by 1 on 24.01.2017.
 */
import java.util.*;

public class FillingArrays {
    public static <T>  void f(T[] array, T val, String name){
        Arrays.fill(array, val);
        System.out.println(name + " = " + Arrays.toString(array));
    }
    public static void main(String[] args) {
        int size = 6;
        Boolean[] a1 = new Boolean[size];
        Byte[] a2 = new Byte[size];
        Character[] a3 = new Character[size];
        Short[] a4 = new Short[size];
        Integer[] a5 = new Integer[size];
        Long[] a6 = new Long[size];
        Float[] a7 = new Float[size];
        Double[] a8 = new Double[size];
        String[] a9 = new String[size];
        f(a1, true, "a1");
        f(a2, new Byte((byte)11), "a2");
        f(a3, new Character('x'), "a3");
        f(a4, new Short((short)17), "a4");
        f(a5, new Integer(19), "a5");
        f(a6, new Long(23), "a6");
        f(a7, new Float(29), "a7");
        f(a8, new Double(47), "a8");
        f(a9, "Hello", "a9");
        Arrays.fill(a9, 3, 5, "World");
        System.out.println("a9 = " + Arrays.toString(a9));
    }
}
