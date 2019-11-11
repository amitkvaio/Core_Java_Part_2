//Program to demonstrate usage of java.util.concurrent.atomic.AtomicInteger in java
package com.lara.pack21.atomic;

import java.util.concurrent.atomic.AtomicInteger;

class F implements Runnable{
	@Override
	public void run() {
		 String thName = Thread.currentThread().getName();
		 for(int i=0;i<2;i++){
             System.out.println("ThreadName="+thName
                   +" > "+ EAtomicInterger.sharedAtomicInteger.incrementAndGet());
      } 
	}
}

public class EAtomicInterger {
	//Create a new AtomicInteger and is initialized to 0.
    static AtomicInteger sharedAtomicInteger =new AtomicInteger();
	public static void main(String... args) throws Exception {
		F fRunnable = new F();
		Thread th1 = new   Thread(fRunnable,"Thread-1");
		Thread th2 = new   Thread(fRunnable,"Thread-2");
		th1.start();
		th2.start();
		
		 Thread.sleep(1000); //delay to ensure Thread-1 and Thread-2 finish
         System.out.println("After completion of both threads, "
                      + "sharedAtomicInteger = "+sharedAtomicInteger);
	}
}

/*

In the program, a static AtomicInteger is created with name 
sharedAtomicInteger and is initialized to 0.  
Then, Thread-1 and Thread-2 atomically increments sharedAtomicInteger  inside run( ) 
method using incrementAndGet() method [incrementAndGet() method increments current value by 1. 
And return updated value].
Here, sharedAtomicInteger  being AtomicInteger prevents two threads from writing to 
it at the same time.
*/

