package old;

/**
 * Created by 1 on 15.09.2016.
 */
public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;

        outer:
        for(;true;){
            inner:
            for(; i < 10; i++){
                System.out.println("i = " + i);
                if( i == 2){
                    System.out.println("continue");
                    continue ;
                }
                if (i == 3){
                    i++;
                    System.out.println("break");
                    break;
                }
                if (i == 7){
                    i++;
                    System.out.println("continue outer");
                    continue outer;
                }
                if(i == 8){
                    System.out.println("break outer");
                    break outer;
                }
                for(int k = 0; k < 5 ; k++){
                    if(k == 3){
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}
