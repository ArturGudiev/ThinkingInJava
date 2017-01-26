package innerclasses10;

/**
 * Created by 1 on 09.12.2016.
 */

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{
    private Implementation1(){}
    public void method1(){
        System.out.println("Impl1 meth1");
    }
    public void method2(){System.out.println("Impl1 meth2");}

    public static ServiceFactory factory = new ServiceFactory(){
        public Service getService(){
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service{
    private Implementation2(){}
    public void method1(){System.out.println("Impl2 meth1");}
    public void method2(){System.out.println("Impl2 meth2");}

    public static ServiceFactory factory = new ServiceFactory(){
        public Service getService(){
            return new Implementation2();
        }
    };
}

public class Factories {

    public static void ServiceConsumer(ServiceFactory factory){
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        ServiceConsumer(Implementation1.factory);
        ServiceConsumer(Implementation2.factory);
    }
}
