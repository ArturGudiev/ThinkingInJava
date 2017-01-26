package polymorphism8;

/**
 * Created by 1 on 08.10.2016.
 */
class Shared{
    private int refCount = 0 ;
    private static long counter = 0;
    private final long id = counter++;

    public Shared(){
        System.out.println("Создаем " + this);
    }

    public void addRef(){refCount++;}
    protected void dispose(){
        if(--refCount == 0){
            System.out.println("Disposing " + this);
        }
    }

    public String toString(){
        return "Shared" + id ;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared){
        System.out.println("Создаем " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose(){
        System.out.println("Disposing " + this);
        shared.dispose();
    }
    public String toString(){
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared room = new Shared();
        Composing[] collection = new Composing[]{
            new Composing(room), new Composing(room),
                new Composing(room), new Composing(room)
        };
        for(Composing c:collection){
            c.dispose();
        }
    }
}
