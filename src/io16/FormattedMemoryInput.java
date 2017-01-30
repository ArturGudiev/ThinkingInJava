package io16;

import java.io.*;

/**
 * Created by 1 on 28.01.2017.
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException{
        try{
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(
                    BufferedInputFile.read("FormattedMemoryInput.java").getBytes()));
            while(true){
                System.out.print((char)in.readByte());
            }
        }catch(EOFException e){
            System.err.println("End of stream");
        }
    }
}
