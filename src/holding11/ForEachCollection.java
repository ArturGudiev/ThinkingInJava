package holding11;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by 1 on 19.12.2016.
 */
public class ForEachCollection {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs, "Take the long way home".split(" "));
        for(String s : cs ){
            System.out.println(" " + s + " ");
        }
    }
}
