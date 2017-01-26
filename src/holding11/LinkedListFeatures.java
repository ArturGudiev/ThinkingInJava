package holding11;

/**
 * Created by 1 on 18.12.2016.
 */

import java.util.*;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<Pet>(Pet.arrayList(5));
        ArrayList<Pet> petsAL = new ArrayList<Pet>(Pet.arrayList(5));
        System.out.println(pets);
        System.out.println("pets.getFirst()" + pets.getFirst());
        System.out.println("pets.element()" + pets.element());
        System.out.println("pets.peek() " + pets.peek());
        System.out.println("pets.remove() " + pets.remove());
        System.out.println("pets.removeFirst() " + pets.removeFirst());
        System.out.println("pets.poll() " + pets.poll());
        System.out.println(pets);
        pets.addFirst(new Rat());
        System.out.println("after addFirst()" + pets);
        pets.offer(Pet.RandomPet());
        System.out.println("After offer() " + pets);
        pets.add(Pet.RandomPet());
        System.out.println("After add() " + pets);
        pets.addLast(new Hamster());
        System.out.println("After addLast()" + pets);
        System.out.println("pets.removeLast() " + pets.removeLast());

    }
}
