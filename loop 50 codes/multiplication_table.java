import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        int i=1;
        while(i<=10){
        System.out.println(number + " * " + i + " = " + number*i );
        i++;
        }
    }
}
