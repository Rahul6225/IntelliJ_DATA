package DSA.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int[] arr={2,3,4,4,6,7,4,3,4,7,5,3,6,7,4,4,5,4};
        Map<Integer,Integer> freq = new HashMap<>();
        for(int el:arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }
            else{
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());
        int maxFreq=0;
        int anskey=0;
        for(var key : freq.keySet()){
            if(freq.get(key)>maxFreq){
                maxFreq=freq.get(key);
                anskey=key;
            }
        }
//        for(var e : freq.entrySet()){
//            if(e.getValue()>maxFreq){                 //this is another method with same data
//                maxFreq=e.getValue();
//                anskey=e.getKey();
//            }
//        }
        System.out.printf("Max frequency of %d and it occurs %d times",anskey,maxFreq);
        //brut force

//        int [] arr = {1,3,2,1,4,1};
//        int maxC=1;
//        int val=0;
//        for(int i=0;i<arr.length;i++){
//            int cnt=1;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]==arr[i]) {
//                    cnt++;
//                }
//            }
//            if(cnt>maxC){
//                val=arr[i];
//                maxC=cnt;
//            }
//        }
//        System.out.printf("The max count of %d is %S",val,maxC);

    }
}
