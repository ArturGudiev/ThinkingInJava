package old; /**
 * Created by 1 on 27.09.2016.
 */
import java.util.*;
public class ArrayNew {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int[] a = new int[rand.nextInt(20)];
        System.out.println("Длина а = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
