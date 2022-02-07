package amitsimplyfiedtutorial.com.CdefaultMethod;

interface E {
	default void test() {
		System.out.println("Interface E default test() method");
	}
}
public class D implements E {
	
	@Override
	public void test() {
		System.out.println("Overrided method test");
	}
	
	public static void main(String[] args) {
		D d = new D();
		d.test();
	}
}

/*

--	Interface default methods are by-default available to all implementation classes.
--	Based on requirement implementation class can use these default methods directly or can override. 

*/