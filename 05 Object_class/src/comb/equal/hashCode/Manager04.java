package comb.equal.hashCode;
class E {
	int i;

	E(int j) {
		this.i = j;
	}
	public boolean equals(Object obj) {
		E myobj = (E) obj;
		return this == myobj ;
		// return this == obj;
	}
}

public class Manager04 {
	public static void main(String[] args) {
		E e1 = new E(90);
		E e2 = new E(90);
		E e3 = e1;
		System.out.println(e1.equals(e2));// e2 is auto up casting into object type
		System.out.println(e1.equals((Object) e2));
		System.out.println(e2.equals(e3));
		System.out.println(e3 == e1);
		System.out.println(e3.equals(e1));
	}
}
