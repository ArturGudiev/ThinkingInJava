package exceptions12;

/**
 * Created by 1 on 22.12.2016.
 */

class FourException extends Exception {}

public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Входим в первый блок try");
        System.out.println("Going to first try");
        try{
            System.out.println("Going to second try");
            try{
                throw new FourException();
            }finally {
                System.out.println("In second finally");
            }
        }catch(FourException e){
            System.out.println("A FourExcaption has been catched");
        }finally {
            System.out.println("In first finally");
        }
    }
}
