package amitsimplyfiedtutorial.com.Blambda;
@FunctionalInterface
public interface K {
	public void test1();
	default void t() {};
	static void testA() {};
	static void testB() {};
}

interface L extends K{
	public void test2();
	public void test3();
	public void test4();
	public void test5();
}
// This is the normal interface so that code compiles without any error



/*

--	In the above example in both parent & child interface we can write any number of default methods 
--	and there are no restrictions.Restrictions are applicable only for abstract methods. 

--	An interface which is having only one abstract method (**having multiple default 
		methods and static methods) is called as Function Interface. 

--	Before JDK 1.8 (JDK<=1.7), we used to define one implementation class and create 
		object to that implementation class. Lambda Expression replaces Implementation 
		class and creating object to that class. 


--	FunctionalInterface Vs Lambda Expressions: 
--	------------------------------------------
--	Once we write Lambda expressions to invoke it’s functionality, then FunctionalInterface is required. 
--	We can use FunctionalInterface reference to refer Lambda Expression. 
--	Where ever FunctionalInterface concept is applicable there we can use Lambda Expressions 
*/










