// take a matrix as input form the user .search for a given number x and print the indices at which it occurs?
package Arrays;
import java.util.Scanner;
public class array2d2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int columns = scn.nextInt();
        int[][] numbers = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j] = scn.nextInt();
            }
        }
        int x = scn.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                 if(numbers[i][j] ==x){
                    System.out.println("x found at location("+ i +", "+ j +")");
                 }
            }
        }
    }
}
