package amitsimplyfiedtutorial.com.Blambda;

@FunctionalInterface
interface T{
	public void test();
}

public class U {
	static int  x = 10;
	
	public static void test2() {
		System.out.println("From U test2() method");
	}
	
	public static void test3() {
		int y = 20;
		R r = () -> {
			System.out.println("x->"+x);
			System.out.println("y->"+y);
			x=888;
			//y=99;
			test2();
		};
		r.test();
	}
	public static void main(String[] args) {
		test3();
	}
}

/*

--	From lambda expression we can access enclosing class variables and enclosing method variables
	directly. 
--	The local variables referenced from lambda expression are implicitly final and hence we can’t 
	perform re-assignment for those  local variables otherwise we get compile time error 
 
*/