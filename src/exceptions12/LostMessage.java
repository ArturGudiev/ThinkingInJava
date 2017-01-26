package exceptions12;

/**
 * Created by 1 on 22.12.2016.
 */

class VeryImportantException extends Exception{
    public String toString(){return "Очень важное исключение!";}
}

class HoHumException extends Exception{
    public String toString(){return "Второстепенное исключение!";}
}

public class LostMessage {
    void f() throws VeryImportantException{
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException{
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try{
            LostMessage lm = new LostMessage();
            try{
                lm.f();
            }finally {
                lm.dispose();
            }
            }catch (Exception e){
            System.out.println(e);
        }
    }
}
