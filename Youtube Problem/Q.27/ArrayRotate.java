public class ArrayRotate {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70,80,90};
        int position=7;
        int finalArr[]=arrayRotate(arr,position);
        System.out.print("after "+position+" Rotate Array be :\n{ ");
        for(int i=0;i<finalArr.length;i++){
            System.out.print(finalArr[i]+" ");
        }
        System.out.print("}\n");
    }
    static int [] arrayRotate(int []arr,int position){
        int temp[]=new int[position];
        for(int i=0;i<position;i++){
            temp[i]=arr[i];
        }
        for(int i=position;i<arr.length;i++){
            arr[i-position]=arr[i];
        }
        for(int i=(arr.length-1)-position;i<arr.length-1;i++){
            arr[i]=temp[i-(arr.length-1-position)];
        }
        return arr;
    }
}
