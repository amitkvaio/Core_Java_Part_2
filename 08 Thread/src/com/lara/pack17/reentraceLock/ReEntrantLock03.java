//Using Reentrant lock instead of synchronized keywords
package com.lara.pack17.reentraceLock;

import java.util.concurrent.locks.ReentrantLock;

class Display1 {
	ReentrantLock lock = new ReentrantLock();

	public void wish(String name) {
		lock.lock();//---------------> Line number 1
		for (int i = 0; i < 4; i++) {
			System.out.println("Good Morning :" + name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		lock.unlock(); //-------------> Line Number -2
	}
}

class MyThread2 extends Thread{
	Display1 d;
	String name;
	public MyThread2(Display1 d,String name) {
		this.d=d;
		this.name=name;
	}
	
	@Override
	public void run() {
		 d.wish(name);
	}
}
public class ReEntrantLock03 {
	public static void main(String[] args) {
		Display1 d = new Display1();
		MyThread2 t1 = new MyThread2(d, "Amit");
		MyThread2 t2 = new MyThread2(d, "Kumar");
		t1.start();
		t2.start();
	}
}
/*
If we comment line number 1 and 2 than the thread will be executed simultaneously, 
	and we will get irregular output.
If we are not commenting line number 1 and 2 than the thread will be executed one by one and we 
	will get regular output.
This is the example which tells, how to use ReentrantLock instead of synchronized keywords.

*/
