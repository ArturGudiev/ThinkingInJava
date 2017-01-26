package typeinfo13.pets;

/**
 * Created by 1 on 25.12.2016.
 */
public class Individual {
    static int count = 0;
    String name=null;
    int id;

    public Individual(){ id = count++;}
    public Individual(String name){this.name = name; id = count++;}
    public int id(){return id;}
    public String toString(){
        if(name == null){
            return this.getClass().getSimpleName();
        }
        return name;
    }
}
