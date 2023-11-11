import java.util.*;
public class StringArrSort {
    public static void main(String[] args) {
        String arr[]={"Mango","Apple","Orange","Banana"};
        String resultArr[]=sortArr(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(resultArr[i]);
        }
    }
    static String [] sortArr(String arr[]){
        Arrays.sort(arr);
        return arr;
    }
}
