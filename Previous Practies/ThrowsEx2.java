public class ThrowsEx2 {
    static void method1(int a,int b) throws ArithmeticException{
        int result=a/b;
        System.out.println("Result : "+result);
    }
    public static void main(String[] args) {
       try{ 
        method1(5,0);
       }
       catch(ArithmeticException e){
        System.out.println("number can not divided by zero");
       }
    }
}
