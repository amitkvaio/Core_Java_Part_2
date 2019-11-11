package com.lara.pack21.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class A {
	public static void main(String[] args) {
		AtomicInteger atomic = new AtomicInteger();
		System.out.println(atomic.get()); // By default it will print zero
		
		AtomicInteger atm = new AtomicInteger(10);
		System.out.println(atm.get()); // it will print 10
		
		// int get() method returns the current value in java 
		
		atm.set(20); // set method used to set a new values.
		System.out.println("After set :"+atm.get()); //After set 20
		
		// set the new value and return the old value
		int getAndSet=atm.getAndSet(30);
		System.out.println("GetAndSet:"+getAndSet + " currentValue :"+atm.get());//20 and 30
	}
}
