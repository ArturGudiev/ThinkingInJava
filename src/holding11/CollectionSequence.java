package holding11;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * Created by 1 on 19.12.2016.
 */
public class CollectionSequence extends AbstractCollection<Pet> {
    private Pet[] pets = Pet.createArray(8);

    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>(){
            private int index = 0;
            public boolean hasNext(){
                return index < pets.length;
            }
            public Pet next(){return pets[index++];}
            public void remove() { throw new UnsupportedOperationException(); }
        };
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsInterator.display(c);
        InterfaceVsInterator.display(c.iterator());
    }
}
