public class Wait_Notify_Notifyall_methods {
    public static void main(String [] args) throws InterruptedException{
        TotalEarning t1= new TotalEarning();
        t1.start();
       // System.out.println("Total box office collection is in Rs."+ t1.collection);
       synchronized(t1){
        t1.wait();
        // System.out.println("Total box office collection is in Rs."+ t1.collection);
       }
       System.out.println("Total box office collection is in Rs."+ t1.collection);
    }
}

class TotalEarning extends Thread{
    int total_seat=10;
    int unsold_seats=2;
    int ticket_price=100;
    int collection=0;
    public void run(){
        synchronized(this){
            for(int i=1;i<=(total_seat - unsold_seats);i++){
                collection=collection + ticket_price;
                this.notify();
             }
         }
    }
}
