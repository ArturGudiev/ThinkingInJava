package exceptions12;

/**
 * Created by 1 on 22.12.2016.
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }
        finally{
            return;
        }
    }
}
