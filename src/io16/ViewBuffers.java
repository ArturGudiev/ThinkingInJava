package io16;

/**
 * Created by 1 on 29.01.2017.
 */
import java.nio.*;

public class ViewBuffers {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.wrap(new byte[]{0,0,0,0,0,0,0, 'a'});
        bb.rewind();
        System.out.println("Буфер byte");
        while (bb.hasRemaining()){
            System.out.print(bb.position() + " -> " + bb.get() + ", ");
        }
        System.out.println();
        CharBuffer cb = ((ByteBuffer)bb.rewind()).asCharBuffer();
        System.out.println("Буфер char");
        while(cb.hasRemaining()){
            System.out.println(cb.position() + " -> " + cb.get() + ", ");
        }
        System.out.println();
        FloatBuffer fb = ((ByteBuffer)bb.rewind()).asFloatBuffer();
        System.out.println("Буфер Float");
        while (fb.hasRemaining()){
            System.out.println(fb.position() + " -> " + fb.get() + ", ");
        }
        System.out.println();

        IntBuffer ib = ((ByteBuffer)bb.rewind()).asIntBuffer();
        System.out.println("Буфер Int");
        while (ib.hasRemaining()){
            System.out.println(ib.position() + " -> " + ib.get() + ", ");
        }
        System.out.println();

        LongBuffer lb = ((ByteBuffer)bb.rewind()).asLongBuffer();
        System.out.println("Буфер Long");
        while (lb.hasRemaining()){
            System.out.println(lb.position() + " -> " + lb.get() + ", ");
        }
        System.out.println();

        ShortBuffer sb = ((ByteBuffer)bb.rewind()).asShortBuffer();
        System.out.println("Буфер Short");
        while (sb.hasRemaining()){
            System.out.println(sb.position() + " -> " + sb.get() + ", ");
        }
        System.out.println();

        DoubleBuffer db = ((ByteBuffer)bb.rewind()).asDoubleBuffer();
        System.out.println("Буфер Double");
        while (db.hasRemaining()){
            System.out.println(db.position() + " -> " + db.get() + ", ");
        }
        System.out.println();

    }
}
