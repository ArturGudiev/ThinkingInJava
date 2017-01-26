package typeinfo13.pets;

/**
 * Created by 1 on 25.12.2016.
 */
import typeinfo13.LiteralPetCreator;

import java.util.*;

public class Pets {
    public static final PetCreator creator = new LiteralPetCreator();
    public static Pet randomPet(){
        return creator.randomPet();
    }
    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size){
        return creator.arrayList(size);
    }
}
