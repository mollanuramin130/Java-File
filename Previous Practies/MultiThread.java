public class MultiThread {
    public static void main(String [] args) throws InterruptedException{
    Test t=new Test();
    
    t.start();
    Test2 th=new Test2();
    Thread t2=new Thread(th);
    t2.start();
    } 
}
class Test extends Thread {
    public void run() { 
        try{
          //  System.out.println("This is thread class");
        for(int i=0;i<5;i++){
            System.out.println(i+" Thead Name : "+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class Test2 implements Runnable{
    public void run(){
        try{
           // System.out.println("This is interface thread class");
        for(int i=0;i<5;i++){
            System.out.println(i+" Thead Name : "+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}