//package Java File.Manthan Class.Day-2;
import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number :");
        int num=sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Not Prime");
                break;
            }
            System.out.println("prime");
            break;
        }

    }
}
