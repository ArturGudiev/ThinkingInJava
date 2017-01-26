package old; /**
 * Created by 1 on 14.09.2016.
 */
import java.util.*;
public class ForEachFloat {

    public static void main(String[] args) {
        float[] f = new float[10];
        Random rand = new Random(47);
        for(int i = 0 ; i < 10; i ++){
            f[i] = rand.nextFloat();
        }
        for(float x : f){
            System.out.println(x);
        }
    }
}
