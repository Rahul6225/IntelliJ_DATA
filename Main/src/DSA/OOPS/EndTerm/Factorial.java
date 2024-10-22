package DSA.OOPS.EndTerm;
import java.sql.SQLOutput;
import java.util.*;

public class Factorial {
    public static int IsFact(int num){
        if(num==0){
            return 1;
        }
        return (num*IsFact(num-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int res = IsFact(n);

        System.out.println(res);

    }
}
