import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int number=sc.nextInt();
            int reverse =0;
            int temp=number;
        while(temp>0){
            int digit=temp%10;
            reverse=reverse*10 + digit;
            temp/=10;

        }
        System.out.println(reverse);
    }
}
