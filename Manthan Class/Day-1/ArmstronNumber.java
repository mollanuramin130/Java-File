
public class ArmstronNumber {
    public static void main(String[] args) {
        int num=153;
        int temp=num;
        int rem;
        int sum=0;
        while(num!=0){
               rem=num%10;
               sum=sum+rem*rem*rem;
               num=num/10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("its arm");
        }
        else{
            System.out.println("not arm");
        }
    }
}
