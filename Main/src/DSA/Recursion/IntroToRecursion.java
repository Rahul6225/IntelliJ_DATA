//package DSA.Recursion;
//
//public class IntroToRecursion {
//    public static void main(String[] args) {
//        print(1);
//    }
//    static void print(int n){
//        if(n==5){              //Base Condition means where recursion will stop from making new call
//            System.out.println(5);
//            return;
//        }
//        System.out.println(n);
//        print(n+1);
//    }
//}

package DSA.Recursion;

public class IntroToRecursion {
    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }
    static int Fibonacci(int n){
        if(n<2){
            return n;
        }
        return Fibonacci(n-2)+Fibonacci(n-1);
    }
}

