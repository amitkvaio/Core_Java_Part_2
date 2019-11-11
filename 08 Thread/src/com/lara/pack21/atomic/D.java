//Subtraction methods of AtomicInteger
package com.lara.pack21.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class D {
	public static void main(String[] args) {
		 
		AtomicInteger atm = new AtomicInteger(10);
		System.out.println(atm.get()); // it will print 10
		
		 int decrementAndGet = atm.decrementAndGet();//decrement by 1 - 9
		 int getAndDecrement = atm.getAndDecrement();//print 9 and decrement by 1
		 System.out.println("decrementAndGet : "+decrementAndGet );
		 System.out.println("getAndDecrement : "+getAndDecrement );
		 System.out.println("Current Value : "+atm.get()); //8
	}
}
