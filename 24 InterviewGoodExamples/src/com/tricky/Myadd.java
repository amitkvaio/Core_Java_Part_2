package com.tricky;

public class Myadd <T>{
	void add(T t) {
		System.out.println(t);
	}
	public static void main(String[] args) {
		Myadd<Number> myadd = new Myadd<Number>();
		myadd.add(new Integer(1));
		myadd.add(new Double(1.0));
		System.out.println(myadd);
	}
}
