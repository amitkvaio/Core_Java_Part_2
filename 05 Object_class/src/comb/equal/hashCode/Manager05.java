package comb.equal.hashCode;
class F {
	int i;

	F(int i) {
		this.i = i;
	}
	public boolean equals(Object obj) {
		F myObj = (F) obj;// down casting into f type
		return this.i == myObj.i;
		// return this==obj;
	}
}

public class Manager05 {
	public static void main(String[] args) {
		F f1 = new F(10);
		F f2 = new F(10);
		System.out.println(f1.equals(f2));
	}
}
