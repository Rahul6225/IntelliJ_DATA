package DSA.SortAlgo;

import java.util.Arrays;
    
public class CyclicSort {
    public static void main(String[] args) {
        //When Number given in the Range (1,N) => USe Cyclic Sort

        int[] arr = {1,5,2,3,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
