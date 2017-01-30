package io16;

/**
 * Created by 1 on 30.01.2017.
 */
import java.nio.*;
import java.nio.channels.*;
import java.io.*;

public class LargeMappedFiles {
    static int length = 0x8FFFFFF;

    public static void main(String[] args) throws Exception{
        MappedByteBuffer out = new RandomAccessFile("test.data", "rw").getChannel().
                map(FileChannel.MapMode.READ_WRITE, 0, length);
        for (int i = 0; i < length; i++) {
            out.put((byte)'x');
        }
        System.out.println("Запись завершена");
        for (int i = length/2; i < length/2 + 6 ; i++) {
            System.out.print((char)out.get(i));
        }
    }
}