package holding11;

/**
 * Created by 1 on 18.12.2016.
 */
import java.util.*;
public class PetMap {
    public static void main(String[] args) {
        Map<String,Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My cat", new Cat("Molly"));
        petMap.put("My dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog = petMap.get("My dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("My dog"));
        System.out.println(petMap.containsValue(dog));
    }
}
