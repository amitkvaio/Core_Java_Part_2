package com.lara.pack31.output;

public class P {
	public static void main(String[] args) throws InterruptedException {
		synchronized (args) {
			System.out.print("1 ");
			args.wait();
			System.out.print("2 ");
		}
	}
}

/*
Though this question looks bit similar to output question 4 but intention is to show args is object and we can acquire lock on it.
Thread acquires lock on args object but notify wasn't called so 2 will never be printed, this is called frozen process.

1
 
*/