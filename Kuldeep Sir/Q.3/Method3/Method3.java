/* Q.Best time to Buy and Sell Stock
     Input:  Prices=[7,1,5,3,6,4]
     output: 5
*/

public class Method3 {
    public static void main(String[] args) {
        int []prices={7,1,5,3,6,4};
        int result=getValue2(prices);
        System.out.println(result);
    }
    static int getValue2(int []prices){
        int buy=Integer.MAX_VALUE;
        int pist=0; //Profit if Sell Today
        int op=0; //Overall Profit
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            pist=prices[i]-buy;
            if(op<pist){
                op=pist;
            }
        }
        return op;
    }
}
