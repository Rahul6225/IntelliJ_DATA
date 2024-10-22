package DSA.OOPS.QuestionsST2;
import java.util.*;

public class OccurencesOfPalindrome {
    public static int IsPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        // Checking if the word is a palindrome
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return 0; // Not a palindrome
            }
            i++;
            j--;
        }
        return 1; // It's a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int palindromeCount = 0;

        // Iterating over each word to check if it's a palindrome
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            palindromeCount += IsPalindrome(word);
        }

        System.out.println("Total number of palindromes: " + palindromeCount);

        // Close the scanner to avoid resource leak
//        sc.close();
    }
}
