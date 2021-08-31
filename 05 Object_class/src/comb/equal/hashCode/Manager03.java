package comb.equal.hashCode;
class D {
	int i, j, k;

	D(int m, int n, int l) {
		this.i = m;
		this.j = n;
		this.k = l;
	}
}

public class Manager03 {
	public static void main(String[] args) {
		D d1 = new D(56, 45, 44);
		System.out.println(d1.i);
//		D d2 = new D();
//		d1.i=56;
//		System.out.println(d2.i);
//		
		D d2= d1;
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		System.out.println("done");
	}
}
