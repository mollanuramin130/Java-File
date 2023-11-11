public class ThreadNameSet {
    public static void main(String [] args){
        System.out.println("JVM Creat default Thread : "+Thread.currentThread().getName());
        Test t1=new Test();
        System.out.println("To check t1 Thread Alive or Not :" + t1.isAlive());
        t1.start();
        System.out.println("To check t1 Thread Alive or Not :" + t1.isAlive());
        Thread.currentThread().setName("Main Thread name change by Nur as : First Thread");
        System.out.println(Thread.currentThread().getName());
        t1.setName("Second Thread, Thread name change by Nur from main class as: Second ThreadUpdate");
        System.out.println(t1.getName());
        System.out.println("To check t1 Thread Alive or Not :" + t1.isAlive());
    }
}
class Test extends Thread{
    public void run(){
        System.out.println("This is thread classs run method body");
        // String name=Thread.currentThread().getName();
        // System.out.println(name);
        System.out.println("JVM Creat default Thread : "+Thread.currentThread().getName());
        Thread.currentThread().setName("Thread-0, Thread name change by Nur as : Second Thread");
        //System.out.println(Thread.currentThread().getName());
    }
}