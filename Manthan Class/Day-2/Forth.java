import java.util.*;

public class Forth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number :");
        int num=sc.nextInt();
        int[] arr=new int[num+2];
        int first=1,second=1;
        for(int i=1;i<num+2;i=i+2){
         System.out.print(first+"  "+second+"  ");
            arr[i-1]=first;
            arr[i]=second;
            first=first*2;
            second=second*3;
        }
        System.out.println("\n"+arr[num-1]);
    }
}
