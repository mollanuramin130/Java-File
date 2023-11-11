import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        String str="Bananakdas";
        HashMap<Character, Integer> hash=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(hash.containsKey(str.charAt(i))){
                hash.put(str.charAt(i), hash.get(str.charAt(i))+1);
            }
            else{
                hash.put(str.charAt(i), 1);
            }
        }
        for(HashMap.Entry<Character,Integer> hashElement : hash.entrySet()){
            System.out.println(hashElement.getKey()+": "+hashElement.getValue());
        }
       // System.out.println(hash.keySet()+" "+ hash.values());
       List<HashMap.Entry<Character,Integer>> entryList=new ArrayList<>(hash.entrySet());
    }
}
