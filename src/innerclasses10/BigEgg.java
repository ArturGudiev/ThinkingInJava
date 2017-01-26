package innerclasses10;

/**
 * Created by 1 on 11.12.2016.
 */

class Egg{
    private Yolk y;
    protected class Yolk{
        public Yolk(){ System.out.println("Egg.Yolk()"); }
    }
    public Egg(){
        System.out.println("New Egg()");
        y = new Yolk();
    }
}

public class BigEgg extends Egg{
    public class Yolk{
        public Yolk(){ System.out.println("BigEgg Yolk()"); }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
