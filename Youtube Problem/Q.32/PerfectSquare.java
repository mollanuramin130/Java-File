public class PerfectSquare {
    public static void main(String[] args) {
        int number=25;
        boolean result=isPerfectSquare(number);
     
        System.out.println("The number : "+number+" is perfect Square : "+result);
        
    }
    static boolean isPerfectSquare(int number){
        if(number<0){
            return false;
        }
        else{
            int sqrt=(int) Math.sqrt(number);
            return (sqrt*sqrt==number);
        }
    }

}
