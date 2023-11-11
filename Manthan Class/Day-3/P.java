import java.util.*;
public class P {
    public static void main(String[] args) {
        int arr[]={2,1,5,7,-1,50};
        int max=arr[0];
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                index=i;
            }
        }
        System.out.println(index);
    }
}
