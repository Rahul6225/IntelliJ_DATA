package DSA.OOPS.QuestionsST2;

public class SwapFirst_LastChar {
    public static String swapLetter(String str){
        if(str.length()<=1){
            return str;
        }
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        String middle = str.substring(1,str.length()-1);
        String s2=last+middle+first;

        return s2;
    }
    public static void main(String[] args) {
        String original = "Rahul";
        String swapped = swapLetter(original);
        System.out.println("Original: " + original);
        System.out.println("Swapped: " + swapped);

    }
}
