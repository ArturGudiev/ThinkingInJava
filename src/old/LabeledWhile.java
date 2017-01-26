package old;

/**
 * Created by 1 on 15.09.2016.
 */
public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0 ;
        outer:
        while(true){
            System.out.println("Внешний цикл while");
            while (true){
                i++;
                System.out.println("i = " + i);
                if (i == 1){
                    System.out.println("continue");
                    continue;
                }
                if( i == 3){
                    System.out.println("break");
                    break;
                }
                if (i == 5){
                    System.out.println("continue outer");
                    continue outer;
                }
                if( i == 7){
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }
}
