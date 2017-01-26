package exceptions12;

/**
 * Created by 1 on 20.12.2016.
 */
import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception{
    private static Logger logger = Logger.getLogger("LoggingExceptions");
    public LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try{
            throw new LoggingException();
        }
        catch (LoggingException e){
            System.err.println("Перехвачено " + e);
        }
        try{
            throw new LoggingException();
        }
        catch (LoggingException e){
            System.err.println("Перехвачено " + e);
        }
    }
}
