package holding11;

/**
 * Created by 1 on 19.12.2016.
 */
import java.util.*;
class PetSequence{
    protected Pet[] pets = Pet.createArray(8);
    public Pet[] getArray(){return pets;}
}

public class NonCollectionSequence {

    protected Pet[] pets = Pet.createArray(8);
    public Iterator<Pet> iterator(){
        return new Iterator<Pet>(){
            private int index = 0;
            public boolean hasNext(){
                return index < pets.length;
            }
            public Pet next(){return pets[index++];}
            public void remove(){ throw new UnsupportedOperationException(); }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsInterator.display(nc.iterator());
    }
}
