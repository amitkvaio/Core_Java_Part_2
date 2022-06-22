package com.clone;

class DemoClone implements Cloneable {
	int i;

	public DemoClone(int i) {
		this.i = i;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "DemoClone [i=" + i + "]";
	}

}

public class Test implements Cloneable {
	int j;
	DemoClone d;

	public Test(int j, DemoClone d) {
		this.j = j;
		this.d = d;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Test t1 = (Test) super.clone();
		t1.d = (DemoClone) d.clone();
		return t1;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		DemoClone d = new DemoClone(10);
		Test t1 = new Test(20, d);
		System.out.println("t1->" + t1);
		Test t2 = (Test) t1.clone();
		System.out.println("t2->" + t2);

		t2.d.i = 30;

		System.out.println("t2->" + t2);
		System.out.println("t1->" + t1);

		t1.d.i = 1000;
		System.out.println("----");
		System.out.println("t2->" + t2);
		System.out.println("t1->" + t1);

	}

	@Override
	public String toString() {
		return "Test [j=" + j + ", d=" + d + "]";
	}
}
