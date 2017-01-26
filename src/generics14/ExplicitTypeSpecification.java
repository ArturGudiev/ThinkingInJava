package generics14;

/**
 * Created by 1 on 07.01.2017.
 */
import typeinfo13.pets.*;
import java.util.*;

public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople){}

    public static void main(String[] args) {
        f(New.<Person, List<Pet>>map());
    }
}
