package interfaces9.interfaceprocessor;

/**
 * Created by 1 on 12.10.2016.
 */
public class Apply {
    public static void process(Processor p, Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
