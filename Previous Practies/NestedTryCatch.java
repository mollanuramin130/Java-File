public class NestedTryCatch {
    public static void main(String [] args){
        try{
            //outer try block
            try{
                //inner try block
                System.out.println("Going to divided number by 0(Zero)");
                int b= 30/0;
            }
            catch(ArithmeticException ae){
                System.out.println(ae);
            }
            try{
                //2nd inner try
                int a[]=new int[5];
                a[5]=4;
            }
            catch(ArrayIndexOutOfBoundsException ai){
                System.out.println(ai);
            }
            System.out.println("Rest of the code");
        }
        catch(Exception e){
            //catch block of outer try
            System.out.println("Handle the Exception of outer try ");
        }
        System.out.println("Normal flow");
    }
}
