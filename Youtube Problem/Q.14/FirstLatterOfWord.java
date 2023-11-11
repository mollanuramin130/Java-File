/*
 * Print the first latter of every word of the string .
 */
import java.util.ArrayList;

public class FirstLatterOfWord {
    public static void main(String[] args) {
        String str="My name is Nur Amin Molla";
        ArrayList result=new ArrayList<>();
        String words[]=str.split(" ");
        for(String word :words){
            result.add(word.charAt(0));
        }
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }
    }
}
