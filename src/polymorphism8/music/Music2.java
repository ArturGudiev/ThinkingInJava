package polymorphism8.music;

/**
 * Created by 1 on 06.10.2016.
 */
class Stringed extends Instrum{
    public void play(Note n){
        System.out.println("Stringed play() " + n);
    }
}

class Brass extends Instrum{
    public void play(Note n){
        System.out.println("Brass play() " + n);
    }
}

public class Music2 {
    public static void tune(Wind i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Brass i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}