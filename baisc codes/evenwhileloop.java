import java.util.Scanner;

public class evenwhileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        int i = 2;
        int sum = 0;

        while (i <= n) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);
}
}
