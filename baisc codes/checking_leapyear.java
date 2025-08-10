import java.util.Scanner;

public class checking_leapyear {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     
    System.out.println("enter the year"); 
    int year =sc.nextInt();//taking input

     if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year+ " is the leap year");
        } else {
            System.out.println(year + " is the not a leap year");
        }
    }
    
}
