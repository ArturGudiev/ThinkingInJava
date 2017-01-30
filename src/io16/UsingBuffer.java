package io16;

/**
 * Created by 1 on 30.01.2017.
 */
import java.nio.*;

public class UsingBuffer {
    private static void symmetricScrambe(CharBuffer buffer){
        while(buffer.hasRemaining()){
            buffer.mark();
            char c1 = buffer.get();
            char c2 = buffer.get();
            buffer.reset();
            buffer.put(c2).put(c1);
        }
    }

    public static void main(String[] args) {
        char[] data = "UsingBuffers".toCharArray();
        ByteBuffer bb = ByteBuffer.allocate(data.length * 2);
        CharBuffer cb = bb.asCharBuffer();
        cb.put(data);
        System.out.println(cb.rewind());
        symmetricScrambe(cb);
        System.out.println(cb.rewind());
        symmetricScrambe(cb);
        System.out.println(cb.rewind());
    }
}
