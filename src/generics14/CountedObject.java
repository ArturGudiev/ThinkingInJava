package generics14;

/**
 * Created by 1 on 08.01.2017.
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id(){return id;}
    public String toString(){return "CountedObject "  + id;}
}
