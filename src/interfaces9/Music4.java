package interfaces9; /**
 * Created by 1 on 11.10.2016.
 */

import polymorphism8.music.*;

abstract class Instrument4{
    private int i;
    public abstract void play(Note n);
    String what(){ return "Instrument"; }
    public abstract void adjust();
}

class Wind4 extends Instrument4 {
    public void play(Note n){ System.out.println("interfaces9.Wind4.play() " + n);}
    String what(){ return "interfaces9.Wind4";}
    public void adjust(){}
}

class Percussion4 extends Instrument4 {
    public void play(Note n){System.out.println("interfaces9.Percussion4.play() " + n);}
    String what(){ return "interfaces9.Percussion4";}
    public void adjust(){}
}

class Stringed4 extends Instrument4 {
    public void play(Note n){System.out.println("interfaces9.Stringed4.play() " + n);}
    String what(){ return "Stringed3";}
    public void adjust(){}
}

class Brass4 extends Wind4{
    public void play(Note n){System.out.println("interfaces9.Brass4.play() " + n);}
    public void adjust(){System.out.println("interfaces9.Brass4.adjust()");}
}

class Woodwind4 extends Wind4{
    public void play(Note n){System.out.println("interfaces9.Woodwind4.play() " + n);}
    public String what(){ return "Woodwind3";}
}

public class Music4 {
    public static void tune(Instrument4 i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument4[] e){
        for(Instrument4 i : e){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument4[] orchestra = {
                new Wind4(),
                new Percussion4(),
                new Stringed4(),
                new Brass4(),
                new Woodwind4()
        };
        tuneAll(orchestra);
    }
}


