import java.util.Stack;
import java.util.*;

public class CheckWellFormString {
    public static void main(String[] args) {
        String str="[{(([]))}]";
        IsWellForm obj=new IsWellForm();
        boolean result=obj.isWellForm(str);
        if(result){
            System.out.println("String : "+str+" is wellform String.");
        }
        else{
            System.out.println("String : "+str+" is not wellform String.");
        }
    }
}

class IsWellForm{
    boolean isWellForm(String str){
        Stack stack=new Stack<>();
        String tempStr="0"+str+"0";
        for(int i=0;i<tempStr.length();i++){
            if(tempStr.charAt(i)=='[' || tempStr.charAt(i)=='{'||tempStr.charAt(i)=='(' ){
                stack.push(tempStr.charAt(i));
            }
            else if((tempStr.charAt(i)==']' && stack.peek().equals('[')) || (tempStr.charAt(i)=='}' && stack.peek().equals('{'))  ||  (tempStr.charAt(i)==')' && stack.peek().equals('('))){
              stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

