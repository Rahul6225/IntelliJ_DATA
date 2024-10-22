package DSA.OOPS.Interface;
interface client{
    void webdesign();
    void devlopcode();
}
abstract class Rajtech implements  client{
    @Override
   public void webdesign(){
        System.out.println("green,blue,and yellow");
    }
}
class Rahultech extends Rajtech{
    @Override
    public void devlopcode(){
        System.out.println("Html,css,JavaScript code ");
    }
}
public class New1 {
    public static void main(String[] args) {
        Rahultech r = new Rahultech();
        r.webdesign();
        r.devlopcode();
    }
}
