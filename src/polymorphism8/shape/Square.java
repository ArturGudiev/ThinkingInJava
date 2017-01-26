package polymorphism8.shape;

/**
 * Created by 1 on 06.10.2016.
 */
public class Square extends Shape {
    public void draw(){
        System.out.println("Square.draw()");
    }
    public void erase(){
        System.out.println("Square.erase()");
    }
}
