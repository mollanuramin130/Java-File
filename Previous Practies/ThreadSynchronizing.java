public class ThreadSynchronizing extends Thread{
    static BookTheaterSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
    public static void main(String [] args){
        b=new BookTheaterSeat();
        ThreadSynchronizing nur=new ThreadSynchronizing();
        nur.seats=7;
        nur.start();
        ThreadSynchronizing manish=new ThreadSynchronizing();
        manish.seats=6;
        manish.start();
        ThreadSynchronizing ajay=new ThreadSynchronizing();
        ajay.seats=3;
        ajay.start();
        ThreadSynchronizing abhay=new ThreadSynchronizing();
        abhay.seats=2;
        abhay.start();
    }
}
class BookTheaterSeat{
    int total_seat=10;
   synchronized void bookSeat(int seats){
        if(total_seat>=seats){
            System.out.println(seats+" seats booked successfully..");
            total_seat=total_seat-seats;
            System.out.println("Seats left : "+total_seat);
        }
        else{
            System.out.println("Sorry You can not booked seats because seats left : "+total_seat);
        }
    }
}