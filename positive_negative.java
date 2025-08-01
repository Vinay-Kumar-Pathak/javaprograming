import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    System.out.println("enter the number 1"); 
    int num1 =sc.nextInt();//taking input

    if (num1 > 0) {
            System.out.println("The number is positive.");
        } else if (num1 < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    
}
