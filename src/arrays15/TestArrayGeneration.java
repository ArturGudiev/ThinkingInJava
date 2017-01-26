package arrays15;

import java.util.Arrays;

/**
 * Created by 1 on 25.01.2017.
 */
public class TestArrayGeneration {
    public static void main(String[] args) {
        int size = 6;
        boolean[] a1 = ConvertTo.primitive(Generated.array(Boolean.class, new RandomGenerator.Boolean(),size));
        System.out.printf("a1 = %s\n", Arrays.toString(a1));
        byte[] a2 = ConvertTo.primitive(Generated.array(Byte.class, new RandomGenerator.Byte(), size));
        System.out.printf("a2 = %s\n", Arrays.toString(a2));
        char[] a3 = ConvertTo.primitive(Generated.array(Character.class, new RandomGenerator.Character(), size ));
        System.out.printf("a3 = %s\n", Arrays.toString(a3));
        short[] a4 = ConvertTo.primitive(Generated.array(Short.class, new RandomGenerator.Short(), size ));
        System.out.printf("a4 = %s\n", Arrays.toString(a4));
        int[] a5 = ConvertTo.primitive(Generated.array(Integer.class, new RandomGenerator.Integer(), size ));
        System.out.printf("a5 = %s\n", Arrays.toString(a5));
        long[] a6 = ConvertTo.primitive(Generated.array(Long.class, new RandomGenerator.Long(), size ));
        System.out.printf("a6 = %s\n", Arrays.toString(a6));
        float[] a7 = ConvertTo.primitive(Generated.array(Float.class, new RandomGenerator.Float(), size ));
        System.out.printf("a7 = %s\n", Arrays.toString(a7));
        double[] a8 = ConvertTo.primitive(Generated.array(Double.class, new RandomGenerator.Double(), size ));
        System.out.printf("a8 = %s\n", Arrays.toString(a8));





    }
}
