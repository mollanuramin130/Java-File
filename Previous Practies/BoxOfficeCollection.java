import java.util.Collection;

public class BoxOfficeCollection {
    public static void main(String [] args) throws InterruptedException{
        SeatsCount ref1= new SeatsCount();
        BookSeat1 t1=new BookSeat1(ref1, 7);
        t1.start();
        BookSeat1 t2=new BookSeat1(ref1, 2);
        t2.start();

        //-----------Multi Class Thread creating-------------

        SeatsCount ref2= new SeatsCount();
        BookSeat2 t3=new BookSeat2(ref2, 6);
        t3.start();
        BookSeat2 t4=new BookSeat2(ref2, 5);
        t4.start();

        //-----------BoxOffice Collection-------------
        SeatsCount t5=new SeatsCount();
        t5.start();
           // t5.wait();
            System.out.println("Gross Total box office Collections is : "+t5.collection);
    }
}
class BookSeat1 extends Thread{
    SeatsCount ref;
    int seats;
    BookSeat1(SeatsCount ref,int seats){
        this.ref=ref;
        this.seats=seats;
    }
    public void run(){
        ref.bookedSeat(seats);
    }
}
class BookSeat2 extends Thread{
    SeatsCount ref;
    int seats;
    BookSeat2(SeatsCount ref,int seats){
        this.ref=ref;
        this.seats=seats;
    }
    public void run(){
        ref.bookedSeat(seats);
    }
}
class SeatsCount extends Thread{
    static int ticket_price=100;
    static int initial_seats=10;
    static int total_seat=10;
    static int unsold_seats=total_seat;
    static int collection=0;
    static synchronized void bookedSeat(int seats){ // static synchronized use for Different class Thread
        if(total_seat>=seats){                      // handling so that result make accurate....
            System.out.println(seats+" Seats booked Successfully..");
            total_seat=total_seat-seats;
            collection=collection+seats*100;
            System.out.println("Seats left : "+total_seat);
        }
        else{
            System.out.println("Sorry can not booked :"+seats+" seats !!...\nbecause seats left : "+total_seat);
        }
    }
    public void run(){
        synchronized(this){
    for(int i=1;i<=(initial_seats - unsold_seats);i++){
        collection=collection+ticket_price;
        this.notify();
    }
}
}
}