/*
 	Program to show that with synchronization no problems will happen when  2 passengers 
	try to book train ticket, dat too when only 1 ticket was available
*/
package com.lara.pack16.raceCondition;

public class TicketBooking2 implements Runnable {
	int ticketsAvailable = 1;

	public void run() {

		System.out.println("Waiting to book ticket for : " + Thread.currentThread().getName());
		synchronized (this) {
			if (ticketsAvailable > 0) {
				System.out.println("Booking ticket for : " + Thread.currentThread().getName());

				// Let's say system takes some time in booking ticket (here we have taken 1
				// second time)
				try {
					Thread.sleep(1000);
					ticketsAvailable--;
					System.out.println("Ticket BOOKED for : " + Thread.currentThread().getName());
					System.out.println("currently ticketsAvailable = " + ticketsAvailable);
				} catch (Exception e) {
				}
			} else {
				System.out.println("Ticket NOT BOOKED for : " + Thread.currentThread().getName());
			}
		} // End synchronization block
	}
}
