package com.lara.pack16.raceCondition;

public class TicketBooking2Client {
	public static void main(String args[]) {
		TicketBooking2 obj = new TicketBooking2();

		Thread thread1 = new Thread(obj, "Passenger1 Thread");
		Thread thread2 = new Thread(obj, "Passenger2 Thread");

		thread1.start();
		thread2.start();
	}
}

/*

Output
Waiting to book ticket for : Passenger1 Thread
Booking ticket for : Passenger1 Thread
Waiting to book ticket for : Passenger2 Thread
Ticket BOOKED for : Passenger1 Thread
currently ticketsAvailable = 0
Ticket NOT BOOKED for : Passenger2 Thread

--> If we note the above program, first Passenger1 Thread and Passenger2 Thread waited to book tickets.
		Than, Passenger1 Thread entered the synchronized block and acquired object lock, 

--> But Passenger2 Thread wasn’t able to acquire object lock and was waiting for Passenger1 
		Thread to release object lock. 
--> By the time Passenger1 Thread was successfully able to book ticket and reduce the 
		available ticket count to 0, and then release object lock by exiting synchronized block.
		Than Passenger2 Thread got a chance to acquire object lock, 
		but available ticket count at that time was 0 so it wasn’t able to book ticket.

--> RACE CONDITION PROBLEM SOLVED : 1 ticket was booked by only 1 passenger, 
		while other wasn’t able to book any ticket.
*/
