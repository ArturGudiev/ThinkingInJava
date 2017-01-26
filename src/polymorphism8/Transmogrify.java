package polymorphism8;

/**
 * Created by 1 on 09.10.2016.
 */

class Actor{
    public void act(){}
}

class HappyActor extends Actor{
    public void act(){
        System.out.println("Happy actor");
    }
}
class SadActor extends Actor{
    public void act(){
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change(){ actor = new SadActor();}
    public void performPlay(){actor.act();}
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
