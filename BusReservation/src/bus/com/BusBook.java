package bus.com;
public class BusBook extends Thread {

	private BusCounter ticketCounter;
	private String passengerName;
	private int noOfSeatsToBook;

	public BusBook(BusCounter ticketCounter,String passengerName, int noOfSeatsToBook) {
		this.ticketCounter = ticketCounter;
		this.passengerName = passengerName;
		this.noOfSeatsToBook = noOfSeatsToBook;
	}
	
	public void run() {
		ticketCounter.bookTicket(passengerName, noOfSeatsToBook);
	}
}
