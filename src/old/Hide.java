package old;

/**
 * Created by 1 on 04.10.2016.
 */

class Homer{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class Milhouse{}

class Bart extends Homer{
    void doh(Milhouse m){
        System.out.println("doh(milHouse)");
    }
}

class Lisa extends Homer{
    @Override
    char doh(char c){
        System.out.println("doh(char) old.Lisa");
        return 'c';
    }
}

public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('c');
        b.doh(1.0f);
        b.doh(new Milhouse());
        Lisa l = new Lisa();
        l.doh('c');
    }
}
