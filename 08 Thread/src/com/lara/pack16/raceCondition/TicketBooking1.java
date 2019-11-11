/*Program to show that without synchronization problems will happen when  2 
	passengers try to book train ticket, that too when only 1 ticket was available
*/
package com.lara.pack16.raceCondition;

public class TicketBooking1 implements Runnable {
	int ticketsAvailable = 1;

	public void run() {
		String thName = Thread.currentThread().getName();
		System.out.println("Waiting to book ticket for : " + thName);
		if (ticketsAvailable > 0) {
			System.out.println("Booking ticket for : " + thName);

			// Let's say system takes some time in booking ticket (here we have taken 1
			// second time)
			try {
				Thread.sleep(1000);
				ticketsAvailable--;
				System.out.println("Ticket BOOKED for : " + thName);
				System.out.println("currently ticketsAvailable = " + ticketsAvailable);
			} catch (Exception e) {
			}
		} else {
			System.out.println("Ticket NOT BOOKED for : " + thName);
		}
	}
}

/*
Race condition
----------------
--> When more than one thread try to access same resource without synchronization causes race condition.
-->	So we can solve race condition by using either synchronized block or synchronized method. 
--> When no two threads can access same resource at a time phenomenon is also called as mutual exclusion


Example (Train ticket booking)-
	Let's say there is only 1 ticket available in train, and two passengers are trying to book 
		that ticket at same time without synchronization.
	It might happen that both might end up booking up ticket, though only ticket was available, 
		which is of course going to create problem.
	But if synchronization was there only of them would have been able to book ticket.

*/
