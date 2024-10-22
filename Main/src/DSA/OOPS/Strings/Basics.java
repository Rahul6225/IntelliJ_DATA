package DSA.OOPS.Strings;
import java.util.*;

public class Basics {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1==s2); //checks address first
        System.out.println(s1.equals(s3)); //checks the value of the Strings first
//                System.out.print(str.substring(i,j));
//                System.out.print(" ");
//            }
//        }
//        str = str.substring(0,2)+'y'+ str.substring(3);
//        System.out.println(str);
//        for(int i= 2;i<4;i++){
//            System.out.print(str.substring(i));
//        }

//        String s = "abc";
//        String c = "odc";
//        System.out.println(c.compareTo(s ));
//        System.out.println(s.contains("z"));
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(s.indexOf('a')); ///*****indexOf is opposite of charAt
//        System.out.println(s);
//        System.out.println(s.charAt(4));


//        String s = "Hello World";
//        StringTokenizer str = new StringTokenizer(s, ",");
//        while(str.hasMoreElements()){
//            System.out.println(str.nextToken());
//        }

    }
}
