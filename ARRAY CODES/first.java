import java.util.Scanner;
public class first {
   
 /*void sum(int num1,int num2){
    System.out.println("sum=" + num1+num2);
 }
public static void main(String[] arg)
{
 int num1;
 int num2;

Scanner sc =new Scanner(System.in);
first x1=new first();
System.out.println("enter the number 1");
num1 =sc.nextInt();
System.out.println("enter the number 2");
num2=sc.nextInt();
x1.sum(num1,num2);
}
}*/
void area(float radius){
    float pie =3.14F;
    System.out.println("area of circle =" + pie*radius*radius);
}

public static void main(String[] arg)
{
 float radius;

Scanner sc =new Scanner(System.in);
first x1=new first();
System.out.println("enter the radius ");
radius =sc.nextFloat();
x1.area(radius);
}
}
