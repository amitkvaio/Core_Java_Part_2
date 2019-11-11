/*
Java code for thread creation by extending the Thread class 
*/
package com.basic;
public class A extends Thread {
	
	@Override
	public void run() {
		// Displaying the thread that is running
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");
	}
	
	public static void main(String[] args) {
		int n = 8; // Number of threads 
        for (int i=0; i<8; i++) 
        { 
            A object = new A(); 
            object.start(); 
        } 
	}
}
