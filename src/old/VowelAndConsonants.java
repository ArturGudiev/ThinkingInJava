package old; /**
 * Created by 1 on 15.09.2016.
 */
import java.util.*;

public class VowelAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(26);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.print((char)c + ", " + c + ": ");
            switch(c){
                case 'a' :
                case 'i' :
                case 'e' :
                case 'o' :
                case 'u' : System.out.println("гласная"); break;
                case 'y' :
                case 'w' : System.out.println("Условно гласная"); break;
                default:
                    System.out.println("Согласная");
            }
        }
    }
}
