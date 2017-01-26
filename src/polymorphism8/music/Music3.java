package polymorphism8.music;

/**
 * Created by 1 on 07.10.2016.
 */
class Instrument{
    void play(Note n){ System.out.println("Instrument.play() " + n ); }
    String what(){ return "Instrument"; }
    void adjust(){ System.out.println("Adjusting Instrument"); }
}

class Wind3 extends Instrument {
    void play(Note n){ System.out.println("Wind3.play() " + n);}
    String what(){ return "Wind3";}
    void adjust(){ System.out.println("Adjusting Wind3");}
}

class Percussion3 extends Instrument {
    void play(Note n){System.out.println("Percussion3.play() " + n);}
    String what(){ return "Percussion3";}
    void adjust(){System.out.println("Adjusting Percussion3");}
}

class Stringed3 extends Instrument {
    void play(Note n){System.out.println("Stringed3.play() " + n);}
    String what(){ return "Stringed3";}
    void adjust(){System.out.println("Adjusting Stringed3");}
}

class Brass3 extends Wind3{
    void play(Note n){System.out.println("Brass3.play() " + n);}
    String what(){ return "Brass3";}
}

class Woodwind3 extends Wind3{
    void play(Note n){System.out.println("Woodwind3.play() " + n);}
    String what(){ return "Woodwind3";}
}

public class Music3 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e){
        for(Instrument i : e){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind3(),
                new Percussion3(),
                new Stringed3(),
                new Brass3(),
                new Woodwind3()
        };
        tuneAll(orchestra);
    }
}
