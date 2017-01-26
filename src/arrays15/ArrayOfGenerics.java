package arrays15;

/**
 * Created by 1 on 24.01.2017.
 */
import java.util.*;
public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String> ls;
        List[] la = new List[10];
//        ls = (List<String>[])la;
        //ошибка!!!
//        ls[0] = new ArrayList<String>();
    }
}
