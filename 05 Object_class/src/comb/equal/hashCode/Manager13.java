package comb.equal.hashCode;
class U {
	int i;

	U(int i) {
		this.i = i;
	}
	public String toString() {
		return "i=" + i;
	}
	public boolean equals(Object obj) {
		return (obj instanceof U && this.i == ((U) obj).i);
	}
	public int hashCode() {
		return i;
	}
}

public class Manager13 {
	public static void main(String[] args) {
		U u1 = new U(90);
		U u2 = new U(90);
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
	}
}