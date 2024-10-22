package DSA.Recursion;

public class Level_2_Arrays {
    public static void main(String[] args) {
        int[] arr = {2,8,5,8,9};

        System.out.println(Sorted(arr,0));
    }
    //check wheather Array is sorted or  not
    public static boolean Sorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && Sorted(arr,index+1);
    }
}
