package io16;

/**
 * Created by 1 on 28.01.2017.
 */
import java.io.*;

public class MemoryInput {
    public static void main(String[] args) throws IOException{
        StringReader in = new StringReader(BufferedInputFile.read("MemoryInput.java"));
        int c;
        while((c = in.read()) != -1){
            System.out.print((char)c);
        }
    }
}
