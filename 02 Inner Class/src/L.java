
public class L
{
	static void test()
	{
		System.out.println("1111");
		System.out.println("1111");
		System.out.println("1111");
	}
	public static void main(String[] args)
	{
		test();
		System.out.println("..............");
		test();
		System.out.println("..............");
		test();
		
	}
}
/*
Code is getting re-used compare to previous - it is better.
to achieve re-usability we are using  method level.
but security we are loosing because test() method might be used outside of this class.
it should be develop inside the main() method and use inside the main method itself.

*/