package DSA.OOPS.QuestionsST2;
import java.util.*;
public class ToggleCharInStrings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);

        for(int i = 0;i<str.length();i++){
            boolean flag = true; //Capital
            char ch = str.charAt(i);
            if(ch==' ') continue;
            int ascii = (int)ch;
            if(ascii>=97) flag=false; //Small
            if(flag==true){
                ascii += 32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
            else{
                ascii -=32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);

    }
}
