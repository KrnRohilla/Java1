// print marks of subject ?
package Arrays;
import java.util.Scanner;
public class arrays1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] marks = new int[3];
        marks[0] = 67; //phy
        marks[1] =84; //che
        marks[2] =95; //eng
        //System.out.println(marks[0]);                 normal out put statement 
           // System.out.println(marks[1]);
           // System.out.println(marks[2]);
           for(int i=0;i<3;i++){                             // or we can do this ques using for loop
            System.out.println(marks[i]); 
           }
    }
}
