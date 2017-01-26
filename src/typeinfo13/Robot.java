package typeinfo13;

/**
 * Created by 1 on 05.01.2017.
 */
import java.util.*;

public interface Robot {
    String name();
    String model();
    List<Operation> operations();
    class Test{
        public static void test(Robot r){
            if( r instanceof Null){
                System.out.println("[Null Robot]");
            }
            System.out.println("Название " + r.name());
            System.out.println("Модель " + r.model());
            for(Operation operation : r.operations()){
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}
