import java.util.Scanner;

public class even_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i =1;
        /*while(i<=number){ //even no printing 
            if(i%2==0){
            System.out.println( i); 
            }
            i++;    
        }*/
     //odd no printing
    while(i<=number){
        if(i%2 !=0){
            System.out.println(i);
        }
        i++;
    }
    }
}
