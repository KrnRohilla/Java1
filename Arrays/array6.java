// Take an array of numbers as input and check if it is an array sorted in ascending order.
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//{3, 4, 6, 2} is not sorted in ascending order.
package Arrays;
import java.util.Scanner;
public class array6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int numbers[] = new int[size];
        for(int i=0;i<size;i++){
            numbers[i] = scn.nextInt();
        }

        int count = 0;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                count++;
                break;
            }
        }

        if(count>0){
            System.out.println("Not sorted");
        }
        else{
            System.out.println("sorted");
        }
    }
}
