package amitsimplyfiedtutorial.com.CdefaultMethod;

interface B {
	default void test() {
		System.out.println("Interface A default test() method");
	}
}
public class C implements B {
	
	public static void main(String[] args) {
		C c = new C();
		c.test();
	}
}

/*
--	Default methods also known as defender methods or virtual extension methods. 
--	The main advantage of default methods is without effecting implementation classes we can add new 
		functionality to the interface(backward compatibility). 


*/
