package old;

/**
 * Created by 1 on 04.10.2016.
 */
class Soap {
    private String s;
    public Soap(){
        System.out.println("old.Soap()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}


public class Bath {
    private String s1 = "Happy",
                    s2 = "Happy",
                    s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath(){
        System.out.println("В конструкторе old.Bath()");
        s3 = "Радостный";
        toy = 3.14f;
        castille = new Soap();
    }
    {i = 47; }

    public String toString(){
        if(s4 == null){
            s4 = "Радостный";
        }
        return "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castille = " + castille + "\n";
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}
