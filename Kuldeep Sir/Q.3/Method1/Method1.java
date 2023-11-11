/* Q.Best time to Buy and Sell Stock
     Input:  Prices=[7,1,5,3,6,4]
     output: 5
*/

class Para{
    int max,min,index;
}

public class Method1 {
    public static void main(String[] args) {
        int []prices={7,1,5,3,6,4};
        Para obj=getValue(prices);
        System.out.println(obj.max-obj.min);
    }
    
    static Para getValue(int []prices){

        Para obj=new Para();
        int len=prices.length;
        
        obj.min=prices[0];
        for(int i=0;i<len;i++){
            if(obj.min>prices[i]){
                obj.min=prices[i];
                obj.index=i;
            }
        }

        obj.max=prices[obj.index];
        for(int i=obj.index;i<len;i++){
            if(obj.max<prices[i]){
                obj.max=prices[i];
            }
        }
        return obj;
    }
}
