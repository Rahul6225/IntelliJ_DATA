package DSA.HashMaps;
import java.util.*;
public class Anagram {
    static HashMap<Character,Integer> MakeFreq(String str){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else {
                mp.put(ch,mp.get(ch)+1);
            }
        }
        return mp;
    }
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> mp1 =MakeFreq(s);
        Map<Character,Integer> mp2 = MakeFreq(t);

        return mp1.equals(mp2);
    }
    public static void main(String[] args) {
        
    }
}
