public class SleepMethod {
    public static void main(String [] args) //throws InterruptedException
    { 
        Test t1=new Test();
        t1.start();
    }
    
}
class Test extends Thread{
    public void run(){
        System.out.println("This is child thread");
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
