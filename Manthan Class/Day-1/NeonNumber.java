//package Java File.Manthan Class;
import java.util.*;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Range");
        int range=sc.nextInt();
        int sum=0;
        int count=0;
        System.out.print("The neon number are : ");
        for(int i=0;i<=range;i++){
            int temp=i*i;
            while(temp!=0){
                int rem=temp%10;
                sum=sum+rem;
                temp=temp/10;
            }
            if(sum==i){
                System.out.print(i+" ");
                count++;
            }
            sum=0;
        }
        System.out.println("\n\nTotal number of Neon number between 0 to "+range+" is : "+count +"\n");
    }
}
