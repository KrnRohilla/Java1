// Enter 3 number from user & make a functions to print their average?
import java.util.Scanner;
public class functions5 {
    public static int ptintTheirAverage(int a, int b, int c){
        int average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        
        int average = ptintTheirAverage(a, b, c);
        System.out.println(average);
    }
}

