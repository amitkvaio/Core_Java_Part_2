package coma.tostring;
class F {
	String s1;
	int i;

	F(String s1, int i) {
		this.s1 = s1;
		this.i = i;
	}
	public String toString() {
		// System.out.println("toString()");
		return "s1=" + s1 + ", i=" + i;
	}
}

public class Manager06 {
	public static void main(String[] args) {
		F f1 = new F("mandal", 22);
		F f2 = new F("amit", 33);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println("done");
	}
}
