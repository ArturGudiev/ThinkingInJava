package io16;

import java.io.PrintWriter;

/**
 * Created by 1 on 28.01.2017.
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("Hello, world!");
    }
}
