package exceptions12;

import java.io.FileInputStream;

/**
 * Created by 1 on 23.12.2016.
 */
public class MainException {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("MainException.java");
        file.close();
    }
}
