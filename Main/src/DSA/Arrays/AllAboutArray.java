import java.util.Arrays;
import java.util.Scanner;

//package DSA;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//


//    public static void main(String[] args) {
//        //syntax for Array
//        //Arrays are mutable in Java whereas Strings are not mutable in Java
//
//        ///Arrays Of Primitives
//
//        //dataType[] Variable_name = new DataType[size]
////        int[] rnos = new int[5];
////        // or Directly
////        int [] nos2 = {23,12,34};
////        for(int i = 0;i<nos2.length;i++){
////            System.out.print(nos2[i]);
////            System.out.print(" ");
////        }
//
////        int[] ros //Array Declaration,ros is getting  defined in the stack
////        ros = new int[5] //Actually Object is created in the heap Memory
//        //new keyword is used to  create an object in the heap memory
//
//        //Dyanamic Memory Allocation == Memory is created During runtime
//
////        Scanner in = new Scanner(System.in);
////        int[] nums = new int[n];
////        for(int i = 0 ; i < nums.length;i++){
////            nums[i]= in.nextInt();
////        }
////        System.out.println(Arrays.toString(nums));
////        for(int i = 0;i<nums.length;i++){
////            System.out.print(nums[i]+" ");
////        }
//        //shortcut way to print out the array
//
//
//        //Array Non-Primitive
////        String[] str = new String[5];
////        for(int i=0; i<str.length;i++){
////            str[i] = in.next();
////        }
////        System.out.println(Arrays.toStringh(str));
////        for(int i=0; i<str.length;i++){
////            System.out.println(str[i]+" ");
////        }
//
////        int[][] arr = new int[3][3];
////        for(int i = 0;i<arr.length;i++) {
////            for (int j = 0; j < arr[i].length; j++) {
////                arr[i][j] = in.nextInt();
////            }
////        }
////        for(int i = 0;i<arr.length;i++) {
////            for (int j = 0; j < arr[i].length; j++) {
////                System.out.print(arr[i][j]+" ");
////            }
////            System.out.println();
////        }
////        for(int i=0;i<arr.length;i++){
////            System.out.println(Arrays.toString(arr[i]));
////        }
////        for (int[] ints : arr) {
////            System.out.println(Arrays.toString(ints));
////        }
//
//        //Array-List  //Its a kind of vectoirs in c++
//
////        Syntax
//
////        ArrayList<Integer> list = new ArrayList<>(5);
////        list.add(14);
////        list.add(1);
////        list.add(4);
////        list.add(5);
////        list.add(23);
////        list.add(58);
////
////        System.out.println(list);
////        System.out.println(list.contains(5));
////        System.out.println(list.set(0,52));
////        System.out.println(list);
////        list.remove(2);
////        System.out.println(list);
//
//        //Input Of List
//
////        for(int i=0;i<5;i++){ //jab array m 5 k 50% se zyada elemenmt pad jayegen toh vo apna size increase krlegi
////            list.add(in.nextInt());
////        }
////        for(int i=0;i<5;i++){
////            System.out.println(list.get(i));
////        }
//
//        //Multi-Arrray-List
////        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
////
////        //Input
////
////        for(int i=0;i<3;i++){
////            list.add(new ArrayList<>());
////        }
////        //add Element
////        for(int i=0;i<3;i++){
////            for(int j=0;j<3;j++){
////                list.get(i).add(in.nextInt());
////            }
////        }
////        System.out.println(list);
//        //swap indexe
//
//
//        //maximum items
////        int[] arr = {10,8,2,4};
////        int res = max(arr);
////        System.out.println(res);
////        int [] arr = {4,8,9,6,5};
//////        swap(arr,0,4);
////        reverse(arr);
////        System.out.println(Arrays.toString(arr));
////
//    }
////    static void reverse(int[] arr) {
////        int start = 0;
////        int end = arr.length - 1;
////        while (start < end) {
////            swap(arr, start, end);
////            start++;
////            end--;
////        }
//    }
////    static void swap(int[]arr,int index1,int index2){
////        int temp = arr[index1];
////        arr[index1] = arr[index2];
////        arr[index2] = temp;;
////    }
////    static int max(int[] arr){
////        int max = arr[0];
////        for(int i=0 ; i<arr.length;i++){
////            if(arr[i]>max){
////                max = arr[i];
////            }
////        }
////        return max;
//}
//public class AllAboutArray {
//    public static void main(String[] args) {
//        System.out.println("Bfore");
//        int a =4;
//        int b = 6;
//        System.out.println("after");
//        a=a+b;
//        b=a-b;
//
//        a = a-b;
//        System.out.println(a);
//
//
//    }
//
public class AllAboutArray {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt==2){
            System.out.println("it is a prime number");

        }
        else{
            System.out.println("Not");
        }
//        int [] arr = new int[n];
//        for(int i = 0;i<n;i++){
//            arr[i] = input.nextInt();
//        }
//        Arrays.sort(arr,2,4);
//        for(int i=n;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }

    }
}
