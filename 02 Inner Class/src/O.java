
public class O
{
	public static void main(String[] args)
	{
		int i = 10;
		final int j = 20;
		class A
		{
			void test()
			{
				//System.out.println(i);
				System.out.println(j);
			}
		}
		System.out.println("done");
	}
}

/*

if we want to use local variable inside the local innner class then
that variable should be declare as final

Local variable can not be declare as static, private, protected, public transient and volatile
it will give the compile time error
*/