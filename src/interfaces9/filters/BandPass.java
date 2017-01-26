package interfaces9.filters;

/**
 * Created by 1 on 12.10.2016.
 */
public class BandPass extends Filter{
    double lowCutoff, highCutoff;
    public BandPass(double lowCut, double highCut){
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    public Waveform process(Waveform input){return input;}
}
