import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // Number input

        // Check even or odd
        if (num % 2 != 0) {
            System.out.println(num + " is odd");
        } else {
            System.out.println(num + " is even");
        }
    }
}

