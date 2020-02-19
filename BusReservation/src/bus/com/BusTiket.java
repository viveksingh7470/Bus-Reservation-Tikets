package bus.com;

import java.util.Scanner;


 class BusCounter
{

	private int availableSeats = 10;

	public synchronized void bookTicket(String pname, int numberOfSeats) {
		if ((availableSeats >= numberOfSeats) && (numberOfSeats > 0)) {
			System.out.println("Hi," + pname + " : " + numberOfSeats+ " Seats booked Successfully..");
			availableSeats = availableSeats- numberOfSeats;
		} 
		else
			System.out.println("Hi," + pname + " : Seats Not Available");
	}
}
public class BusTiket
{

	public static void main(String[] args) 
	{
		String userName;
		String userName1;
		int ticket;
		int ticket1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the user1 Name");
         userName=sc.next();
        System.out.println("number of tickets");
         ticket=sc.nextInt();
        System.out.println("enter the user2 Name");
         userName1=sc.next();
        System.out.println("number of tickets");
         ticket1=sc.nextInt();
         BusCounter busCounter = new BusCounter();
        BusBook t1 = new  BusBook(busCounter,userName,ticket);
        BusBook t2 = new  BusBook(busCounter,userName1,ticket1);
        
        t1.start();
        t2.start();
        
	}

}
