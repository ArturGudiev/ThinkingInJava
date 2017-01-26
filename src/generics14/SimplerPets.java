package generics14;

/**
 * Created by 1 on 07.01.2017.
 */
import typeinfo13.pets.*;
import java.util.*;

public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
    }
}
