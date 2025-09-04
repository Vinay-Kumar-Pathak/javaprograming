import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] frequency =new int[10];

        int temp=number;
        while(temp>0){
            int digit=temp%10;
           frequency[digit]+=digit;
           temp/=10;
        }
        int i;
        for(i=0;i<10;i++){
            if(frequency[i]>0){
                System.out.println(frequency[i]);
            }
        }
    }
}
