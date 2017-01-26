package typeinfo13.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 25.12.2016.
 */
public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "typeinfo13.pets.Mutt",
            "typeinfo13.pets.Pug",
            "typeinfo13.pets.EgyptianMau",
            "typeinfo13.pets.Manx",
            "typeinfo13.pets.Cymric",
            "typeinfo13.pets.Rat",
            "typeinfo13.pets.Mouse",
            "typeinfo13.pets.Hamster",
    };

    @SuppressWarnings("unchecked")
    private static void loader(){
        try{
            for(String name : typeNames){
                types.add((Class<? extends Pet>)Class.forName(name) );
            }
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    static{ loader(); }
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
