package typeinfo13;

/**
 * Created by 1 on 25.12.2016.
 */

class Building {}
class House extends Building {}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new Building();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House) b;
    }
}
