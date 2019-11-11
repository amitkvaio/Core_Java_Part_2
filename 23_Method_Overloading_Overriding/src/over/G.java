package over;

abstract class G {
	abstract void test1();

	abstract void test1(int i);

	void test1(int i, int j) {
		System.out.println("from test1(int i, int j)");
	}
}

/*
all test1() method have different signature so test1() method is overlaoded method
*/