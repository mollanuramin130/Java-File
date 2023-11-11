import java.util.*;
class Constractor{
	int num1,num2;
	Constractor(int a,int b){
	num1=a;
	num2=b;
	}
	
	void show_details(){
	System.out.println("Your sum is : "+(num1+num2));
	}
}

public class Constractor_call{
	public static void main (String args[]){
	Scanner sc = new Scanner (System.in);
	int x,y;
	System.out.println("Enter your first number : ");
	x=sc.nextInt();
	System.out.println("Enter your Second number : ");
	y=sc.nextInt();
	Constractor s= new Constractor(x,y);
	s.show_details();
	}
}