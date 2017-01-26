package exceptions12;

/**
 * Created by 1 on 22.12.2016.
 */

class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

public class Human {
    public static void main(String[] args) {
        try{
            throw new Sneeze();
        }catch (Sneeze s){
            System.out.println("Sneeze is catched");
        }catch (Annoyance a){
            System.out.println("Annoyance is catched");
        }
        try{
            throw new Sneeze();
        }catch (Annoyance a){
            System.out.println("Annoyance is catched");
        }
    }
}
