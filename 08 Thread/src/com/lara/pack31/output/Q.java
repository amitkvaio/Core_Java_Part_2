package com.lara.pack31.output;

class Class2 {
	void method2(String name) {
		for (int x = 1; x <= 2; x++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class Q implements Runnable {
	Class2 obj2;
	//static Class2 obj2;
	public static void main(String[] args) {
		new Q().method1();
	}

	void method1() {
		obj2 = new Class2();
		new Thread(new Q()).start();
		//We are creating the Q class object - and obj2 is the instance variable of Class2 - - so it will get initialized with null
		new Thread(new Q()).start();
	}

	public void run() {
		obj2.method2(Thread.currentThread().getName());
	}
}
/*
Program will face NullPointerException at Class2 obj2, we must make it static. 
As new Thread(new MyClass()).start(); creates thread on new instance of MyClass.

If Class2 obj2 is made static, than
Thread-0 and Thread-1 will be printed twice but in unpredictable order.


So, output will be different in subsequent executions,(as shown below)-

Thread-1
Thread-1
Thread-0
Thread-0

*/