package com.diffbwAbsInter;

public interface Ginterface {
	public abstract void test1();

	default void defaultMethod() {
		System.out.println("Default method from Ginterface");
	}
}
