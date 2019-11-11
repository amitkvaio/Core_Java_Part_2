package com.lara.pack31.output;

class K implements Runnable {

	@Override
	public void run() {
		synchronized (this) {
			try {
				System.out.println("2 ");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int i = 0; i < 3; i++) {
				System.out.println("before notify::"+i);
			}
			this.notify();
			// it will notify the waiting thread but it will not release the lock until 
			//the synchronized block completely gets executed.
			for (int i = 0; i < 3; i++) {
				System.out.println("after notify::"+i);
			}
			
			System.out.println("3 ");
		}
	}
}

class L extends Thread {
	K prod;

	L(K obj) {
		prod = obj;
	}

	public void run() {
		synchronized (this.prod) {
			System.out.println("1 ");
			try {
				this.prod.wait();
				for (int i = 0; i < 3; i++) {
					System.out.println("after wait method ::"+i);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("4 ");
	}
}

public class J {
	public static void main(String args[]) throws InterruptedException {

		K myRunnable1 = new K();
		L myRunnable2 = new L(myRunnable1);

		Thread thread1 = new Thread(myRunnable1, "Thread-1");
		Thread thread2 = new Thread(myRunnable2, "Thread-2");

		thread2.start();
		Thread.sleep(100); // This minor delay will ensure that Thread-1 thread starts Thread-2
		thread1.start();

	}
}

/*
Wait() method causes the current thread to wait until another thread invokes the notify() 
or notifyAll() method for this object. Now, as soon as notify() or notifyall() method is called it notifies 
the waiting thread, but object monitor is not yet available. 
Object monitor is available only when thread exits synchronized block or synchronized method. So, 

what happens is code after notify() is also executed and execution is done until we reach end of synchronized block. 

The awakened threads will not be able to proceed until the current thread relinquishes the lock on this object

1 
2 
before notify::0
before notify::1
before notify::2
after notify::0
after notify::1
after notify::2
3 
after wait method ::0
after wait method ::1
after wait method ::2
4 

*/