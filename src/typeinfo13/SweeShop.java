package typeinfo13;

/**
 * Created by 1 on 24.12.2016.
 */

class Candy{
    static {System.out.println("Закрузка класса Candy");}
}

class Gum{
    static {System.out.println("Закрузка класса Gum");}
}

class Cookie{
    static {System.out.println("Загрузка класса Cookie");}
}

public class SweeShop {
    public static void main(String[] args) {
        System.out.println("In main");
        new Candy();
        System.out.println("After candy()");
        try{
            Class.forName("typeinfo13.Gum");
        }catch (ClassNotFoundException e){
            System.out.println("Gum class is not found");
        }
        System.out.println("After calling Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After Cookie()");
    }
}
