package old;

import java.util.Objects;

/**
 * Created by 1 on 27.09.2016.
 */
public class VarArgs {
    static void printArray(Object[] obj){
        for(Object o : obj){
            System.out.print(o);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{new Integer(1), new Integer(2)});
        printArray(new Object[]{new Float(1.2), new Float(2.3)});
        printArray(new Object[]{"S", "Y"});

    }
}
