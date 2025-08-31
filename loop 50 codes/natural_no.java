import java.util.Scanner;
public class natural_no{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number= sc.nextInt();
       /* int i=1;
        while( i<=number){
        System.out.println(i);
         i++;
        }*/
        //printing natural no in reverse order
        int i =number;
        while(i>=1){
            System.out.println(i);
            i--;
        }
    }
}