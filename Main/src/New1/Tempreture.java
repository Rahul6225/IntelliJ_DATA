package New1;

import java.util.Scanner;

public class Tempreture {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the New1.Tempreture in c");
        float tempc = input.nextFloat();
        float Formula = (tempc * 9 / 5) + 32;
        System.out.println(Formula);
    }
}
