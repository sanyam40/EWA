class BookSeat{
    static int total_seats=10;

    void bookseat(int seats){
// STATIC synchronized IS USED IN CASE OF DIFFERENT CLASS.
        synchronized (this){
            if(total_seats>=seats){
                System.out.println("SEAT BOOKED !!");
                total_seats=total_seats-seats;
                System.out.println("SEATS LEFT : "+total_seats);
            }
            else{
                System.out.println("SEAT CAN'T BE BOOKED");
            }
        }
    }
}
class MovieBookApp_Synchronization extends Thread{
    int seats;
    static BookSeat b;
    public void run(){
        b.bookseat(seats);
    }

    public static void main(String[] args) {
        b=new BookSeat();
        MovieBookApp_Synchronization sanyam=new MovieBookApp_Synchronization();
        sanyam.seats=7;
        sanyam.start();

        MovieBookApp_Synchronization sahil=new MovieBookApp_Synchronization();
        sahil.seats=11;
        sahil.start();        
    }
}