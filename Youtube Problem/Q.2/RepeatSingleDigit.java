public class RepeatSingleDigit {
    public static void main(String[] args) {
        int startRange=1;
        int endRange=20;
        int digit=1; //find the number 1 how many times repeat in this range.
        int totalDigit=0;
        for(int i=startRange;i<=endRange;i++){
            int result=digitCount(i,digit);
            totalDigit+=result;
        }
        System.out.println("Total Digit of "+digit+" repeat in this range be: "+totalDigit);
    }
    static int digitCount(int i,int digit){
        int count =0;
        int temp=i;
        while(temp>0){
            int rem=temp%10;
            if(rem==digit){
                count++;
            }
            temp/=10;
        }
        return count;
    }
}
