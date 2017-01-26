package exceptions12;

/**
 * Created by 1 on 22.12.2016.
 */
public class Cleanup {
    public static void main(String[] args) {
        try{
            InputFile in = new InputFile("Cleanup.java");
            try{
                String s;
                while((s = in.getLine()) != null);
            }catch (Exception e){
                System.out.println("Перехвачено Exception в main");
                e.printStackTrace(System.out);
            }finally {
                in.dispose();
            }
        }catch (Exception e){
            System.out.println("Сбой при конструировании InputFile");
        }
    }
}
