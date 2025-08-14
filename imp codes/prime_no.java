import java.util.Scanner;
public class prime_no{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int number =sc.nextInt();
    int flag = 0;

        if (number <= 1) flag = 1; // 0, 1, negative => not prime
          for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = 1;
                break;
            }
        }
   if (flag == 0) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }

        sc.close(); // scanner band karna best practice
    }
}
    