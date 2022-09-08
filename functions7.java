// write a function which takes in 2 numbers and returns the greater of those two ?
import java.util.Scanner;
public class functions7 {
    public static int getGreater(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        getGreater(a, b);
        System.out.println(getGreater(a, b));
    }
}
