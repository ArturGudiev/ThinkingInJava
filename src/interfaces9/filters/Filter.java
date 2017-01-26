package interfaces9.filters;

/**
 * Created by 1 on 12.10.2016.
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){return input; }
}
