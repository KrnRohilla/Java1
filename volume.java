// 30 47
//69 30
import java.util.Scanner;
public class volume {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int x = scn.nextInt();
            int y = scn.nextInt();
            if(x>y){
                System.out.println(x-y);
            }
            else{
                System.out.println(y-x);
            }
        }
    }

