package interfaces9.filters;

/**
 * Created by 1 on 12.10.2016.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){return "Waveform " + id;}
}
