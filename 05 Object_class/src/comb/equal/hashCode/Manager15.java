package comb.equal.hashCode;
class W {
	int i;
	String s1;

	W(int i, String s1) {
		this.i = i;
		this.s1 = s1;
	}
	public int hashCode() {
		String str = Integer.toString(i);
		int hash = str.hashCode();
		return hash;
	}
}

public class Manager15 {
	public static void main(String[] args) {
		W w1 = new W(10, "abc");
		W w2 = new W(10, "abc");
		System.out.println(w1.hashCode());
		System.out.println(w2.hashCode());
	}
}
