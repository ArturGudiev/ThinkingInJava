package old;

/**
 * Created by 1 on 04.10.2016.
 */

public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();
    public SpaceShipDelegation(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
    public void forward(int velocity){
        controls.forward(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA protector");
        protector.forward(100);
    }
}
