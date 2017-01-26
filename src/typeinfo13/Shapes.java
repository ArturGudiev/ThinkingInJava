package typeinfo13;

/**
 * Created by 1 on 24.12.2016.
 */
import java.util.*;
abstract class Shape{
    void draw(){System.out.println(this + ".draw()");}
    abstract public String toString();
}

class Circle extends Shape{

    @Override
    public String toString() {
        return "Circle";
    }
}

class Triangle extends Shape{
    @Override
    public String toString() {
        return "Triangle";
    }
}

class Square extends Shape{

    @Override
    public String toString() {
        return "Square";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Triangle(), new Square());
        for(Shape shape : shapeList){
            shape.draw();
        }
    }
}
