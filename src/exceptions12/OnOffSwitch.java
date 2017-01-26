package exceptions12;

/**
 * Created by 1 on 22.12.2016.
 */
public class OnOffSwitch {
    private static Switch sw = new Switch();
    static void f() throws OnOffException1, OnOffException2 {}

    public static void main(String[] args) {
        try{
            sw.on();
            f();
            sw.off();
        }catch (OnOffException1 e){
            System.out.println("OnOffException1");
            sw.off();
        }catch (OnOffException2 e){
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
