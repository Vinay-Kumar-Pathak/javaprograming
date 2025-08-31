import java.util.*;
public class javabasicsoperation {
    public static void Operations(int num1,int num2){
        System.out.println("add: "+ (num1+num2));
        System.out.println("sub: "+ (num1-num2));
        System.out.println("multiply: "+ (num1*num2));
        System.out.println("divide: "+ ( num1/num2));
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter num1: ");
        int num1=sc.nextInt();
        System.out.println("Enter num2: ");
        int num2=sc.nextInt();
        Operations(num1,num2);

    }
}