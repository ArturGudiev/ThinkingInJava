package innerclasses10;

/**
 * Created by 1 on 09.12.2016.
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{
        public void howdy(){
            System.out.println("Hello!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
