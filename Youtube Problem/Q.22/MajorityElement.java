/*
 * Find out the Majority element of Array .
 * if a Elements appeared 2times or more than 2times then this call as majority element..
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,3,7,2,5,0,0,5,2));
       ArrayList<Integer> result=majorityEle(list);
       for(int i=0;i<result.size();i++){
        System.out.println(result.get(i));
       }
    }
    static ArrayList<Integer> majorityEle(ArrayList<Integer> list){
        ArrayList result=new ArrayList<>();
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<list.size();i++){
            if(hash.containsKey(list.get(i))){
                hash.put(list.get(i),hash.get(list.get(i))+1);
            }
            else{
                hash.put(list.get(i),1);
            }
        }
        for(HashMap.Entry<Integer,Integer> hashElement : hash.entrySet()){
            if(hashElement.getValue()>=2){
                result.add(hashElement.getKey());
            }
        }
        return result;
    }
}
