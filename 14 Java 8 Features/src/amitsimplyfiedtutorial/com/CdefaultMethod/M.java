package amitsimplyfiedtutorial.com.CdefaultMethod;
interface L {
	public static void test() {
		System.out.println("Interface L static method () test()");
	}
}
public class M implements L {
	
	//it’s valid but not overriding. 
	public static void test() {
		System.out.println("Interface M static method () test()");
	}
	public static void main(String[] args) {
		test();
		L.test();
	}
}
/*
-- As interface static methods by default not available to the implementation class,
	overriding concept is not applicable. 
	
-- Based on our requirement we can define exactly same method in the implementation class,
	it’s valid but not overriding. 
*/
