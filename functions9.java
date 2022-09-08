// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.Scanner;
public class functions9 {
    public static boolean  eligibleOrNot(int age){
        if(age>18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        eligibleOrNot(age);
        System.out.println(eligibleOrNot(age));
    }
}
