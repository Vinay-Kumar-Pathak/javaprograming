import java.util.Scanner;
public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        
       /*int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }*/
        int i=n;
         while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }

}
}
