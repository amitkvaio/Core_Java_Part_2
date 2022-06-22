package com.clone;

public class D {
	int i;
}

class E implements Cloneable {
	D d1;
	int j;

	public static void main(String[] args) throws CloneNotSupportedException {
		E e1 = new E();
		e1.d1 = new D();
		e1.d1.i = 10;
		e1.j = 20;
		System.out.println("original object content:");
		System.out.println("e1.d1.i=" + e1.d1.i);
		System.out.println("e1.j=" + e1.j);
		System.out.println(".............");

		E e2 = (E) e1.clone();
		System.out.println("duplicate coppy:");
		System.out.println("e2.d1.i=" + e2.d1.i);
		System.out.println("e2.j=" + e2.j);
		System.out.println("............");

		System.out.println("chance in clone object content:");
		e2.d1.i = 100;
		e2.j = 200;
		System.out.println("e1.d1.i=" + e1.d1.i);
		System.out.println("e1.j=" + e1.j);

		System.out.println("change in original getting reflect to duplicate");
		e1.d1.i = 500;
		e1.j = 600;
		System.out.println("duplicate coppy:");
		System.out.println("e2.d1.i=" + e2.d1.i);
		System.out.println("e2.j=" + e2.j);
	}
}
