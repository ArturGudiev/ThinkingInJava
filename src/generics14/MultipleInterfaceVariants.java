package generics14;

/**
 * Created by 1 on 23.01.2017.
 */
interface Payable<T>{}

class Employee2 implements Payable<Employee2>{}
class Hourly extends Employee implements Payable<Hourly> {}



public class MultipleInterfaceVariants {
}
