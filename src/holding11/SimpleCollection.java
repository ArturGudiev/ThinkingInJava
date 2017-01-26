package holding11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 1 on 12.12.2016.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for(Integer i : c){
            System.out.print(i + " ");
        }
    }
}
