package exceptions12;

/**
 * Created by 1 on 21.12.2016.
 */

class OneException extends Exception{
    public OneException(String s){super(s);}
}
class TwoException extends Exception{
    public TwoException(String s){super(s);}
}

public class RethrowNew {
    public static void f() throws OneException{
        System.out.println("Creating exception in f()");
        throw new OneException("From f()");
    }

    public static void main(String[] args) {
        try{
            try{
                f();
            }catch (OneException e){
                System.out.println("Во внутреннем блоке try e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("Из внутреннего try");
            }
        }catch (TwoException e){
            System.out.println("Во внешнем блоке try, e.printStackTrace()");
            e.printStackTrace();
        }
    }
}
