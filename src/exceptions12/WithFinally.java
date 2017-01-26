package exceptions12;

/**
 * Created by 1 on 22.12.2016.
 */
public class WithFinally {
    static Switch sw = new Switch();

    public static void main(String[] args) {
        try{
            sw.on();
            OnOffSwitch.f();
        }catch(OnOffException1 e){
            System.out.println("OnOffException1");
        }catch(OnOffException2 e){
            System.out.println("OnOffException2");
        }finally{
            sw.off();
        }
    }
}
