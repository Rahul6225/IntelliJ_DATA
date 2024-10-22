public class Conversion {
    public static void main(String[] args) {
        DecimaltoBinary(444);
    }
    public static void DecimaltoBinary(int n){
        int rem = 0;
        int sum = 0;
        int multiplier = 1;
        while(n>0){
            rem = n%2;
            sum = sum + (rem * multiplier);
            n = n/2;
            multiplier = multiplier * 10;
        }
        System.out.println(sum);
    }
}
