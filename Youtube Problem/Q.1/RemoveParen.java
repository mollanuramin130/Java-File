public class RemoveParen {
    public static void main(String[] args) {
        String str="))(()())(())()("; //output be str= "()()()()";
        String result=removeStr(str);
        System.out.println(result);

    }
    static String removeStr(String str){
        String result="";
        String tempStr="0"+str+"0";
        for(int i=0;i<tempStr.length();i++){
            if(tempStr.charAt(i)=='(' && tempStr.charAt(i+1)==')'){
                result=result+tempStr.charAt(i);
            }
            else if(tempStr.charAt(i)==')' && tempStr.charAt(i-1)=='('){
                result=result+tempStr.charAt(i);
            }
        }
        return result;
    }
}
