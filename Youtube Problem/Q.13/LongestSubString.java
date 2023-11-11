/*
 * logest subString find from the string without repeatation any character.
 */

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String str="abcdeadcfghdacijaklnomp"; //output be: "badcfgh";
        String result=longSubString(str);
        System.out.println(result);
    }
    static String longSubString(String str){
        String longestOverAll="";
        String longestTillNow="";
        HashSet hash=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(hash.contains(c)){
                int len=longestTillNow.length();
                longestTillNow="";
                hash.clear();
                i=i-len;
            }
            else{
                hash.add(c);
                longestTillNow+=c;
                if(longestTillNow.length()>longestOverAll.length()){
                    longestOverAll=longestTillNow;
                }
            }
        }
        return longestOverAll;

    }
}
