package generics14;

/**
 * Created by 1 on 20.01.2017.
 */
public class GenericHolder<T> {
    private T obj;
    public void set(T obj) {this.obj = obj;}
    public T get(){return obj;}

    public static void main(String[] args) {
        GenericHolder<String> holder =
                new GenericHolder<String>();
        holder.set("Item");
        String s = holder.get();
    }
}
