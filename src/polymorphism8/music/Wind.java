package polymorphism8.music;

/**
 * Created by 1 on 06.10.2016.
 */
class Instrum {
    public void play(Note n){
        System.out.println("Instrum play()");
    }
}

public class Wind extends Instrum{
    public void play(Note n){
        System.out.println("Wind play() " + n);
    }
}
