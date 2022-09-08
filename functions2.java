// Make a function to add 2 numbers and return the sum
import java.util.Scanner;
public class functions2 {
    public static int calcuateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int sum = calcuateSum(a, b);
        System.out.println(sum);
    }
}
