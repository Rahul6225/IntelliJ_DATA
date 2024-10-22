import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
//        int n = 5;
////        int i;
//        for( int i=1;i<=n;i++){
//            for( int j=1;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number:");

//        int n = input.nextInt();
        int n = 6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
//            System.out.println();
            for(int k = 1;k<=i;k++){
                System.out.print(" "+k);
            }
            System.out.println(" ");
        }

    }
}
