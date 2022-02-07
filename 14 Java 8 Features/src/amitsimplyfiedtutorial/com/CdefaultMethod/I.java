package amitsimplyfiedtutorial.com.CdefaultMethod;

interface G{
	default void test() {
		System.out.println("From G interface test()");
	}
}

interface H{
	default void test() {
		System.out.println("From H interface test()");
	}
}

public class I implements G,H{

	@Override
	public void test() {
		System.out.println("Class I  overided test()");
		G.super.test();
		H.super.test();
	}
	 
	public static void main(String[] args) {
		G  g = new I();
		g.test();
		System.out.println("============");
	}
}
/*

--	Default method vs multiple inheritance 
--	Two interfaces can contain default method with same signature then there may be a chance of 
		ambiguity problem(diamond problem) to the implementation class.
--	To overcome this problem compulsory we should override default method in the implementation 
		class otherwise we get compile time error. 

--	How to override default method in the implementation class? 
--	In the implementation class we can provide complete new implementation or we can call any 
--	interface method as follows. 
	interfacename.super.m1(); Example G.super.test(); 
*/