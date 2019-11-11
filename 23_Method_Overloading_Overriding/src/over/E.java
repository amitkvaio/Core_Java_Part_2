package over;

interface E {
	void test1(int i, int j);
}

abstract class F implements E {
	public void test1(int i, double j) {
		System.out.println("from test1()");
	}
}

class G1 extends F implements E {
	public void test1(int i, int j) {
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("from test1() method of E class");
	}

	public static void main(String[] args) {
		G1 g = new G1();
		g.test1(10, 10.12);
		g.test1(10, 20);
		System.out.println("done");
	}
}
//F class is not implemented E interface method that is why we
//declare class F as abstract