import java.util.Scanner;

public class array_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Size input lena
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Array input lena
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse print
        System.out.println("Array in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
