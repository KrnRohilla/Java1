// Take an array of names as input from the user and print them on the screen ?
package Arrays;
import java.util.Scanner;
public class array4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         int size = scn.nextInt();
         String name[] = new String[size];
         for(int i=0;i<size;i++){
            name[i] = scn.next();    
         }
         for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
         }
    }
}
