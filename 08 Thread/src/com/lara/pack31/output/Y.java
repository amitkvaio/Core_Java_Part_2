package com.lara.pack31.output;

public class Y extends Thread {

	public void run() {
		method1();
	}

	public static void method1() {
		/*synchronized (this) {
			System.out.println("2 ");
		}*/
	}

	public static void main(String[] args) {
           new Thread(new Y()).start();
    }
}

/*

We will face compilation error at line synchronized (this) can’t use in static context, 
because it’s not possible to obtain lock on object from static method. 
Though we can obtain lock on class’s class object , so synchronized (MyClass.class) will be a valid statement.

*/