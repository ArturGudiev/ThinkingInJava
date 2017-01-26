package holding11;

/**
 * Created by 1 on 20.12.2016.
 */
import java.util.*;
public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));
        System.out.println("До перестановки " + list1);
        Collections.shuffle(list1, rand);
        System.out.println("После перестановки " + list1);
        System.out.println("Массив: " + Arrays.toString(ia));

        List<Integer> list2 = Arrays.asList(ia);
        System.out.println("До перестановки " + list2);
        Collections.shuffle(list2, rand);
        System.out.println("После перестановки " + list2);
        System.out.println("Массив: " + Arrays.toString(ia));

    }
}
