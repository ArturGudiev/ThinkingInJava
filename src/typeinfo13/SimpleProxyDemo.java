package typeinfo13;

/**
 * Created by 1 on 04.01.2017.
 */

import java.util.*;

interface Interface{
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface{

    @Override
    public void doSomething() { System.out.println("doSomething()"); }

    @Override
    public void somethingElse(String arg) { System.out.println("somethingElse " + arg); }
}

class SimpleProxy implements Interface{
    private Interface proxied;
    public SimpleProxy(Interface proxied){
        this.proxied = proxied;
    }
    @Override
    public void doSomething() {
        System.out.println("SimpleProxy.doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy.somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
        /*int[] a = new int[30];
        a[0] = 0; a[1] = 1; a[2] = -1;
        for (int i = 3; i < 30; i++) {
            a[i] = -a[i-1] - 2*a[i-2];
        }
        for (int n = 2; n < 10; n++) {
            System.out.println(Math.pow(2,n+2) - 7*a[n]*a[n]);
        }
        System.out.println(Arrays.toString(a));*/

    }
}
