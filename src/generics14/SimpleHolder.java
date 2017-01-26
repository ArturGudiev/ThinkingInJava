package generics14;

/**
 * Created by 1 on 20.01.2017.
 */
public class SimpleHolder {
    private Object obj;
    public void set(Object obj){this.obj = obj;}
    public Object get() {return obj;}

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.set("Item");
        String s = (String)holder.get();
    }
}
