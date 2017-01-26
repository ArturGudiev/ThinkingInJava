package interfaces9.filters;

/**
 * Created by 1 on 12.10.2016.
 */
public class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff){this.cutoff = cutoff;}
    public Waveform process(Waveform input){return input;}
}
