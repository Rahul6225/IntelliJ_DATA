package DSA;

import java.util.Arrays;

public class BinarySearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}
                , {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 16;
        int n = arr.length;
        int m = arr[0].length;

        int s = 0;
        int e = m * n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int row = mid / n;
            int col = mid % n;
            if (arr[row][col] < target) {
                s = mid+1;
            } else if (arr[row][col] > target) {
                e = mid - 1;
            } else {
                System.out.println(true);

            }
        }
        System.out.println(false);
    }

}


    // Searching in 2D MAtrix

//    public static void main(String[] args) {
//        int[][] arr = {{10,20,30}
//                      ,{12,27,35},
//                       {19,39,48}
//        };
//        int target = 27;
//        System.out.println(Arrays.toString(Search(arr,target)));
//
//
//    }
//    static int[] Search(int[][] matrix,int target){
//        int r = 0;
//        int c = matrix.length-1;
//        while(r< matrix.length && c >=0){
//            if(matrix[r][c]==target){
//                return new int[]{r,c};
//            }
//            else if(matrix[r][c]>target){
//                c--;
//            }
//            else{
//                r++;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//}
