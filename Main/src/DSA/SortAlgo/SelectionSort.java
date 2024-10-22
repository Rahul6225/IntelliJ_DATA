package DSA.SortAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] arr = {-1,-45678,0,9,65,3,245,23};
        int[] arr = {3,9,8,7,6,4,5,6,7,8,9,8,7};
        SelecSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SelecSort(int[] mat){
        for(int i=0;i<mat.length;i++){
            int last = mat.length-i-1;
            int MaxIndex = GetMaxIndex(mat,0,last);

            swap(mat,MaxIndex,last);
        }
    }
    static int GetMaxIndex(int[] matrix,int start,int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(matrix[i]>matrix[max]){
                max = i;
            }
        }
        return max;
    }
    static void  swap(int[] arr ,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
