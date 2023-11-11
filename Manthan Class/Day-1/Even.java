import java.util.*;
 
public class Even{
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        for(int i=2;i<=num;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of the even number is: "+sum);
    }
}