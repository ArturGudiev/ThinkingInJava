package io16;

/**
 * Created by 1 on 28.01.2017.
 */
import java.io.*;

public class TestEOF {
    public static void main(String[] args) throws IOException{
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("TestEOF.java")));
        while (in.available() != 0){
            System.out.print((char)in.readByte());
        }
    }
}
