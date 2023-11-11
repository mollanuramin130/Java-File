public class ScannerClass {
    public static void main(String[] args) {
        System.out.println("Enter your number :");
        java.util.Scanner ref =new java.util.Scanner(System.in);
        try{
            int a=ref.nextInt();
        System.out.println("Your number is "+a);
        }
        catch(ArithmeticException e){
            System.out.println("hi wrong");
        }
    }
    }