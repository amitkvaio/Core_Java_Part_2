package com.lara.pack03.deadlock;

public class DeadLockAvoidExp {
	// This method request two locks, first String and then Integer

	public void method1() {
		synchronized (String.class) {
			System.out.println("Aquired lock on String.class object from method1");

			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object from method1");
			}
		}
	}

	public void method2() {
		synchronized (String.class) {
			System.out.println("Aquired lock on String.class object from method2");

			synchronized (Integer.class) {
				System.out.println("Aquired lock on Interger.class object from from method2");
			}
		}
	}
}
