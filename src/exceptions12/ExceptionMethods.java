package exceptions12;

/**
 * Created by 1 on 21.12.2016.
 */
public class ExceptionMethods {
    public static void main(String[] args) {
        try{
            throw new Exception("Мое исключение");
        }
        catch(Exception e){
            System.out.println("Перехвачено");
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getLocalisedMessage(): " + e.getLocalizedMessage());
            System.out.println("toString(): " + e.toString());
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}
