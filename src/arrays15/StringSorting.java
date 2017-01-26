package arrays15;

/**
 * Created by 1 on 26.01.2017.
 */
import java.util.*;

public class StringSorting {
    public static void main(String[] args) {
        String[] sa = Generated.array(new String[20], new RandomGenerator.String(5));
        System.out.println("Before sorting: " + Arrays.toString(sa));
        Arrays.sort(sa);
        System.out.println("After sorting: " + Arrays.toString(sa));
        Arrays.sort(sa, Collections.reverseOrder());
        System.out.println("Reverse sort: " + Arrays.toString(sa));
        Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Case-insensitive sorting: " + Arrays.toString(sa));
    }
}
