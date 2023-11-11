public class DaemonThread extends Thread {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Its is a Child Daemon Thread");
        }
        else{
            System.out.println("Its is child Thread that is not Daemon Thread");
        }
    }
    public static void main(String [] args){
        System.out.println("Its Main Thread ");
        DaemonThread t1= new DaemonThread();
        t1.setDaemon(true);  //Daemon always works in background of patent Thread
        t1.start();
        //Another Thread create that is not Daemon Thread
        DaemonThread t2= new DaemonThread();
        t2.start();
    }
}
