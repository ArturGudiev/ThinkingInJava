package old;

/**
 * Created by 1 on 05.10.2016.
 */
class SmallBrain{}

final class Dinosaur{
    int i = 1;
    int j = 781;
    SmallBrain sb = new SmallBrain();
    void f(){ }
}


public class Jurassic {
    public static void main(String[] args) {
        Dinosaur d = new Dinosaur();
        d.i = 7;
        d.f();
        d.j++;
        d.sb = new SmallBrain();
    }
}

