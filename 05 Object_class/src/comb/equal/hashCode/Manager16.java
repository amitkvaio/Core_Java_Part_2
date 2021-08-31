package comb.equal.hashCode;
class X {
	int i, j;

	X(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public String toString() {
		return "i=" + i + ",j=" + j;
	}
//	public boolean equals(Object obj)
//	{
//		return (obj instanceof X &&
//				
//				i==((X)obj).i   &&
//				j==((X)obj).j);
//	}
	public int hashCode() {
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int hash = s1.hashCode();
//		int hash1 = s2.hashCode();
//		hash = hash+hash1;
		// hash+=s2.hashCode();
		hash = hash + s2.hashCode();
		return hash;
	}
}

public class Manager16 {
	public static void main(String[] args) {
		X x1 = new X(9, 20);
		X x2 = new X(20, 9);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x1.equals(x2));
		System.out.println(x1.hashCode());
		System.out.println(x2.hashCode());
	}
}
