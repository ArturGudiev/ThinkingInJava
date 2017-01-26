package old;

/**
 * Created by 1 on 04.10.2016.
 */
class Shape{
    Shape(int i) {
        System.out.println("Рисуем old.Shape");
    }
    void dispose(){
        System.out.println("Завершаем old.Shape");
    }
}

class Circle extends Shape{
    Circle(int i){
        super(i);
        System.out.println("Рисуем окружность old.Circle");
    }
    void dispose(){
        System.out.println("Стираем окружность old.Circle");
        super.dispose();
    }
}

class Triangle extends Shape{
    Triangle(int i){
        super(i);
        System.out.println("Рисуем треугольник old.Triangle");
    }
    void dispose(){
        System.out.println("Стираем треугольник old.Triangle");
        super.dispose();
    }
}

class Line extends Shape{
    private int start, end;
    Line(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Рисуем линию " + start + " " + end);
    }

    void dispose(){
        System.out.println("Стираем линию " + start + " " + end);
        super.dispose();
    }
}


public class CADSystem extends Shape {
    Triangle t;
    Circle c;
    private Line[] lines = new Line[3];
    public CADSystem(int i){
        super(i+1);
        for(int j = 0; j < lines.length ; j ++){
            lines[j] = new Line(j, j*j);
        }
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Комбинированный конструктор");
    }
    void dispose(){
        System.out.println("CADSSystem.dispose()");
        t.dispose();
        c.dispose();
        for(int j = lines.length - 1; j >= 0 ; j--){
            lines[j].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try{

        }finally {
            x.dispose();
        }
    }
}
