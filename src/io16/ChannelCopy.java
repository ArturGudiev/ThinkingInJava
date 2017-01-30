package io16;

/**
 * Created by 1 on 29.01.2017.
 */
import java.nio.*;
import java.nio.channels.*;
import java.io.*;


public class ChannelCopy {
    private static final int BSIZE = 1024;
    public static void main(String[] args) throws Exception{
        if(args.length != 2){
            System.out.println("параметры Источник Приемник");
            System.exit(1);
        }
        FileChannel in = new FileInputStream(args[0]).getChannel(),
                out = new FileOutputStream(args[1]).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        while(in.read(buffer) != -1){
            buffer.flip();
            out.write(buffer);
            buffer.clear();
        }

    }
}
