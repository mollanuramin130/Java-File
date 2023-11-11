import java.util.*;

public class LengthOfWord{
    public static void main(String[] args) {
        String str="Hell Nur Amin Molla";
        String words[]=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word : words){
            result.append(word).append(": ").append(word.length()).append(" ");
        }
        System.out.println(result);
    }
}