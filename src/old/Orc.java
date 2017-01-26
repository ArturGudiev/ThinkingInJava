package old;

/**
 * Created by 1 on 05.10.2016.
 */
class Villain{
    private String name;

    Villain(String name){ this.name = name; }
    protected void set(String name){ this.name = name; }

    public String toString(){
        return "I am old.Villain and my name is " + name;
    }
}

public class Orc extends Villain{
    private int orcNumber;

    public Orc(String name, int number){
        super(name);
        orcNumber = number;
    }

    public void change(String name, int number){
        set(name);
        orcNumber = number;
    }

    public String toString(){
        return "old.Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Лимбургер", 12);
        System.out.println(orc);
        orc.change("Боб", 19);
        System.out.println(orc);
    }
}
