import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        String s="HELLO";
        Details obj2=new Details();
        Para obj=obj2.getDetails(s);
        System.out.println(obj.myChar);
        if(obj.count>=2){
            System.out.println(obj.count);
        }

    }
}
class Details{
    Para obj;
    Para getDetails(String s){
        obj=new Para();
        int len=s.length();
        HashSet idx=new HashSet<>();
        for(int i=0;i<len;i++){
            if(!(idx.add(s.charAt(i)))){
                obj.count++;
                obj.myChar=s.charAt(i);
            }
        }
        return obj;
    }
}
class Para{
    int count=1;
    char myChar;
}