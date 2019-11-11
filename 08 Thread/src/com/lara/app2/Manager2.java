package com.lara.app2;

class B extends Thread {

}

class C extends Thread {

}

class D extends Thread {

}

class E implements Runnable {
	@Override
	public void run() {

	}
}

public class Manager2 {
	static void printProperties(Thread t1) {
		System.out.println("id->" + t1.getId());
		System.out.println("Name->" + t1.getName());
		System.out.println("Priority->" + t1.getPriority());
		System.out.println("isDaemon->" + t1.isDaemon());
		System.out.println(".............");
	}

	public static void main(String[] args) {
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();
		E e1 = new E();
		Thread t1 = new Thread();
		Thread t2 = new Thread(e1);
		printProperties(b1);
		printProperties(c1);
		printProperties(d1);
		printProperties(t1);
		printProperties(t2);
	}
}
