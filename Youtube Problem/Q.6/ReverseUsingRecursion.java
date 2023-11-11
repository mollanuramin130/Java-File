public class ReverseUsingRecursion {
    public static void main(String[] args) {
        String str="My name is Nur Amin Molla";
        System.out.println(recursiveString(str));
       
    }
    static int count=0;
    static String recursiveString(String str){
        
        if(str.length()<=1){
            return str;
        }
       
        return recursiveString(str.substring(1))+ str.charAt(0);
    }
}
