import java.util.Scanner;

public class rough {
    //here we will write method to print fibonacci series using recursion
    public static void printFibbo(int a, int b, int n ){
        //we will print the fibbonacci series till the nth term
        int count =0;
        count++;
        if (count==n){
            return;
        }
        System.out.println(a+b);
        printFibbo(b,b+a,n-1);
    }

    public static void main(String[] args) {
        //from the main function we will get the first two terms
       /* System.out.println("Enter the first two terms of fibonacci series");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();
        int n = 7;
        System.out.println(a);
        System.out.println(b);

        printFibbo(a, b, n-2);*/

        int[] arr = {3,4,58,7,1,6,0};
        System.out.println(arr.length);

    }
}
