package holding11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

/**
 * Created by 1 on 14.12.2016.
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> it){
        while(it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id() + " " + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = Pet.arrayList(8);
        LinkedList<Pet> petsLL = new LinkedList<Pet>(pets) ;
        HashSet<Pet> petsHS = new HashSet<Pet>(pets);
        TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
