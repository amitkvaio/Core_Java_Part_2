package com.diffbwAbsInter;

public interface Hinterface extends Ginterface {
	public abstract void test2();
	default void defaultMethod() {
		System.out.println("Default method from Hinterface");
	}
}
