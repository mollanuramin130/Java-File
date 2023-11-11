import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={10,12,5,4,7,6,2,20}; //if input:10 output:12, input:5 output:7, input:7 output:20 if element not find then return -1;
        int input=5;
        int result=greaterValue(arr,input);
        System.out.println(result);
    }
    static int greaterValue(int arr[],int input){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==input){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]>input){
                        return arr[j];
                    }
                }
            }
        }
        return -1;
    }
}
