package com10.generic;
class L1<T, V> {
	T var1;
	V var2;

	public L1(T parameter1, V parameter2) {
		var1 = parameter1;
		var2 = parameter2;
	}
	public void L1() {
		System.out.println("Detail of var1:" + var1.getClass().getName() + " " + var1);
		System.out.println("Detail of var2:" + var2.getClass().getName() + " " + var2);
	}
}

public class Imp01 {
	public static void main(String[] args) {
		L1<String, Integer> a = new L1<String, Integer>("amit", 100);
		a.L1();
	}
}
