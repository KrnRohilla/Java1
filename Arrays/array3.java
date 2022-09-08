// take an array as input from user. search for a given number x and print the index at which it occurs ?
package Arrays;
import java.util.Scanner;
public class array3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int numbers[] = new int[size];
        for(int i=0;i<size;i++)  {
            numbers[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == x){
                System.out.println("x found at index :" +i);
            }
        }
    }
}
