public class ReverseArr {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};
        Reversed obj=new Reversed();
        obj.reversed(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class Reversed{
    int [] reversed(int arr[]){
        int first=0,last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        return arr;
    }
}
