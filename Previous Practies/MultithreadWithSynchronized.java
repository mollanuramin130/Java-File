public class MultithreadWithSynchronized {
    public static void main (String ... args){
        MovieSeats ref1=new MovieSeats();
        BookingApp t1=new BookingApp(ref1,5);
        t1.start();
        MovieSeats ref2=new MovieSeats();
        BookingApp t2=new BookingApp(ref2, 6);
        t2.start();
        MovieSeats ref3=new MovieSeats();
        BookingApp t3=new BookingApp(ref3,5);
        t3.start();
        MovieSeats ref4=new MovieSeats();
        BookingApp t4=new BookingApp(ref4, 6);
        t4.start();
    }
}
class MovieSeats{
    static int total_seat=20;
    synchronized static void bookedSeat(int seats){
        if(seats<=total_seat){
            total_seat=total_seat-seats;
            System.out.println(seats+" Tickets booked Successfully...");
            System.out.println("Seats left : "+total_seat);
        }
        else{
            System.out.println("Sorry you can not Booked "+seats+" tickets Because :");
            System.out.println("Seats left : "+total_seat);
        }
    }
}
class BookingApp extends Thread{
    int seats;
    MovieSeats ref;
    BookingApp(MovieSeats ref, int seats){
        this.seats=seats;
        this.ref=ref;
    }
    public void run(){
        ref.bookedSeat(seats);
    }
}