public class NumberReversed {
    public static void main(String[] args) {
        double number=1.234;
        String strNum2=""+number; //method1 for Number to String Convert.
        String strNum=String.valueOf(number); //method2 for Number to String Convert.
        System.out.println(strNum.charAt(2));
        String result="";
        for(int i=strNum.length()-1;i>=0;i--){
            result+=strNum.charAt(i);
        }
        double reversed=Double.parseDouble(result);
        System.out.println(reversed);
    }
}
