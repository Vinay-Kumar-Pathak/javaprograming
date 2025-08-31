import java.util.Scanner;

public class sum_of_naturalno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
     int sum =0;
     int i=0;
   /*while(i<=number){// sum of natural no 
        sum+=i;
        i++;
    }
     System.out.println(sum);*/

    //sum of evem number
   /*  while(i<number){
        if(i%2==0){
          sum+=i; 
        }
        i++;
    }
    System.out.println(sum);*/

    //sum of odd number 
    while(i<=number){
        if(i%2 !=0){
            sum+=i;
        }
        i++;
    }
    System.out.println(sum);
    }
}
