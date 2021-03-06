package holding11;

import java.util.Iterator;
import java.util.List;

/**
 * Created by 1 on 14.12.2016.
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pet.arrayList(12);
        Iterator<Pet> it = pets.iterator();
        while(it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id() + " " + p + " ");
        }
        System.out.println();
        for(Pet p : pets){
            System.out.print(p.id() + " " + p + " ");
        }
        System.out.println();
        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
