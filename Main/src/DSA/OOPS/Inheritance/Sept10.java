package DSA.OOPS.Inheritance;

class Shape{
    String colour;
}
class Triangle extends Shape{

}
public class Sept10 {
    public static void main(String [] args){
        Triangle triangle = new Triangle();
        triangle.colour = "red";
        System.out.println(triangle.colour);
    }
}



