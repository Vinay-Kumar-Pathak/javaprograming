import java.util.Scanner;

public class multipication_digits {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int number = sc.nextInt();
  int multiple = 1;
  int temp = number;
while(temp>0){
    int digit = temp%10;
    multiple*=digit;
    temp/=10;
} 
System.out.println(multiple);
}   
}