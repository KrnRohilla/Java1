// Inverted Half Pyramid 180 deg rota
import java.util.Scanner;

public class patten5 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
