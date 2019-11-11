package com.harman;

public class D {
	public static void main(String[] args) {
		try {
			throw new Error();
		} catch (Error e) {
			try {
				System.out.println("----catch-1------");
				e.printStackTrace();
				throw new RuntimeException();
			} catch (Throwable e2) {
				System.out.println("--catch-2--");
				e2.printStackTrace();
			}

		}
		System.out.println("phew");
		for (int i = 0; i < 5; i++) {
			System.out.println("num->" + i);
		}
	}
}
