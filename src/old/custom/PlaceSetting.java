package old.custom;

/**
 * Created by 1 on 04.10.2016.
 */
class Plate{
    Plate(int i){
        System.out.println("Plate's constructor");
    }
}

class DinnerPlate extends Plate{
    DinnerPlate(int i){
        super(i);
        System.out.println("DinnerPlate");
    }
}

class Utensil{
    Utensil(int i){
        System.out.println("Utensil's constructor");
    }
}

class Spoon extends Utensil{
    Spoon(int i){
        super(i);
        System.out.println("Spoon's constructor");
    }
}

class Fork extends Utensil{
    Fork(int i){
        super(i);
        System.out.println("Fork's constructor");
    }
}

class Knife extends Utensil{
    Knife(int i){
        super(i);
        System.out.println("Knife's constructor");
    }
}

class Custom{
    Custom(int i){
        System.out.println("Custom's constructor");
    }
}

public class PlaceSetting extends Custom{
    private Spoon sp;
    private Fork fk;
    private Knife knf;
    private DinnerPlate dpl;
    public PlaceSetting(int i){
        super(i+1);
        sp = new Spoon(i+2);
        fk = new Fork(i+3);
        knf = new Knife(i+4);
        dpl = new DinnerPlate(i+5);
        System.out.println("PlaceSetting's constructor");
    }

    public static void main(String[] args) {
        PlaceSetting ps = new PlaceSetting(9);
    }
}
