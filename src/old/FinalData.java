package old; /**
 * Created by 1 on 05.10.2016.
 */
import java.util.*;
class Value{
    int i;
    public Value(int i){this.i = i;}
}

public class FinalData{
    private static Random rand = new Random(47);
    private String id;
    public FinalData(String id){this.id = id; }
    //Могут быть константами времени компиляции
    private final int valueOne = 19;
    private static final int VALUE_TWO = 99;
    //Типичная открытая константа
    public static final int VALUE_THREE = 100;
    // Не может быть константой времени компиляции:
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(30);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    //Массивы
    private final int[] a = {1, 2, 3, 4, 5, 6};
    public String toString(){
        return id +  ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //fd1.ValueOne++;
        fd1.v2.i++;
        fd1.v1 = new Value(2);
        for(int i = 0 ; i < fd1.a.length; i++){
            fd1.a[i]++;
        }
        //fd1.v2 = new old.Value(1);
        //fd1.VAL_3 = new old.Value(0);
        //fd1.a = new int[3];
        System.out.println(fd1);
        System.out.println("Создаем old.FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }


}
