package old.finalize;

/**
 * Created by 1 on 17.09.2016.
 */
public class Book {
    boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }
    void checkIn(){
        checkedOut = false;
    }
    public void finalize(){
        if(checkedOut){
            System.out.println("Error");
        }
    }
}
