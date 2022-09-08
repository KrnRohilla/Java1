// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS) ?
import java.util.Scanner;
public class functions12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        while(a1 != a2){
            if(a1>a2){
                a1 = a1-a2;
            }
            else{
                a2 = a2-a1;
            }
        }
        System.out.println("GCD is :"+ a2);
    }
}
