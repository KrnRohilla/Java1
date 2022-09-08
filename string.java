import java.util.Scanner;
public class string {
    public static void main(String[] args) {
       
        String str ="hakme";
        int frq[]=new int [26];
        for(char c: str.toCharArray()){
            frq[c-97]++;
            
        }
        for(int i=0;i<frq.length;i++){
            System.out.print(frq[i]+"");
        }
    }
}