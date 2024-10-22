package ADI_CW;
import java.util.*;
public class Lec_2 {
    public static void main(String[] args) {
        int arr[] ={12,11,13,3,5,6,7};
        HeapSort h1 = new HeapSort();
        h1.Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class HeapSort{
    void Sort(int arr[]){
        int n = arr.length;
        for(int i=n/2 -1;i<arr.length;i++){

        }
    }
    void heapify(int arr[],int idx,int len){
        int parent = idx;
        int left = parent*2 + 1;
        int right = parent*2 + 2;

        if(left<len && arr[parent]<arr[left]){
            parent=left;
        }
        if(right<len && arr[parent]< arr[right]){
            parent = right;
        }
        if(parent!=idx){
            int temp = arr[parent];
            arr[parent]=arr[idx];
            arr[idx]=temp;

            heapify(arr,parent,len);
        }
    }
}
