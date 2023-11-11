/*
  Find out the intersection of two array.
 */

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionElements {
    public static void main(String[] args) {
        int arr[]={1,5,3,4,9,10};
        int arr2[]={5,9,2,0,6,4};
        ArrayList<Integer> result=intersection(arr,arr2);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }
    }
    static ArrayList<Integer> intersection(int arr[],int arr2[]){
        ArrayList<Integer> result=new ArrayList<>();
       HashSet<Integer> hash=new HashSet<>();
       for(int i=0;i<arr.length;i++){
        hash.add(arr[i]);
       }
       for(int i=0;i<arr2.length;i++){
        if(!hash.add(arr2[i])){
            result.add(arr2[i]);
        }
       }
        return result;
    }
}
