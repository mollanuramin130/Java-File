//package Java File.Manthan Class;


import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=1;
        int r=50;
        int v=3;
        int count=0;
    
        for(int i=l;i<=r;i++){
            if(i%v==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
