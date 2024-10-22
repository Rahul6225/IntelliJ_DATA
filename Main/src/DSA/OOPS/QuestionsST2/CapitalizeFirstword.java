package DSA.OOPS.QuestionsST2;
import java.util.*;
public class CapitalizeFirstword {
    public static void main(String[] args) {
        String str = " behind  is everone ";
        String str2 = str.replaceAll("\\s{2,}"," ").trim();
        System.out.println(str2);
        String[] words= str2.split(" ");
        for(String word:words){
            System.out.print(word.substring(0,1).toUpperCase()+word.substring(1,word.length())+" ");
//            System.out.println(Arrays.toString(words));
        }
    }
}
