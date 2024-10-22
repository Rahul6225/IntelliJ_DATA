package DSA.OOPS.EndTerm;
import java.util.*;
public class Sort {
    public static void main(String[] args) {
        int[] arr = {23,45,78,99,88,12,23};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            System.out.println("gopa\t56 is\n");
        }

//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>arr[i+1]){
//                int temp=arr[i];
//                arr[i]=arr[i+1];
//                arr[i+1]=temp;
//            }
//            i--;
//            System.out.println(arr[i]);
//        }




    }
}
