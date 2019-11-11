//Java program to control the Main Thread 
package com.basic;

public class C extends Thread {
	@Override
	public void run() {
		System.out.println("--- Child Thread ---");
		Thread ct = Thread.currentThread();
		System.out.println("Child Thread Name : "+ct.getName());
		
		// getting priority of child thread which will be inherited from Main thread 
        // as it is created by Main thread 
		System.out.println("Child Thread Priority : "+ct.getPriority());
		
		ct.setPriority(7);
		System.out.println("Child Thread new Priority : "+ct.getPriority());
	}
	
	public static void main(String[] args) {
		Thread mt = Thread.currentThread();
		System.out.println("Main Thread Name : "+mt.getName());
		
		//Changing the main thread Name
		mt.setName("Master Thread");
		System.out.println("Main Thread Name : "+mt.getName());
		
		//Getting the priority of the main Thread.
		System.out.println("Main Thread Default Priority "+mt.getPriority());
		
		//changing priority of main thread.
		mt.setPriority(6);
		System.out.println("Main Thread new Priority "+mt.getPriority());
		
		for (int i = 0; i < 5; i++) 
        { 
            System.out.println("Main thread"); 
        } 
		
		C c = new C();
		c.start();
		System.out.println("======= Finish =========");
	}
}
