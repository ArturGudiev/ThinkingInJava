package old;

/**
 * Created by 1 on 04.10.2016.
 */

class Cleanser{
    private String s = "old.Cleanser";
    public void append(String a){ s += a;}
    public void dilute(){ append(" dilute()");}
    public void apply(){ append(" apply()");}
    public void scrub(){ append(" scrub()"); }

    public String toString(){return s;}

    public static void main(String[] args) {
        Cleanser c = new Cleanser();
        c.dilute(); c.apply(); c.scrub();
        System.out.println(c);
    }
}

public class Detergent extends Cleanser{
    public void scrub(){
        append(" old.Detergent.scrub()");
        super.scrub();
    }
    public void foam(){
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute(); x.apply(); x.scrub(); x.foam();
        System.out.println(x);
        System.out.println("Checking base class");
        Cleanser.main(args);
    }
}
