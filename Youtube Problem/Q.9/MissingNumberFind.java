import java.util.HashSet;
import java.util.*;

public class MissingNumberFind {
    public static void main(String[] args) {
        int arr[]={4,7,1,0,10,6,5,3};
        int result[]=missingNumber(arr);
        for(int i=0;i<result.length-1;i++){
            System.out.print(result[i]+" ");
        }
    }  
    static int[] missingNumber(int arr[]){
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int min=arr[0];
        int result[]=new int[max-min-arr.length+2];
        int index=0;
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<arr.length-1;i++){
            hash.add(arr[i]);
        }
        for(int i=min;i<=max;i++){
            if(hash.add(i)){
                result[index]=i;
                index++;
            }
        }
        return result;
    }  
}
