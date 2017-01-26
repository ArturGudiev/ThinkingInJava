package interfaces9;

import java.util.Random;

/**
 * Created by 1 on 29.11.2016.
 */
public interface RandVals {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong()*10;
    float RANDOM_FLOAT = RAND.nextFloat()*10;
    double RANDOM_DOUBLE = RAND.nextDouble()*10;
}
