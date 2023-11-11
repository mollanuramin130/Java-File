public class Multicatch {
    public static void main(String [] args){
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }

        catch(ArithmeticException ae){
            System.out.println("Arithmetic Expression occurs");
        }
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println("Array index out of bound occurs");
        }
        catch(Exception c){
            System.out.println("Parent Exception occurs");
        }
        System.out.println("Rest of the code ....");
        //System.out.println(a[5]);
    }
}
