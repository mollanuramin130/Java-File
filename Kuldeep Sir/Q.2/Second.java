//Q. Given an int array nums ,return true if any value appends at least twice in array ,and return false
//   if every element is distinct.

import java.util.*;
public class Second {
    public static void main(String[] args) {
        int []nums={1,2,7,10,5,6};
    //  int []nums={1,2,7,6,10,5,6};
        Duplicate obj=new Duplicate();
        boolean result=obj.containDuplicate(nums);
        System.out.println(result);
    }
}

class Duplicate{
    boolean containDuplicate(int []nums){
        HashSet ref=new HashSet();
        for(int i:nums){
            if(!ref.add(i)){
                return true;
            }
        }
        return false;
    }
}
