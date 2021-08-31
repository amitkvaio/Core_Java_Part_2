package comb.equal.hashCode;
class V {
	int i, j;

	V(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public String toString() {
		return "i=" + i + ",j=" + j;
	}
	public boolean equals(Object obj) {
		return (obj instanceof V && i == ((V) obj).i && j == ((V) obj).j);
	}
	public int hashCode() {
		String s1 = Integer.toString(i);
		// System.out.println("s1 =" + s1);
		// calling the Wrapper class toString(arg), and converting integer value into
		// string and assign into s1
		String s2 = Integer.toString(j);
		// System.out.println("s2="+s2);
		int hash1 = s1.hashCode();
		// System.out.println("hash1.s1=" + hash1);
		int hash2 = s2.hashCode();
		// System.out.println("hash2.s2=" + hash2);
		// hash1+=s2.hashCode();
		hash1 = hash1 + hash2;
		// hash = hash+s2.hashCode();
		return hash1;
	}
}

public class Manager14 {
	public static void main(String[] args) {
		V v1 = new V(10, 40);
		V v2 = new V(40, 10);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
	}
}
