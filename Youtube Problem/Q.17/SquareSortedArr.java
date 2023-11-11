import java.util.*;

public class SquareSortedArr {
    public static void main(String[] args) {
        int arr[]={-6,-5,1,2,7}; //output be : {1,4,25,36,49}
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=(int) Math.pow(arr[i], 2);
        }
        Arrays.sort(arr2);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
