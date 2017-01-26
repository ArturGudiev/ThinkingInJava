package arrays15;

/**
 * Created by 1 on 26.01.2017.
 */
import generics14.Generator;

import java.util.*;

public class ArraySearching {
    public static void main(String[] args) {
        Generator<Integer> gen =
                new RandomGenerator.Integer();
        int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
        Arrays.sort(a);
        System.out.println("Отсортированный массив: " + Arrays.toString(a));
        while(true){
            int r = gen.next();
            System.out.println(r);
            int location = Arrays.binarySearch(a, r);
            if(location >= 0){
                System.out.printf("Значение %d находится в позиции %d, a[%d] = %d", r, location, location, r);
                break;
            }
        }
    }
}
