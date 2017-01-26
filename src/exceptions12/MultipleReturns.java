package exceptions12;

/**
 * Created by 1 on 22.12.2016.
 */
public class MultipleReturns {
    public static void f(int i){
        System.out.println("Инициализация, требующая завершение");
        try{
            System.out.println("Point 1");
            if(i == 1){return;}
            System.out.println("Point 2");
            if(i == 2){return;}
            System.out.println("Point 3");
            if(i == 3){return;}
            System.out.println("The end");
            return;
        }finally{
            System.out.println("Finishing");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            f(i);
        }
    }
}
