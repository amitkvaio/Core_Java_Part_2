package comb.equal.hashCode;
class R {
	int i, j;
	double weight;

	R(int i, int j, double weight) {
		this.i = i;
		this.j = j;
		this.weight = weight;
	}
	public boolean equals(Object obj) {
		return (obj instanceof R && i == ((R) obj).i && j == ((R) obj).j && weight == ((R) obj).weight);
	}
}

public class Manager10 {
	public static void main(String[] args) {
		R r1 = new R(10, 20, 9.98);
		R r2 = new R(10, 20, 9.98);
		System.out.println(r1.equals(r2));
	}
}
