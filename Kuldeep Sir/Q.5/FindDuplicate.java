import java.util.*;

public class FindDuplicate{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str=sc.nextLine();
        printDetails(str);
    }

    static void printDetails(String str){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                //skip
            }
            else{
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }
    }
        char myChar='\0';
        int sequenceCount=0;
        for(Map.Entry<Character, Integer> mapElement : map.entrySet()){
            System.out.println(mapElement.getKey()+", count = "+ mapElement.getValue());
            if(sequenceCount<mapElement.getValue()){
                sequenceCount=mapElement.getValue();
                myChar=mapElement.getKey();
            }
        }
        System.out.println(myChar+","+sequenceCount);
    }
}