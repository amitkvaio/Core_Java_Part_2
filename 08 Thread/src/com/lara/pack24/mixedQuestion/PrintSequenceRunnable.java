package com.lara.pack24.mixedQuestion;
class D {
	
	public int PRINT_NUMBERS_UPTO = 100;
	static int number = 1;
	
	public void sequencePrint(int remainder) {
		while (number < PRINT_NUMBERS_UPTO - 1) {
			synchronized (this) {
				while (number % 3 != remainder) { // wait for numbers other than remainder
					try {
						Thread.sleep(1000);
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				this.notifyAll();
			}
		}
	}
}
public class PrintSequenceRunnable implements Runnable {
	D d;
	int remainder;
	PrintSequenceRunnable(D d,int remainder) {
		this.d=d;
		this.remainder = remainder;
	}

	@Override
	public void run() {
		d.sequencePrint(remainder);
	}
}
