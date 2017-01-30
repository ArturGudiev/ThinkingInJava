package io16;

/**
 * Created by 1 on 28.01.2017.
 */
import com.sun.istack.internal.NotNull;

import java.io.*;

public class BufferedInputFile {
    public static String read(@NotNull String filename)
        throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while((s = in.readLine()) != null){
            sb.append(s + "\n");
        }
        in.close();
        return sb.toString();
    }
//todo this project doesn't work
    public static void main(String[] args) throws IOException{
        System.out.println(read("BufferedInputFile.java"));

    }
}
