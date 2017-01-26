package innerclasses10;

/**
 * Created by 1 on 11.12.2016.
 */

interface Counter{
    int next();
}

public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name){
        class LocalCounter implements Counter{
            public LocalCounter(){
                System.out.println("LocalCounter()");
            }
            public int next(){
                System.out.print(name);
                return count++;
            }
        }
        return new LocalCounter();
    }
    Counter getCounter2(final String name){
        return new Counter(){
            {
                System.out.println("Counter()");
            }
            public int next(){
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("локальный "),
                c2 = lic.getCounter2("безымянный ");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }
}
