package exceptions12;

/**
 * Created by 1 on 21.12.2016.
 */

public class Rethrowing {
    public static void f() throws Exception{
        System.out.println("Создание исключения в f()");
        throw new Exception("Возбуждено в f()");
    }
    public static void g() throws Exception{
        try{
            f();
        }catch (Exception e){
            System.out.println("In g() printStackTrace()");
            e.printStackTrace();
            throw e;
        }
    }
    public static void h() throws Exception{
        try{
            f();
        }catch(Exception e){
            System.out.println("In h() printStackTrace()");
            e.printStackTrace();
            throw (Exception)e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            g();
        }catch (Exception e){
            System.out.println("main printStackTrace");
            e.printStackTrace(System.out);
        }
        try{
            h();
        }catch (Exception e){
            System.out.println("main printStackTrace");
            e.printStackTrace(System.out);
        }
    }
}
