public class ArrayUsingStack {
    private int size;
    private int arr[];
    private int top1,top2;
    ArrayUsingStack(int size){
        this.size=size;
        top1=-1;
        top2=size;
        arr=new int[size];
    }
    void push1(int element){
        if(top1+1==top2){
            System.out.println("Stack1 overflow");
        }
        else{
            top1++;
            arr[top1]=element;
        }
    }
    public int pop1(){
        if(top1==-1){
            System.out.println("Stack1 underflow");
            return -1;
        }
        else{
            return arr[top1--];
        }
    }
    void push2(int element){
        if(top1+1==top2){
            System.out.println("Stack2 overflow");
        }
        else{
            top2--;
            arr[top2]=element;
            
        }
    }
    public int pop2(){
        if(top2==size){
            System.out.println("Stack2 underflow");
            return -1;
        }
        else{
            return arr[top2++];
        }
    }
    public static void main(String[] args) {
        ArrayUsingStack obj=new ArrayUsingStack(2);
        obj.push1(10);
        obj.push2(5);
        obj.push2(3);
        System.out.println(obj.arr[0]);
        System.out.println(obj.pop2());
        obj.push2(3);
        System.out.println(obj.arr[1]);
    }
    
}
