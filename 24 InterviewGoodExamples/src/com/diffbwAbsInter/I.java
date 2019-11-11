package com.diffbwAbsInter;

public class I implements Hinterface {

	@Override
	public void test1() {
		System.out.println("Overriden method test1() in I class");
	}

	@Override
	public void test2() {
		System.out.println("Overriden method test2() in I class");
	}

	public static void main(String[] args) {
		Ginterface g = new I();
		g.defaultMethod();
		Hinterface h = new I();
		h.defaultMethod();
	}

}
