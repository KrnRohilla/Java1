//make a function to multiply 2 number and return the product
import java.util.Scanner;
public class functions3 {
    public static int calcuateproduct(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(a*b);
    }
}

