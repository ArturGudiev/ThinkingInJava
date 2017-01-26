package exceptions12;

/**
 * Created by 1 on 20.12.2016.
 */
import java.util.logging.*;
import java.io.*;

public class LoggingExceptions2 {
    private static Logger logger = Logger.getLogger("LoggingExceptions2");
    static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace();
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try{
            throw new NullPointerException();
        }catch(NullPointerException e){
            logException(e);
        }
    }
}
