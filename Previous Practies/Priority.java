public class Priority extends Thread {
    public void run(){
        System.out.println("This is child Thread ");
        System.out.println("Child Thread Priority : "+ Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("Child Thread new Priority : "+ Thread.currentThread().getPriority());
    }
    public static void main (String [] args){
        System.out.println("Main Thread default Priority : "+ Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(7); //priority must be between 1 to 10
        // Thread.currentThread().setPriority(MAX_PRIORITY); //MAX_PRIORITY= 10
        // Thread.currentThread().setPriority(MIN_PRIORITY); //MIN_PRIORITY= 1
        // Thread.currentThread().setPriority(NORM_PRIORITY); //NORM_PRIORITY= 5

        System.out.println("Main Thread New Priority : "+ Thread.currentThread().getPriority());
        Priority t1=new Priority();
        t1.start();
        t1.setPriority(MIN_PRIORITY);
    }
}
