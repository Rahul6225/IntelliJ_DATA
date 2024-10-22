package DSA.OOPS.QuestionsST2;
import java.util.*;
public class Angram {
    public static void main(String[] args) {
        String str = "run";
        String str2 = "NUr";

        if(str.length()!=str2.length()){
            System.out.println("False");
        }
        else{
            char[]s = str.toLowerCase().toCharArray();
            char[] q = str2.toLowerCase().toCharArray();

            Arrays.sort(s);
            Arrays.sort(q);
            System.out.println(Arrays.equals(s,q));

        }

    }
}
