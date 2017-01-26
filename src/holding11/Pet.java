package holding11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by 1 on 14.12.2016.
 */
public class Pet implements Comparable{
    String name;
    static int petNum = 9;
    public int id(){
        Pet p = this;
        switch(p.getClass().getSimpleName()){
            case("Pug"): return 0;
            case("Hamster"): return 1;
            case("EgyptianMau"): return 2;
            case("Cymric"): return 3;
            case("Manx"): return 4;
            case("Rat"): return 5;
            case("Mutt"): return 6;
            case("Cat"): return 7;
            case("Dog"): return 8;
            default: return 0;
        }
//        if(p.getClass() == Pug.class){return 0;}
//        if(p.getClass() == Hamster.class){return 1;}
//        if(p.getClass() == EgyptianMau.class){return 2;}
//        if(p.getClass() == Cymric.class){return 3;}
//        if(p.getClass() == Manx.class){return 4;}
//        if(p.getClass() == Rat.class){return 5;}
//        if(p.getClass() == Mutt.class){return 6;}
//        if(p.getClass() == Cat.class){return 7;}
//        if(p.getClass() == Dog.class){return 8;}
//        return 0;
    }
    public static ArrayList<Pet> arrayList(int num){
        ArrayList<Pet> aList = new ArrayList<Pet>();
        Random rand = new Random(petNum);
        for (int i = 0; i < num; i++) {
            int animal = Math.abs(rand.nextInt() % petNum);
            Pet pet;
            switch (animal){
                case 0 : pet = new Rat(); break;
                case 1 : pet = new Cymric();break;
                case 2 : pet = new Manx();break;
                case 3 : pet = new Pug();break;
                case 4 : pet = new Hamster();break;
                case 5 : pet = new EgyptianMau();break;
                case 6 : pet = new Mutt();break;
                case 7 : pet = new Cat(); break;
                case 8 : pet = new Dog(); break;
                default: pet = new Rat();
            }
            aList.add(pet);
        }
        return aList;
    }

    public static Pet[] createArray(int num){
        Pet[] pets = new Pet[num];
        Random rand = new Random(petNum);
        for (int i = 0; i < num; i++) {
            int animal = Math.abs(rand.nextInt() % petNum);
            Pet pet;
            switch (animal){
                case 0 : pet = new Rat(); break;
                case 1 : pet = new Cymric();break;
                case 2 : pet = new Manx();break;
                case 3 : pet = new Pug();break;
                case 4 : pet = new Hamster();break;
                case 5 : pet = new EgyptianMau();break;
                case 6 : pet = new Mutt();break;
                case 7 : pet = new Cat(); break;
                case 8 : pet = new Dog(); break;
                default: pet = new Rat();
            }
            pets[i] = pet;
        }
        return pets;
    }

    public static void main(String[] args) {
        Pet p = new Rat();
        Pet p1 = new Cymric();
        Pet p2 = new Manx();
        Pet p3 = new Pug();
        Pet p4 = new Hamster();
        Pet p5 = new EgyptianMau();
        Pet p6 = new Mutt();
        Pet p7 = new Cat();
        Pet p8 = new Dog();
        System.out.println(p.id() +" " + p1.id() +" " + p2.id() +" " + p3.id() +" " + p4.id() +" " + p5.id() +" " + p6.id() +" " +
                p7.id() +" " + p8.id());
    }

    @Override
    public int compareTo(Object o) {
        Pet p = (Pet) o;
        if(id() < p.id()){
            return -1;
        }
        return 1;
    }

    public static Pet RandomPet(){
        Random rand = new Random(6);
        Pet answer;
        switch(Math.abs(rand.nextInt() % petNum)){
                    case 0 : answer = new Pug(); break;
                    case 1 : answer = new Hamster(); break;
                    case 2 : answer = new EgyptianMau(); break;
                    case 3 : answer = new Cymric(); break;
                    case 4 : answer = new Manx(); break;
                    case 5 : answer = new Rat(); break;
                    case 6 : answer = new Mutt(); break;
                    case 7 : answer = new Cat(); break;
                    case 8 : answer = new Dog(); break;

            default: answer = new Rat();
        }
         return answer;
    }
}

class Rat extends Pet implements Comparable{
    public Rat(){}
    public Rat(String name){this.name = name;}
    public String toString(){
        return "Rat "+name;
    }
}

class Cymric extends Pet{
    public Cymric(){}
    public Cymric(String name){this.name = name;}
    public String toString(){
        return "Cymric "+name;
    }
}
class Manx extends Pet{
    public Manx(){}
    public Manx(String name){this.name = name;}
    public String toString(){
        return "Manx "+name;
    }
}
class Mutt extends Pet{
    public Mutt(){}
    public Mutt(String name){this.name = name;}
    public String toString(){
        return "Mutt "+name;
    }
}
class Pug extends Pet{
    public Pug(){}
    public Pug(String name){this.name = name;}
    public String toString(){
        return "Pug "+name;
    }
}
class EgyptianMau extends Pet{
    public EgyptianMau(){}
    public EgyptianMau(String name){this.name = name;}
    public String toString(){
        return "EgyptianMau "+name;
    }
}
class Hamster extends Pet{
    public Hamster(){}
    public Hamster(String name){this.name = name;}
    public String toString(){  return "Hamster " + name; }
}
class Cat extends Pet{
    public Cat(){}
    public Cat(String name){ this.name = name; }
    public String toString(){ return "Cat " + name;}
}

class Dog extends Pet{
    public Dog(){}
    public Dog(String name){this.name = name;}
    public String toString(){return "Dog " + name;}
}

//Mabx Cymric Mutt Pug EgyptianMau Hamster
