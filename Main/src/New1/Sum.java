package New1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = input.nextInt();
        System.out.print("Enter the Second number:");
        int b = input.nextInt();
        int Sum = a+b;


        System.out.println("The New1.Sum of the Given Number is "+ Sum);
    }
}
