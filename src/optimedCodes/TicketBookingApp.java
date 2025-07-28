package optimedCodes;
class BookingSystem {
    int availableSeats = 2;

    public synchronized void bookTicket(String name, int seatsRequested) throws InterruptedException {
        if (seatsRequested <= availableSeats) {
            System.out.println(name + " - " + seatsRequested );//can see which thread first hits booking
            Thread.sleep(10000); //10sec duration so can clearly see each booking information
            System.out.println("hi");
            Thread.currentThread().sleep(1000);
            availableSeats -= seatsRequested;
            System.out.println(name + " booked "+seatsRequested+" seat.");
        } else {
            System.out.println("not booked "+name); //gets thread executed first,but not booked will see
        }
    }
}
class BookingThread extends Thread {
    BookingSystem bookingSystem;
    int seats;
    String userName;

    public BookingThread(BookingSystem bookingSystem,int seats, String userName) {
        this.bookingSystem = bookingSystem;
        this.seats = seats;
        this.userName = userName;
    }

    public void run() {
        try { //while writing sleep() , it must ask for exception handling.
            bookingSystem.bookTicket(userName, seats);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class TicketBookingApp {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();
        BookingThread user1 = new BookingThread(bookingSystem,1, "Teja");
        BookingThread user2 = new BookingThread(bookingSystem,2, "Ravi");
        // for both BookingThread(user1,user2) objects shared only one instant of bookingSystem Object,
        // so all cases one shared avaliableSeats shares.
        user1.start();
        user2.start();
    }
}

