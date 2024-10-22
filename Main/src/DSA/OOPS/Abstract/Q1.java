package DSA.OOPS.Abstract;
import java.util.*;
abstract class Pen{
   abstract  void Write();
   abstract void Refill();
}
class FountainPen extends Pen {
    void Write(){
        System.out.println("Write1");
    };
    void Refill(){
        System.out.println("Refill2)");

    };
    void ChangeNib(){
        System.out.println("(Question-1=Changing Nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir");
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }

    @Override
    public void Sleep() {
        System.out.println("Sleeping");
    }
}
interface BasicAnimal{
    void eat();
    void Sleep();
}
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();


}
public class Q1 {
    public static void main(String[] args) {
//        Pen p = new FountainPen();
//        FountainPen fPen = new FountainPen();
//        fPen.ChangeNib();
//        p.Write();
//        p.Refill();
//        Human R = new Human();
//        R.eat();
//        R.Sleep();
//
//        Monkey m1 = new Human();

    }

}
