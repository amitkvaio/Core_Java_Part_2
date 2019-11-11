package com.lara.pack10.threadLocal;
class CustomerThread extends Thread{
	static Integer custId=0;
	private static ThreadLocal tl = new ThreadLocal() {
		protected Object initialValue() {
			System.out.println("From InitialValue");
			return ++custId;
		}
	};
	
	public CustomerThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname +" executing with Customer id :"+tl.get());
	}
			
}
public class ThreadLocalDemo3 {
	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("Customer Thread -1");
		CustomerThread c2 = new CustomerThread("Customer Thread -2");
		CustomerThread c3 = new CustomerThread("Customer Thread -3");
		CustomerThread c4 = new CustomerThread("Customer Thread -4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}
}
