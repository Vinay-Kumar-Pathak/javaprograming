import java.util.Scanner;
public class principle_intrest {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Principal (P): ");

    float principal = sc.nextFloat();
    System.out.print("Enter Rate of Interest (R): ");

    float rate = sc.nextFloat();
    System.out.print("Enter Time in years (T): ");

    float time = sc.nextFloat();
    float si = (principal * rate * time) / 100;
    
    System.out.println("Simple Interest = " + si);
    sc.close();
    }
}
