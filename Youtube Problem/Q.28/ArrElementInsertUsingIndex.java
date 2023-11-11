public class ArrElementInsertUsingIndex {
    public static void main(String[] args) {
        int arr[]={5,9,1,0,5,6,0};
        int index=4;
        int element=-47;
        int element2=207;
       
       if(insert(arr, index, element)){
        System.out.println("Element:"+element+ " insert successfully at index :"+index+".");
       }
       else{
        System.out.println("Array already full!!");
       }

       if(insert(arr, index, element)){
        System.out.println("Element "+element+ "insert successfully at index :"+index+".");
       }
       else{
        System.out.println("Array already full!!");
       }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static boolean insert(int []arr,int index,int element){
        if(arr[arr.length-1]==0){
            for(int i=arr.length-1;i>=index;i--){
                arr[i]=arr[i-1];
            }
            arr[index]=element;
            return true;
        }
        return false;
    }
}
