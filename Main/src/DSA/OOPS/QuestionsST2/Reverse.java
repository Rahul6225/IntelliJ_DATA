package DSA.OOPS.QuestionsST2;

import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        int i=0;
        int j=s1.length()-1;
        boolean flag = true;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

//        StringBuilder str = new StringBuilder(s1);
//        str.reverse();
//        String original = str +"";
//        if(original.equals(str)){
//            System.out.println("Yes its palindromw");
//        }
//        else{
//            System.out.println("No");
//        }
    }


}
