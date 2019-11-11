package com.lara.app1;

class F extends Thread {

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("from F thread class-" + i);
		}
	}

}

class G implements Runnable {
	public void run() {
		for (int i = 1000; i < 2000; i++) {
			System.out.println("from G thread class-" + i);
		}
	}

}

public class Manager11 {

	public static void main(String[] args) {

		F f1 = new F();
		f1.start();

		G g1 = new G();
		Thread t2 = new Thread(g1);
		t2.start();
		System.out.println("done");
	}

}
