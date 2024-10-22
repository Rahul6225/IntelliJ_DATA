package DSA.OOPS.Interface;
interface gill{    //client
    void add();
}
interface raj extends gill{      //client
    void sub();
}
class Rahul implements raj{        //devloper
    @Override
    public void add(){
        int a=10,b=20,c;
        c = a+b;
        System.out.println("Addition:"+c);
    }
    @Override
    public void sub(){
        int a=10,b=5,c;
        c = a-b;
        System.out.println("Subtraction:"+c);
    }


}
public class ExtendingInterface {
    public static void main(String[] args) {
        raj r = new Rahul();
        r.sub(); r.add();
//        Rahul r = new Rahul();
//        r.add();
//        r.sub();
    }
}
