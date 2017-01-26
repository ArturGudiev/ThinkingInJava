package exceptions12;

/**
 * Created by 1 on 20.12.2016.
 */

class MyException extends Exception{
    public MyException(){}
    public MyException(String msg){super(msg);}
}

public class FullConstructors {
    public static void f() throws MyException{
        System.out.println("Возбуждаем MyException() в f()");
        throw new MyException();
    }
    public static void g() throws MyException{
        System.out.println("Возбуждаем MyException() в g()");
        throw new MyException("Создано в g()");
    }

    public static void main(String[] args) {
        try{
            f();
        }catch(MyException e){
            e.printStackTrace(System.err);
        }
        try{
            g();
        }catch(MyException e){
            e.printStackTrace(System.err);
        }
    }

}

