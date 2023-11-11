public class FirstLastDigitSum {
    public static void main(String[] args) {
        int number=68254545;
        int arr[]={1,2};       
        int sum=firstLastDigitSum(number,arr);
        System.out.println(sum);
        System.out.println(number);
        System.out.println(arr[0]);
    }
    static int firstLastDigitSum(int number,int []arr){
        int lastDigit=number%10;
        int firstDigit=number;
        number=number%10;
        arr[0]=200;
        arr[1]=500;
        while(firstDigit>=10){
            firstDigit=firstDigit/10;
        }
        return (firstDigit+lastDigit);
    }
}
