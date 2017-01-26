package old; /**
 * Created by 1 on 14.09.2016.
 */
import java.util.*;
public class ForEachString {

    public static void main(String[] args) {

        Random rand = new Random(47);
        for(char c: "An Affrican swallow".toCharArray()){
            System.out.print(c + " ");
        }
    }
}
