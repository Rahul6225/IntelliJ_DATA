package DSA.OOPS.ExceptionHandling;

public class multipletrycatch {
    public static void main(String[] args) {
        try{
            int a=10,b=3,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException m){
            System.out.println("Exception handled");
        }
        try{
            int a[] = {2,5,8,9};
            System.out.println(a[9]);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array out of bond");
        }
    }

}
