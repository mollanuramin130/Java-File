import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number :");
        int num=sc.nextInt();
        int a=2,b=3;
        System.out.print(1+" "+1+ " ");
        for(int i=1;i<num;i++){
            System.out.print(a*i + " " + b*i +" ");
        }
    }
}