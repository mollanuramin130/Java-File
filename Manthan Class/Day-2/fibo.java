//package Java File.Manthan Class.Day-2;

public class fibo {
    public static void main(String[] args) {
        int num1=1;
        int num2=1;
        System.out.print(0+" "+num1+" ");
        for(int i=0;i<20;i++){
            System.out.print(num2+" ");
            int temp=num1;
            num1=num2;
            num2=temp+num2;
        }
    }
}
