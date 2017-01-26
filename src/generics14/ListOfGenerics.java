package generics14;

/**
 * Created by 1 on 21.01.2017.
 */
import java.util.*;

public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<T>();
    public void add(T item){array.add(item);}
    public T get(int index){ return array.get(index);}
}
