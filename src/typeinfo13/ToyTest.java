package typeinfo13;

/**
 * Created by 1 on 24.12.2016.
 */

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    Toy(){}
    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
    FancyToy(){super(1);}
}

public class ToyTest {
    static void printInfo(Class cc){
        System.out.println("Имя класса " + cc.getName() + " это интерфейс? [ " + cc.isInterface() + "]");
        System.out.println("Простое имя " + cc.getSimpleName());
        System.out.println("Каноническое имя " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try{
            c = Class.forName("typeinfo13.FancyToy");
        }catch (ClassNotFoundException e){
            System.out.println("FancyToy is not found");
            System.exit(1);
        }
        printInfo(c);
        
        for(Class face : c.getInterfaces()){
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try{
            obj = up.newInstance();
        }catch (InstantiationException e){
            System.out.println("Не удалось создать объект");
            System.exit(1);
        }catch (IllegalAccessException e){
            System.out.println("No access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
