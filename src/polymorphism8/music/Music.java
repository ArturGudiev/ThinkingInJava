package polymorphism8.music;

/**
 * Created by 1 on 06.10.2016.
 */
public class Music {
    public static void tune(Instrum i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);

    }
}
