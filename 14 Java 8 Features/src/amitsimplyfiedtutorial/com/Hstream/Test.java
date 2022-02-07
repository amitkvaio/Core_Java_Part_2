package amitsimplyfiedtutorial.com.Hstream;



public abstract class Test{
	public static void main(String[] args) {
		System.out.println("Main method");
	}
}

interface Aa{
	public abstract void test1();
	public abstract void test2();
}

abstract class Bb implements Aa{
	public abstract void test3();
}
