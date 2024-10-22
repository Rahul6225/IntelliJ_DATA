package DSA.Recursion;

public class Level_1 {
    public static void main(String[] args) {
//        int m = 5;
//        num(m);
//        numRev(m);
//        System.out.println(Fact(m));
//        System.out.println(Sumnto1(m));
//        System.out.println(SumofDigits(44));sout
//        System.out.println(MultiplyofDigits(505));
        System.out.println(PassingNum(5));

    }
    public static int PassingNum(int n){
        if(n==1){
            return 1;
        }
        System.out.println(n);
        return PassingNum(--n);    // n-- => pass value first then it decreases
        // --n => decrease first then pass
    }
    public static int MultiplyofDigits(int n){
        if(n==0){
            return 1;
        }
        return n%10*MultiplyofDigits(n/10);
    }
    public static int SumofDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+SumofDigits(n/10);
    }
    public static int Sumnto1(int n){
        if(n==1){
            return n;
        }
        return n+Sumnto1(n-1);
    }
    public static int Fact(int n){
        if(n==1){
            return 1;
        }
        return n*Fact(n-1);
    }

    public static void num(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        num(n-1);
    }
    public static void numRev(int n){
        if(n==0){
            return;
        }
        numRev(n-1);
        System.out.println(n);
    }

}
