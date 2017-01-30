package io16;

/**
 * Created by 1 on 29.01.2017.
 */
import java.nio.channels.*;
import java.io.*;

public class TransferTo {
    public static void main(String[] args) throws Exception{
        if(args.length != 2){
            System.out.println("параметры источник приемник");
            System.exit(1);
        }
        FileChannel in = new FileInputStream(args[0]).getChannel(),
                out = new FileOutputStream(args[1]).getChannel();
        in.transferTo(0, in.size(), out);
    }
}
