package com.lara.pack31.output;

public class T implements Runnable {

	@Override
	public void run() {
		System.out.println("1");
	}

	public static void main(String[] args) {
		T obj = new T();
		Thread thread1 = new Thread(obj, "Thread-1");
		thread1.start();
		thread1.start();
	}
}
/*
we cannot start Thread again, doing so will throw runtimeException java.lang.IllegalThreadStateException. 
	The reason is once run() method is executed by Thread, it goes into dead state. 
Let’s take an example-
Thinking of starting thread again and calling start() method on 
	it (which internally is going to call run() method) for us is some what like asking dead man to wake up and run. 
	As, after completing his life person goes to dead state.

1
Exception in thread "main" 
java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Thread.java:708)
	at com.lara.pack31.output.T.main(T.java:14)

*/