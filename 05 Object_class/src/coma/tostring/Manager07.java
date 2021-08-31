package coma.tostring;
class G {
	int i;

	G(int i) {
		this.i = i;
	}
	public String toString() {
		return "i=" + i;
	}
}

class H {
	G g1;
	int j;

	H(G g1, int j) {
		this.g1 = g1;
		this.j = j;
	}
	public String toString() {
//		String s1 = g1.toString()+",j="+ j;
//		return s1;
		return g1 + ",j=" + j;
		// return g1.toString() + ",j=" +j ;
	}
}

public class Manager07 {
	public static void main(String[] args) {
		G g1 = new G(90);
		H h1 = new H(g1, 20);
		System.out.println(g1);
		System.out.println(h1);
//		System.out.println("done");
	}
}
