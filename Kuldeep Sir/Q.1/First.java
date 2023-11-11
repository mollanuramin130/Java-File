//Q. Find the Maximum and Minimum Element of the given array using only one method.

import java.util.*;
class Para{
    int max;
    int min;
}

public class First{
    static Para getMaxMin(int []arr){
        Para obj=new Para();
        Arrays.sort(arr);
        obj.min=arr[0];
        obj.max=arr[arr.length-1];
        return obj;
    }
    public static void main(String[] args) {
        int []arr={-1,10,55,1,0,100,321,2};
        Para obj2=getMaxMin(arr);
        System.out.println(obj2.max);
        System.out.println(obj2.min);
    }
}