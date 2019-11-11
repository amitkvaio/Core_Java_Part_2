package com.lara.pack23.stopathread;

public class B {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		Thread th = new Thread(myThread, "Child-Thread-01");
		Thread th1 = new Thread(myThread, "Child-Thread-02");
		th.start();
		th1.start();
		String thName = Thread.currentThread().getName();

		for (int i = 0; i <= 3; i++) {
			System.out.println(thName + " IS EXECUTING : " + i);
			Thread.sleep(5000);
		}
		myThread.stopThread();
	}
}

class AA implements Runnable {
	private volatile boolean staus = false;

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		for (int i = 0; i <= 100; i++) {
			try {
				System.out.println(thName + " IS EXECUTING : " + i);
				Thread.sleep(500);
				if (staus)
					break;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(thName + " Has stopped!!");
	}

	public void stopThread() {
		this.staus=true;
	}
}