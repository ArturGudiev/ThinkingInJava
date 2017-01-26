package holding11;

import java.util.ArrayList;

/**
 * Created by 1 on 12.12.2016.
 */

public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
//        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }
        for ( Apple c: apples ) {
            System.out.println(c.id());
        }
    }
}
