package typeinfo13;

/**
 * Created by 1 on 05.01.2017.
 */
import java.util.*;

public class SnowRemovalRobot implements Robot{
    private String name;
    public SnowRemovalRobot(String name){this.name = name;}

    @Override
    public String name() {
        return name;
    }

    @Override
    public String model() {
        return "SnowBot series 11";
    }

    @Override
    public List<Operation> operations() {
        return Arrays.asList(
            new Operation(){
                public String description(){
                    return name + "can clean snow";
                }
                public void command(){
                    System.out.println(name + "is cleaning snow");
                }
            },
            new Operation(){
                public String description(){
                    return name + "can clean roof";
                }
                public void command(){
                    System.out.println(name + "is cleaning roof");
                }
            },
            new Operation(){
                public String description(){
                    return name + "can split ice";
                }
                public void command(){
                    System.out.println(name + "is spliting ice");
                }
            }
                );
    }

    public static void main(String[] args) {
        Robot.Test.test(new SnowRemovalRobot("Slusher"));
    }
}
