//package Java File.Manthan Class;
import java.util.*;

public class ISBN_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number=sc.nextInt();
        int temp=number;
        int count=0,sum=0,rem;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        //System.out.println(count);
        if(count==10){
            for(int i=10;i>=1;i--){
                    rem=number%10;
                    sum=sum+rem*i;
                    number=number/10; 
            }
            // System.out.println(sum);
            if(sum%11==0){
                System.out.println("This number is Legal ISBN number");
            }
            else{
                System.out.println("This number is Illegal ISBN number");
            }

        }
        else{
            System.out.println("Enter 10 digid number only");
        }
    }
    
}
