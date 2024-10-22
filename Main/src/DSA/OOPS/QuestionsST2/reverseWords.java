package DSA.OOPS.QuestionsST2;
import java.util.*;
public class reverseWords {
    public static void main(String[] args) {
        String str = "The sky is blue";
        String[] words = str.split(" +");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");

        }
    }

}
