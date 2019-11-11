package com.lara.pack24.mixedQuestion;

public class PrintEvenOddClient {
	public static void main(String[] args) {
		C c = new C();
		PrintEvenOdd runnable1 = new PrintEvenOdd(c,1);
		PrintEvenOdd runnable2 = new PrintEvenOdd(c,0);

		Thread t1 = new Thread(runnable1, "TH-1");
		Thread t2 = new Thread(runnable2, "TH-2");

		t1.start();
		t2.start();
	}
}
