import java.util.Scanner;
public class checkprime {
    public static void main(String[]args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=0;i<t;i++){
            int count =0;
            int n = scn.nextInt();
            for(int j=2;j<n;j++){
                if(n%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }
    }
}
