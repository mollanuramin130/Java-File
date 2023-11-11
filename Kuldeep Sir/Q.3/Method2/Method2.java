/* Q.Best time to Buy and Sell Stock
     Input:  Prices=[7,1,5,3,6,4]
     output: 5
*/

import java.util.*;

public class Method2 {
    public static void main(String[] args) {
        int []prices={7,1,5,3,6,4};
        int result=getValue(prices);
        System.out.println(result);
    }

    static int getValue(int []prices){
        int buy=Integer.MAX_VALUE;
        int sell=0;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            sell=Math.max(sell,prices[i]-buy);
        }
        return sell;
    }
}
