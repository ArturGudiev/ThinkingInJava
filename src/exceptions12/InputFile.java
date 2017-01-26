package exceptions12;

/**
 * Created by 1 on 22.12.2016.
 */
import java.io.*;
public class InputFile {
    private BufferedReader in;
    public InputFile(String fname) throws Exception{
        try{
            in = new BufferedReader(new FileReader(fname));
        }catch (FileNotFoundException e){
            System.out.println("Can't open " + fname);
            throw e;
        }catch (Exception e){
            try{
                in.close();
            }catch (IOException e2){
                System.out.println("in.close() was executed wrongly");
            }
            throw e;
        }finally {

        }
    }
    public String getLine(){
        String s;
        try{
            s = in.readLine();
        }catch (IOException e){
            throw new RuntimeException("readLine() was executed wrongly");
        }
        return s;
    }
    public void dispose(){
        try{
            in.close();
            System.out.println("dispose is successful");
        }catch (IOException e2){
            throw new RuntimeException("in.close was executed unsuccessfully");
        }
    }

    public static void main(String[] args) {
        try{
            InputFile iFile = new InputFile("a.txt");

        } catch (Exception e){

        }
    }
}
