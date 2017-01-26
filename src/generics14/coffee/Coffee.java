package generics14.coffee;

/**
 * Created by 1 on 07.01.2017.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString(){return getClass().getSimpleName() + " " + id;}
}
