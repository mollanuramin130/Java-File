/*
 * the given string are Panagram or not?
 * Panagram means if the given string contain all the alphabet then it will be Panagram 
 */

public class Panagram {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog";
        String str2="My Name Is Nur Amin Molla";
        String arr[]={str,str2};
        for(int i=0;i<2;i++){
            Boolean result=isPanagram(arr[i]);
            System.out.println(arr[i]+"is Panagram? \nAnswer : "+result);
        }
    }
    static Boolean isPanagram(String arr){
        String str=arr.toLowerCase();
        if(str.length()<26){
            return false;
        }
        else{
            for(char i='a';i<='z';i++){
                if(str.indexOf(i)<0){
                    return false;
                }
            }
        }
        return true;
    }
}
