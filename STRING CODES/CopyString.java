import java.util.Scanner;

public class CopyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String copy = original;

        System.out.println("Original String: " + original);
        System.out.println("Copied String: " + copy);
    }
}
