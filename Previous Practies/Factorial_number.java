import java.util.*;

public class Factorial_number {
    public static void main(String [] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter your numbers ");
    int n=sc.nextInt();
    int fact=1;
    if(n==0){
        System.out.println("Factorial value of "+n+" is: "+1);
    }
    // else if(n==1){
    //     System.out.println("Factorial value of "+n+" is:"+1);
    // }
    else if(n>=1){
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    System.out.println("Factorial value of "+n+" is: "+fact);
}
    else{
        System.out.println("Please enter a positive number ");
    }
}
}