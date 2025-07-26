package com.java09;

interface MyInterface {

	default void display() {
		System.out.println("Displaying data");
		log("Data displayed");
	}

	private void log(String message) {
		System.out.println("Log: " + message);
	}
}

public class BprivateMethodInterface {
	public static void main(String[] args) {
		MyInterface obj = new  MyInterface() {
		};
		obj.display();
	}
}

/*
Java 9, We can define private methods inside interfaces. 
	This helps us avoid code duplication and create reusable utility methods.
	
The log() method is private and can only be used within the interface.
This improves code readability and modularity.
*/
