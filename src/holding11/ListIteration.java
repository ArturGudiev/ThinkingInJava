package holding11;

/**
 * Created by 1 on 14.12.2016.
 */
import java.util.*;
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pet.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        while(it.hasNext()){
            System.out.println(it.next() + ", " + it.nextIndex() + " " + it.previousIndex() + "; ");
        }
        System.out.println();
        while(it.hasPrevious()){
            System.out.println(it.previous().id() + " ");
        }
        System.out.println();
        System.out.println(pets);
        it = pets.listIterator(3);
        while(it.hasNext()){
            it.next();
            it.set(Pet.RandomPet());
        }
        System.out.println(pets);
    }
}
