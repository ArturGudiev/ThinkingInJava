package arrays15;

/**
 * Created by 1 on 25.01.2017.
 */
import generics14.Generator;

import java.util.*;

public class CompType implements Comparable<CompType>{
    int i;
    int j;
    private static int count = 1;
    public CompType(int n1, int n2){
        i = n1;
        j = n2;
    }
    public String toString(){
        String result = "[i = " + i + ", j = " + j + "]";
        result = String.format("[i = %d, j = %d]",i,j);
        if(count++ % 3 == 0){
            result += "\n";
        }
        return result;
    }
    @Override
    public int compareTo(CompType rv){
        return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
    }
    private static Random rand = new Random(47);
    public static Generator<CompType> generator(){
        return new Generator<CompType>(){

            @Override
            public CompType next() {
                return new CompType(rand.nextInt(100), rand.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], generator());
        System.out.println("перед сортировкой");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("после сортировки");
        System.out.println(Arrays.toString(a));

    }
}
