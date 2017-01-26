package polymorphism8.shape;

/**
 * Created by 1 on 06.10.2016.
 */
public class Triangle extends Shape {
    public void draw(){
        System.out.println("Triangle.draw()");
    }

    public void erase(){
        System.out.println("Triangle.erase()");
    }
}

