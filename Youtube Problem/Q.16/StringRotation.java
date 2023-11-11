public class StringRotation {
    public static void main(String[] args) {
        String str1="abbcd";
        String str2="bcdab";
        Boolean result=isRotation(str1,str2);
        System.out.println("String : "+str1+" & "+str2+" rotation each other :"+result);
    }
    static boolean isRotation(String str1,String str2){
        String tempStr=str1+str1;
        if(str1.length()==str2.length()){  //since rotation each other string length must be same..
        if(tempStr.contains(str2)){
            
            return true;
        }
    }
        return false;
    }
}
