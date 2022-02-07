package amitsimplyfiedtutorial.com.Blambda;
@FunctionalInterface
interface Test {
	public void test1();
	static void testB() {System.out.println("I am testB static method from the Test Interface ");};
	default void testC() {System.out.println("I am from testC() default method");};
}

/*//  this is without using lambda expression.
public class M implements Test{
	@Override
	public void test1() {
		System.out.println("Test1() implemented method");
	}
	
	public static void main(String[] args) {
		Test test = new M();
		test.test1();
	}
}
*/


// Using lambda expression.
public class M{
	public static void main(String[] args) {
		Test test1 = ()-> System.out.println("Test1() implemented method");
		Test test2 = ()-> { System.out.println("If method does not having argument - curly brace is optional"); };
		Test test3 = ()->{
			for (int i = 0; i <= 5; i++) {
				System.out.println("From test3");
			}
		};
		
		test1.test1();
		test2.test1();
		test3.test1();
		test1.testC();
		Test.testB();
	}
}
