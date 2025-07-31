import java.util.Scanner;

public class typecassting {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter the number 1"); 
    int num1 =sc.nextInt();//taking input
    System.out.println("enter the number 2");
    int num2=sc.nextInt();//taking input 
    System.out.println("bfore swapping vales are  "+num1+" "+num2);
	int swap=num1;
    num1=num2;
	num2=swap;
	System.out.println("After swapping vales are  "+num1+" "+num2);

}
}
