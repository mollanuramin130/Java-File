import java.util.Scanner;
public class ReverseWords2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str=sc.nextLine();
        //System.out.println(str);
        String []str2=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word :str2){
            if(word.length()<=2){
                result.append(word).append(" ");
            }
            else{
                StringBuilder rev=new StringBuilder();
                for(int i=word.length()-1;i>=0;i--){
                    rev.append(word.charAt(i));
                }
                result.append(rev.toString()).append(" ");
            }
        }
        String finalStr=result.toString().trim();
        System.out.println(finalStr);
    }
}
