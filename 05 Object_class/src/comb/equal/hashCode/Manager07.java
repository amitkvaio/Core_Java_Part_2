package comb.equal.hashCode;
class H {
	int i;
	double d;

	H(int i, double d) {
		this.i = i;
		this.d = d;
	}
	public String toString() {
		return "i=" + i + ",d=" + d;
	}
	public boolean equals(Object obj) {
		H myObj = (H) obj;
		boolean flag = (myObj.i == this.i && this.d == myObj.d);
		return flag;
	}
}

public class Manager07 {
	public static void main(String[] args) {
		H h1 = new H(9, 90.9);
		H h2 = new H(9, 20.9);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h1.equals(h2));
	}
}
