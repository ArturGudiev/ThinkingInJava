package arrays15;

import java.util.Arrays;

import static java.lang.System.*;

/**
 * Created by 1 on 25.01.2017.
 */
public class TestGenerated {
    public static void main(String[] args) {
        Integer[] a = {6,7,8,9};
        out.println(Arrays.toString(a));
        a = Generated.array(a, new CountingGenerator.Integer());
        System.out.println(Arrays.toString(a));
        Integer[] b = Generated.array(Integer.class, new CountingGenerator.Integer(), 15);
        System.out.println(Arrays.toString(b));
//        Integer[] b =
    }
}
