package com.lara.app1;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}

	}
}

public class Manager07 {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr);
		t1.start();

		for (int i = 2000; i < 3000; i++) {
			System.out.println(i);
		}
	}
}

/*
 * Second approach to create thread implementing Runnable interface:- Step
 * 1:-our normal java class will become Thread class whenever we are
 * implementing Runnable interface.
 * 
 * class MyClass extends Runnable { };
 * 
 * Step2: override run method to write logic of Thread. class MyClass extends
 * Runnable { public void run() { System.out.println("from the run method");
 * System.out.println("body of the thread"); } }
 * 
 * Step 3:- Creating a object. MyClass obj=new MyClass(); Step 4:- Creates a
 * Thread class object. After new Thread is created it is not started running
 * until we are calling start() method. So whenever we are calling start method
 * that start() method call run() method then the new Thread execution started.
 * Thread t=new Thread(obj); t.start();
 * 
 * First approach:- important point is that when extending the Thread class, the
 * sub class cannot extend any other base classes because Java allows only
 * single inheritance. Second approach:- 1) Implementing the Runnable interface
 * does not give developers any control over the thread itself, as it simply
 * defines the unit of work that will be executed in a thread. 2) By
 * implementing the Runnable interface, the class can still extend other base
 * classes if necessary.
 */
