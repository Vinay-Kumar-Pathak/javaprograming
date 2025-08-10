import java.util.Scanner;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int originalNum = num;

        int lastDigit = num % 10;
        while (num >= 10) {
            num = num / 10;
        }
        int firstDigit = num;

        int sum = firstDigit + lastDigit;
        System.out.println();
    }
}
