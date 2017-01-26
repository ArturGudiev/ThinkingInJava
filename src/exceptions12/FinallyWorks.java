package exceptions12;

/**
 * Created by 1 on 21.12.2016.
 */

class ThreeException extends Exception{}

public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while(true){
            try{
                if(count++ == 0){
                   throw new ThreeException();
                }
                System.out.println("No exception");
            }catch(ThreeException e){
                System.out.println("ThreeException");
            }
            finally {
                System.out.println("In finally");
                if(count == 2){break;}
            }
        }
    }
}
