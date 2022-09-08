// Find the maximum & minimum number in an array of integers ?
package Arrays;
import java.util.Scanner;
public class array5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int numbers[]= new int[size];
        for(int i=0;i<size;i++){
            numbers[i] = scn.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("largest numbers is :"+max);
        System.out.println("smallest number is :"+min);
    }
}
