//Addition methods of AtomicInteger
package com.lara.pack21.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class C {
	public static void main(String[] args) {
		AtomicInteger atm = new AtomicInteger(10);
		
		 int addAndGet = atm.addAndGet(5);//Add 5 and give updated value - 15
		 int getandIncrement=atm.getAndIncrement(); //-15 and increment by 1
		 int incrementAndGet=atm.incrementAndGet();//-increment by 1 -17
		 System.out.println("Curent Value :"+atm.get());//17
		 int getAndAdd=atm.getAndAdd(6);//17 and it will add 6 to 17
		
		 System.out.println("addAndGet : "+addAndGet);
		 System.out.println("getandIncrement : "+getandIncrement);
		 System.out.println("incrementAndGet : "+incrementAndGet);
		 System.out.println("getAndAdd : "+getAndAdd);
		 System.out.println("Current last : "+atm.get());
	}
}
