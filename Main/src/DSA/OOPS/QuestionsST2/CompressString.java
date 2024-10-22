package DSA.OOPS.QuestionsST2;
import java.util.*;
public class CompressString {
    public static void main(String[] args) {
        String s1 = "aaabbbcccab";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);

            }
            else{
                map.put(s1.charAt(i),1);
            }
        }
        map.forEach((key,value)-> System.out.print(key+""+value));
    }
}

