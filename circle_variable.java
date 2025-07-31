import java.util.Scanner;

public class circle_variable {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     
    System.out.println("enter the radius"); 
    int radius =sc.nextInt();//taking input

    //area of circle
   float pie = 3.14f;
   float area=(2*pie*(radius*radius));
   System.out.println(area);
    }
}
