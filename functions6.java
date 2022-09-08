// write a function to print the sum of all odd numbers from 1 to n ?
import java.util.Scanner;
public class functions6 {
    public static void SumOfAllOddNumbers(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        SumOfAllOddNumbers(n);
    }
}