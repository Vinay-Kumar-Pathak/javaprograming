import java.util.Scanner;

public class counting_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int count = 0;
        int digit = number;
        while(digit !=0){
            digit/=10;
            count++;
        }
        System.out.println(count);
    }
}
