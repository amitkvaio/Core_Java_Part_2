package com.lara;
public class L {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
		} catch (ArithmeticException ex) {
			System.out.println(3);
			ex.printStackTrace();
			System.out.println(4);
		}
		System.out.println(5);
	}
}

/*
ex.printStackTrace();=java.lang.ArithmeticException: / by zero
	at com.lara.L.main(L.java:11)

The exception are occurred due to several reasons
a. Developer mistakes
b. End-user mistakes.
i. While providing inputs to the application.
ii. Whenever user is entered invalid data then Exception is occur.
iii. A file that needs to be opened can’t found then Exception is occurred.
iv. Exception is occurred when the network has disconnected at the middle of the communication……..etc

*/