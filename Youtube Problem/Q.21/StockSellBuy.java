public class StockSellBuy {
    public static void main(String[] args) {
        int arr[]={10,150,10,5,30,170,50,10};
        int result=bestProfit(arr);
        System.out.println("Best sell profit : "+result);
    }
    static int bestProfit(int []arr){
        int maxProfit=Integer.MIN_VALUE;
        int currentBuyValue=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int value=arr[i];
            if(value<currentBuyValue){
                currentBuyValue=value;
            }
            maxProfit=Math.max(arr[i]-currentBuyValue, maxProfit);
        }
        return maxProfit;
    }
}
