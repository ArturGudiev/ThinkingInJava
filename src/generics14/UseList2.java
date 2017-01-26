package generics14;

import java.util.List;

/**
 * Created by 1 on 23.01.2017.
 */
public class UseList2 {
    public class UseList<W,T>{
        void f1(List<T> v){}
        void f2(List<W> v){}
    }
}
