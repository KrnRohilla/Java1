// Write a program to print Fibonacci series of n terms where n is input by user: 
//0 1 1 2 3 5 8 13 21 .....  In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it. (BONUS)
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a =0;
        System.out.println(a);
        int b =1;
        System.out.println(b);
        for(int i=2;i<n;i++){
            int c =a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
