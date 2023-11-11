public class Yield_method extends Thread{
    public void run(){
        Thread.yield(); //if you went this thread to stop and provide chance to other thread for executing
        for(int i=0;i<7;i++){
            System.out.println("Thread Name : "+Thread.currentThread().getName()+" : "+i);
        }
    }
    public static void main(String [] args){
        Yield_method t1=new Yield_method();
        t1.start();
        //Thread.yield(); //if you went main thread to stop and provide chance to other thread for executing
        for(int j=0;j<7;j++){
            System.out.println("Thread Name : "+ Thread.currentThread().getName()+" : "+j);
        }
    }
    
}
