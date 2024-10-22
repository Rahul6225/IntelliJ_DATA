//
//
//public class IntoToJava {
//    public static void main(String[] args) {
//
//        //Reverse an Array
//
//
//        int[] arr = {10,9,5,3,4,13,19,20,25,0};
//
//        swap();
////        int max= Integer.MIN_VALUE;
////        int index=0;
////        for(int i=0;i<arr.length;i++){
////            if(arr[i]>max){
////                max=arr[i];
////                index=i+1;
////            }
////        }
////        System.out.println(index);
////        System.out.println(max);
//
//
//
//
//
//
////        int[] arr = new int[5];
////        arr[0]=2;
////        arr[1]=5;
////        arr[2]=4;
////        arr[3]=7;  //
////        arr[4]=9;   //
////        System.out.println("Before Swapped:");
////        for (int j : arr) {
////            System.out.print(j + " ");
////        }
////        System.out.println();
////        int a = 3;
////        int b = 4;
////        arrayDemo(arr,a,b);
////        System.out.println("After Swapped:");
////
////        for (int j : arr) {
////            System.out.print(j + " ");
////        }
////
////    }
////
////    static void arrayDemo(int[] arr,int a,int b) {
////        int temp = arr[a];
////        arr[a]=arr[b];
////        arr[b]=temp;
//    }
//}
////        Scanner in = new Scanner(System.in);
////        System.out.print("Enter The 1st Number:");
////        int n1 = in.nextInt();
////        System.out.print("Enter The Second Number:");
////        int n2 = in.nextInt();
////        int divid;
////        int divisor;
////        if(n1>n2){
////            divid = n1;
////            divisor = n2;
////        }
////        else{
////            divid = n2;
////            divisor = n1;
////        }
////        int remainder = divid % divisor;
////        while(remainder!=0){
////            divid = divisor;
////            divisor = remainder;
////            remainder = divid % divisor;
//
//
////        System.out.println("The HCF for the given number is:"+divisor);
//        //Fibonacci NUmber
////        int n = 5;
////        int FirstVal = 0;
////        int SecondVal = 1;
////        int ThirdValue = 0;
////
////        for(int i = 1;i<=n;i++){
////
////            FirstVal = SecondVal;
////            SecondVal= ThirdValue;
////            ThirdValue = FirstVal + SecondVal;
////
////            System.out.print(" "+ThirdValue);
////
////        }
////        static int Fibonacci(int n){
////            if(n==0){
////                return 0;
////            }
////            if(n==1){
////                return 1;
////            }
////            else {
////                return Fibonacci(n - 2) + Fibonacci(n - 1);
////            }
////        }
//
//
//        // Reverse Number
//
//
////        int n = 17859;
////        System.out.println("The given number is:"+n);
////        while(n>0){
////            int rem = 0;
////            rem = n % 10;
////            int res = 0;
////            res = res * 10 + rem;
////            n/=10;
////            System.out.print(res);
////        }
//
////        System.out.print("Enter The Salary:");
////        Scanner input = new Scanner(System.in);
////        int Salary = input.nextInt();
////        if(Salary>10000){
////            Salary=Salary+2500;
////        }
////        else if(Salary==1000){
////            System.out.println("He is not an Emply");
////        }
////        else{
////            Salary=Salary+1000;
////        }
////        System.out.print("Salary with Bonus(included):");
////        System.out.println(Salary);
//
////        Scanner in = new Scanner(System.in);
////        int a = in.nextInt();
////        int b = in.nextInt();
////        int c = in.nextInt();
////
////        if (a>b && a>c){
////            System.out.println("a is Greater");
////        }
////        else if (c>b && c>a){
////            System.out.println("c is Greater");
////        }
////        else if (b>a && b>c){
////            System.out.println("b is Greater");
////
//
