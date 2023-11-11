
public class DuplicateSum{
    public static void main(String[] args) {
        int arr[]={77,3,2,5,10,11,13,5,3};
        int len=arr.length;
        int sum=0;
        for(int i=0;i<len;i++){
            if(isPrime(arr[i])){
                if(isDuplicate(arr,arr[i],i+1)){
                    sum=sum+arr[i];
                }
            }
        }
        
        System.out.println(sum);
    }
    static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean isDuplicate(int []arr,int n,int index){
        int len=arr.length;
        for(int i=index;i<len;i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;
    }
}