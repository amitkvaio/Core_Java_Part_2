package amitsimplyfiedtutorial.com.Blambda;
@FunctionalInterface
public interface A {
	public abstract void  m1();
	
	default void m2() {
		System.out.println("Deault me2()");
	}
	
	default void m3() {
		System.out.println("Deault me3()");
	}
	default void m4() {
		System.out.println("Deault me4()");
	}
	
	public static void test2() {
		System.out.println("From static test 2()");
	}
	
	public static void test3() {
		System.out.println("From static test 3()");
	}
	
	public static void test4() {
		System.out.println("From static test 4()");
	}
}
/*
-- Inside functional interface in addition to single Abstract method(SAM).
-- We can  write any number of default and static methods. 
-- like above
-- More about default method
https://dzone.com/articles/interface-default-methods-java
*/