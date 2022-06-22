package com.lara.pack31.output;

public class C implements Runnable {

	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				Thread.sleep(1000);
				System.out.println("x");
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " ENDED");
		}
	}

	public static void main(String args[]) throws Exception {

		C obj = new C();
		Thread t = new Thread(obj, "Thread-1");
		t.start();

		
		System.out.println("press enter");
		System.in.read();
		t.interrupt();
	}
}

/*

"press enter" will be printed first then thread1 will keep on printing x until enter is pressed, 
once enter is pressed "Thread-1 ENDED" will be printed. System.in.read() causes main 
thread to go from running to waiting state (thread waits for user input)
 
press enter
x
x
x
x
 
Thread-1 ENDED
 
*/