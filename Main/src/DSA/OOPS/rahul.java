package DSA.OOPS;

public class rahul {
    public static void main(String[] args) {
        String s = "konnichiwa vir";
        String[] words = s.split(" ");

        // Capitalize the first letter
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(sb); // Output: "Hello world"

    }
}
