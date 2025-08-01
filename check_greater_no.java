import java.util.Scanner;

public class check_greater_no {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
     
    System.out.println("enter the number 1"); 
    int num1 =sc.nextInt();//taking input
    System.out.println("enter the number 2");
    int num2=sc.nextInt();//taking input 
     if (num % 2 != 0) {
            System.out.println(num + " is odd");
        } else {
            System.out.println(num + " is even");
        }

    }
}
