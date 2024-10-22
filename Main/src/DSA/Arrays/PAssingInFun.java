package DSA;

import java.util.*;
//
public class PAssingInFun {
    public static void main(String[] args) {
        int[] nums = {4,5,8,6};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=99;
    }

}
