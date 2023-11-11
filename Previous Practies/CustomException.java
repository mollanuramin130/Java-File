import java.util.Scanner;

class CustomExceptionCreate extends RuntimeException {
    CustomExceptionCreate(String msg){
        super(msg);
    }
}
public class CustomException{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age");
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new CustomExceptionCreate("You are not Eligable for vote");
            }
            else{
                System.out.println("you are Eligable for vote");
            }
        }
        catch(CustomExceptionCreate e){
            System.out.println(e);
        }
    }
}