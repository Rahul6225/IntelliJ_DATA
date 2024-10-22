package DSA.OOPS.MultiThreading;
class Myrunablethread implements Runnable{
    public void run(){
        System.out.println("I m a Thread not a threat");
    }
}
class Myrunablethread2 implements Runnable{
    public void run(){
        System.out.println("I m a Thread2 not a threat2");
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        Myrunablethread n = new Myrunablethread();
        Thread gun1 = new Thread(n);
        Myrunablethread2 n1 = new Myrunablethread2();
        Thread gun2 = new Thread(n1);

        gun1.start();
        gun2.start();


    }
}
