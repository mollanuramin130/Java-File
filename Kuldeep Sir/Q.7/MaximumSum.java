public class MaximumSum {
    public static void main(String[] args) {
        int arr[]={-11,5,1 ,2 ,-3,7 ,-4 ,3 ,2 ,-10 ,7,2};
        System.out.println(printSum(arr));
    }

    static int printSum(int arr[]){
        int maxSum=0;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum=0;
            for(int j=i;j<arr.length;j++){
                currentSum+=arr[j];
                maxSum=Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}
