import java.util.*;
public class MaximumDifferent {
    public static void main(String[] args) {
        int []arr={20,-1,52,-6,0,2,100,25,-75};
        int result=maximumDifferent(arr);
     
        System.out.println("Maximum Different be : "+result);
        
    }
    static int maximumDifferent(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1]-arr[0];
    }
}
