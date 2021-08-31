// without synchronization Mixed output
// With synchronization -  sequential output
package com.lara.pack17.reentraceLock;

class Display {
	public synchronized  void wish(String name) { // remove synchronized //than add it
		for(int i=0;i<4;i++) {
			System.out.println("Good Morning :"+name);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread{
	Display d;
	String name;
	public MyThread1(Display d,String name) {
		this.d=d;
		this.name=name;
	}
	
	@Override
	public void run() {
		 d.wish(name);
	}
}
public class ReEntrantLock02 {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread1 t1 = new MyThread1(d, "Amit");
		MyThread1 t2 = new MyThread1(d, "Kumar");
		t1.start();
		t2.start();
	}
}
