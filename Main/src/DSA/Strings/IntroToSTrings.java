package DSA.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class IntroToSTrings {
    public static void main(String[] args) {
        System.out.printf("Hello there my name is %S and we all are %S here","Rahul","Present");

    }
}
//        String a = "Rahul";
//        String b  = "Rahul";
//        System.out.println(a);
//        System.out.println(b);
//        String name1 = new String("Rahul");
//        String name2 = new String("Rahul");
//        System.out.println(name1 == name2);
//
//        //If We wants to check only values
//
//        System.out.println(name1.equals(name2)); //this will return true
//
//        //  if we want to access the character from the Strings
//        //[String name].charAt(0);
//        System.out.println(name1.charAt(2));
//
//        float n = 234.654f;
//        System.out.printf("Formatted Number%.2f", n); //to get upto decimal number after point ex .2f
//        System.out.println();
//        System.out.print(n);
//        System.out.println();
//        System.out.printf("The value of pi:", Math.PI);
//        System.out.println();
////        System.out.println();
//
//        System.out.printf("Formated value of pi %.2f", Math.PI);
//        System.out.println();
//        System.out.printf("My Name is %s and my sirname is %s","Rahul","Singh"); //imp.......
//        System.out.println();
//
//        ///OPERATORSS
//
//        System.out.println('a'+'b'); //ASCAII Value
//        System.out.println("a"+"b");
//        System.out.println("a"+1);
//        System.out.println((char)('a'+3));
//        System.out.println("Rahul" + new ArrayList<>());
////        System.out.println(new Integer(56) + new ArrayList<>()); //Atleast One segment should be string to run this
//        //spo we will do
//        String Ans = new Integer(56) + "" + new ArrayList<>();
//        System.out.println(Ans);
//
//        // STRING PERFOMANCE
//
//        String Series = "";
//        for(int i = 0;i < 26;i++){
//            char ch = (char)('A'+ i);
////            System.out.print(ch);
//            Series = Series + ch;
//        }
//
//        System.out.println(Series);

        //STRING BUILDER
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            char ch = (char)('a'+i);
//            builder.append(ch);
//        }
//        System.out.println(builder);
//        System.out.println(builder.toString()); ///print
//
//        // METHODS CLASSS
//
//        String Name = "Rahul singh";
//        System.out.println(Arrays.toString(Name.toCharArray()));
//        System.out.println(Name.toLowerCase());
//        System.out.println(Name);
//        System.out.println(Name.indexOf('l'));

//        String  str = "abcba";
//        String  arr = Arrays.toString(str.toCharArray());
//        int s = 0;
//        int e = arr.length()-1;
//
//        while(s<=e){
//            if(arr[s]==arr[e]){                      //WRONGGGGGGGGGGGGGGG
//
//                s++;
//                e--;
//            }
//            else{
//                System.out.println("Not a Palindrome");
//            }
//        }
//        System.out.println("Yes");

//        PALINDRONE STRINGS
//        String str = "";
//        System.out.println(Palindrome(str));


//    }
//    static boolean Palindrome(String str){
//        if(str == null || str.length()==0){
//            return true;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            char start = str.charAt(i);
//            char end = str.charAt(str.length()-1-i);
//            if(start!=end){
//                return false;
//            }
//        }
//        return true;
//    }

//}