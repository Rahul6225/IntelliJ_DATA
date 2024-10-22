package DSA;

//Search in Arrays

import java.util.Arrays;

public class LinearSearchAlgo {
    public static void main(String[] args) {
//        int[] arr = {2,5,8,45,67,34,-8,34};
//        int target = 100;
//        int ans = LinearSearch(arr,target);
//        System.out.println(ans);


//        // Search in Strings
//        String name = "Rahul";
//        char target = 'R';
//        System.out.println(SearchinString(name,target));
//    }
//    static boolean SearchinString(String name,char target){
//        if(name.length()==0){
//            return false;
//        }
//        for(char ch : name.toCharArray()){
//            if(ch == target){
//                return true;
//            }
//        }
//        return false;
//    }
//    static boolean SearchinString(String name,char target){
//        for(int i=0;i<name.length();i++){
//            if(target==name.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }
//    static int LinearSearch(int[] arr,int target){
//        if(arr.length==0){
//            return -1;
//        }
//        for(int i=0;i<arr.length;i++){
////            int element = arr[i];
//            if(arr[i]==target){
//                return i;
//            }
//        }
//        return -1;
//
//        int[] arr = {25,58,96,2,63};
//        Findmin(arr);
        int[][] arr = {
                {45,96,85,12},
                {45,9,99},
                {1,8,9,6,4,8}
        };
        int[] res = SearchIn2d(arr,0);
        System.out.println(Arrays.toString(res));
    }
    static int[] SearchIn2d(int [][] arr,int target){
        for(int i = 0;i < arr.length; i++){
            for(int col = 0; col<arr[i].length;col++){
                int element = arr[i][col];
                if(element==target){
                    return new int[]{i,col};
                }
            }
        }
        return new int[]{-1,-1};

    }
//    static void Findmin(int [] arr){
//        int min = arr[0];
//        if(arr.length==0){
//            System.out.println("-1");
//        }
//        for(int i =0 ; i< arr.length;i++){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println(min);
//
//    }

}
