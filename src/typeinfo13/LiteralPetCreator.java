package typeinfo13;

/**
 * Created by 1 on 25.12.2016.
 */
import java.util.*;
import typeinfo13.pets.*;

public class LiteralPetCreator extends PetCreator {
    @SuppressWarnings("unchecked")
    public static final List<Class <? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class, Mutt.class,
                    Pug.class, EgyptianMau.class, Manx.class, Cymric.class, Rat.class,
                    Mouse.class, Hamster.class
            ));
    public static final List<Class <? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
    public List<Class <? extends Pet>> types(){
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
}
