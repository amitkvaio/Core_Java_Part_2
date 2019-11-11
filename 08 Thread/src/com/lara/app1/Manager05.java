package com.lara.app1;

class A {
	static void test() {
		for (int i = 0; i < 1000; i++)

		{
			System.out.println(i);
		}
	}

}

public class Manager05 {

	public static void main(String[] args) {

		for (int i = 1000; i < 2000; i++) {
			System.out.println(i);
		}
		System.out.println("==========================");
		A a1 = new A();
		a1.test();
		System.out.println("==========================");
		for (int i = 3000; i < 4000; i++) {
			System.out.println(i);
		}
	}

}
// In the above program only one thread is available is called main thread