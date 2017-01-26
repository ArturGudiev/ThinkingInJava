package generics14;

/**
 * Created by 1 on 21.01.2017.
 */

class ClassAsFactory<T>{
    T x;
    public ClassAsFactory(Class<T> kind){
        try{
            x = kind.newInstance();
        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}

class Employee {}


public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe =
                new ClassAsFactory<Employee>(Employee.class);
        System.out.println("ClassAsFactory<Employee> успех");
        try{
            ClassAsFactory<Integer> fi =
                    new ClassAsFactory<Integer>(Integer.class);
        }catch (Exception e){
            System.out.println("ClassAsFactory<Integer> неудача");
        }
    }
}
