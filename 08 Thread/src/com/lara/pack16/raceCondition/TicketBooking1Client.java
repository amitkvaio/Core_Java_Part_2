package com.lara.pack16.raceCondition;

public class TicketBooking1Client {
	public static void main(String args[]) {
		TicketBooking1 obj = new TicketBooking1();
		Thread thread1 = new Thread(obj, "Passenger1 Thread");
		Thread thread2 = new Thread(obj, "Passenger2 Thread");
		thread1.start();
		thread2.start();
	}
}

/*
output:

Waiting to book ticket for : Passenger1 Thread
Waiting to book ticket for : Passenger2 Thread
Booking ticket for : Passenger1 Thread
Booking ticket for : Passenger2 Thread
Ticket BOOKED for : Passenger1 Thread
currently ticketsAvailable = 0
Ticket BOOKED for : Passenger2 Thread
currently ticketsAvailable = -1


Explanation:
--> If we note the above program, first Passenger1 Thread and Passenger2 Thread waited to book tickets.
	Than, both threads tried to check the available ticket count and it was 1.

--> Both threads were able to book ticket.And ultimately available ticket was reduced to -1, 
	which is practically impossible, tickets count can never dip below 0. 

--> RACE CONDITION PROBLEM : 1 ticket was booked by 2 passengers.

 Solve the problem by using synchronized block.check TicketBooking2.java
*/





