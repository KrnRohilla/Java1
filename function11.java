// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.ArrayList;
import java.util.Scanner;
public class function11 {
    public static void main(String[] args) {
        int positive =0, negative =0, zero =0;
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        for(int i=0;i<input;i++){
            int x = scn.nextInt();
            if(x>0){
                positive++;
            }
            else if(x<0){
                negative++;
            }
            else if(x==0){
                zero++;
            }
        }
        System.out.println("Positive : " + positive);
        System.out.println("Negative : " + negative);
        System.out.println("Zero : " + zero);
    }
}
