package interfaces9;

/**
 * Created by 1 on 13.10.2016.
 */

interface Monster{
    void menace();
}

interface DangerousMonster extends Monster{
    void destroy();
}

interface Lethal{
    void kill();
}

class DragonZilla implements DangerousMonster{
    public void menace(){}
    public void destroy(){}
}

interface Vampire extends DangerousMonster, Lethal{
    void drinkBlood();
}

class VeryBadVampire implements Vampire{
    public void menace(){}
    public void destroy(){}
    public void kill(){}
    public void drinkBlood(){}
}

public class HorrorShow {
    static void u(Monster b){b.menace();}
    static void v(DangerousMonster d){
        d.destroy();
        d.menace();
    }
    static void w(Lethal l){l.kill();}

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }

}
