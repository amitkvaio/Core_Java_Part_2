package comb.equal.hashCode;
class C {
	int i;

	C(int i) {
		this.i = i;
	}
}

public class Manager02 {
	public static void main(String[] args) {
		C c1 = new C(10);
		C c2 = new C(10);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println("done");
	}
}
/*
 * equals() internally using == operator equals() method from object class.
 * object class equals method internally using the equals operator between c1
 * and c2.
 */