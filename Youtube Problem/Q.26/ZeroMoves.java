public class ZeroMoves {
    public static void main(String[] args) {
        int []arr={10,0,0,-5,0,40,50,-1,0}; //output: {10,-5,40,50,-1,0,0,0,0}
        int result[]=zeroMoves(arr);
        System.out.print("{ ");
        for(int i=0;i<result.length;i++){
            if(i==result.length-1){
                System.out.print(result[i]+" ");
            }
            else{
                System.out.print(result[i]+", ");
            }

        }
        System.out.print("}");
    }
    static int [] zeroMoves(int arr[]){
        int resultArr[]=new int [arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                resultArr[index++]=arr[i];
            }
        }
        return resultArr;
    }
}
