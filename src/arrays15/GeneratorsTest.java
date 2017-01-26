package arrays15;

import generics14.Generator;

/**
 * Created by 1 on 25.01.2017.
 */
public class GeneratorsTest {
    public static int size = 10;
    public static void test(Class<?> surroundingClass){
        for(Class<?> type : surroundingClass.getClasses()){
            System.out.print(type.getSimpleName() + ": ");
            try{
                Generator<?> g = (Generator<?>)type.newInstance();
                for (int i = 0; i < size; i++) {
                    System.out.print(g.next() + " ");
                }
                System.out.println();
            }catch (Exception e){throw new RuntimeException(e);}
        }
    }

    public static void main(String[] args) {
        test(CountingGenerator.class);
    }
}
