package exceptions12;

/**
 * Created by 1 on 20.12.2016.
 */

class SimpleException extends Exception{}


public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("Возбуждаем SimpleException в f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions ned = new InheritingExceptions();
        try{
            ned.f();
        }
        catch(SimpleException e){
            System.out.println("Перехвачено!");
        }

    }
}
