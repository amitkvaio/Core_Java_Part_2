package comb.equal.hashCode;
class G {
	int i, j;

	G(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public boolean equals(Object obj) {
		G myObj = (G) obj;// argument is down casting into G type
		return i == myObj.i && j == myObj.j;
		// return this.i == myObj.i && this.j==myObj.j;
	}
}

public class Manager06 {
	public static void main(String[] args) {
		G g1 = new G(1, 2);
		G g2 = new G(1, 2);
		System.out.println(g1.equals(g2));
	}
}
