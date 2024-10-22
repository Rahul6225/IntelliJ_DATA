package ADI_CW;
import java.util.*;
public class Questions {
    public static void main(String[] args) {
        //Given a string find its first non-repeating element index and return -1 if not found
//********************
//        String s = "aaabbbccd";
//        int res=0;
//        Map<Character,Integer> mpp = new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            mpp.put(ch, mpp.getOrDefault(ch,0)+1);
//        }
//        for(int i=0;i<s.length();i++){
//            if(mpp.get(s.charAt(i))==1){
//                res=i;
//                break;
//            }
//        }
//        System.out.println(res);
        //*****************

//        String str = "aabbccd";
//        String[] words = str.split("");
//        int cnt=0;
//        for(int i=0;i< words.length;i++){
//            for(int j=1;j< words.length;j++) {
//                if (words[i]==words[j]) {
//                    cnt++;
//                }
//
//            }
//            if(cnt==1){
//                System.out.println(words[i]);
//            }
//        }

        //Given a string find the length of the largest longest substring with non-repeating character



        //Given an Array and a target find the index of two elements in the array whose sum is equal to the target
//        int[] arr = {1,3,5,6,9};
//        int target = 10;
//        for(int i=0;i<arr.length;i++){
//            for(int j=1;j< arr.length;j++){
//                if(target==arr[i]+arr[j]){
//                    System.out.println(i+" "+j);
//                }
//            }
//        }
        int[] arr = {2,3,4,5,6,7};
        int target = 9;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int b = arr[i];
            mpp.put(b, mpp.getOrDefault(b,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
        System.out.println(-1);
    }
}
