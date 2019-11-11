package com.lara.pack21.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class B {
	public static void main(String[] args) {
		//Compare with expect, if equal, set to update and return true.
		AtomicInteger atm = new AtomicInteger(10);
		System.out.println(atm.get()); // it will print 10
		
		 boolean status = atm.compareAndSet(10, 20);
		 System.out.println("Status : "+status + " current:"+atm.get());
	}
}
