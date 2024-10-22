package DSA.OOPS.Strings;
import java.util.*;
public class StringBuILDER {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Rahul singh");
        str.reverse();
        System.out.println(str);
        str.delete(0,4);
        System.out.println(str);

    }
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = {n};
//        for(int i=0;i<=n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//    }

//    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("Hello");
//        str.append(" World");
//        str.append('c');
//        str.setCharAt(2,'u');
//        str.append(67.7f);
//        str.setCharAt(0,'M');
//        str.insert(2,'r'); //Insert means to add something at particluar indx
////        System.out.println(str.isEmpty());
//        str.indexOf("world");
////        System.out.println( str.substring(2));
//        str.append(10);
//        System.out.println(str);
//        str.deleteCharAt(0);
//        System.out.println(str);
//
//    }
}
