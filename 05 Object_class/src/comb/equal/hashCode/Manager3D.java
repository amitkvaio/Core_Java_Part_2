package comb.equal.hashCode;
class D1 {
	int i;

	D1(int i) {
		this.i = i;
	}
}

public class Manager3D {
	public static void main(String[] args) {
		D1 d1 = new D1(90);
		D1 d2 = d1;
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
		// calling equals() method of Object class and it internally using the equal
		// operator.
	}
}
