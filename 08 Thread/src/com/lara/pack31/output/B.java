package com.lara.pack31.output;

public class B implements Runnable{

	public void run() {
		for (int i = 0; i < 300000; i++) {
			System.out.println("i=" + i + " ,ThreadName=" + Thread.currentThread().getName());
		}
	}

	public static void main(String... args) throws InterruptedException {
		System.out.println("In main() method");
		B runnable = new B();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		System.out.println("end main() method");
	}
}

/*

We use join() method to ensure all threads that started from main must end in order 
in which they started and also main should end in last. 
In other words join() method waited for this thread to die.
 
In main() method
i=0 ,ThreadName=Thread-0
i=1 ,ThreadName=Thread-0
i=2 ,ThreadName=Thread-0
i=0 ,ThreadName=Thread-1
i=1 ,ThreadName=Thread-1
i=2 ,ThreadName=Thread-1
end main() method
 
*/