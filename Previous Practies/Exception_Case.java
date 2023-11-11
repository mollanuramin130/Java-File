public class Exception_Case {
    public static void main(String [] args){
    int arr[]=new int[5];
    arr[4]=10;
    try{
      //  arr[6]=10;
        int c=30/0;
    }
    catch(ArithmeticException a){
        System.out.println("Arithmetic Exception occurs");
        System.out.println(a);
    }
    catch(ArrayIndexOutOfBoundsException b){
        System.out.println("Its is Array Index out of Bound");
        System.out.println(b);
    }
}
}
