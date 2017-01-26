package polymorphism8.shape;

/**
 * Created by 1 on 06.10.2016.
 */
public class Shapes {
    private static RandomShapeGenerator rand = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for(int i = 0; i < s.length; i ++){
            s[i] = rand.next();
        }
        for(Shape shp : s){
            shp.draw();
        }
    }
}
