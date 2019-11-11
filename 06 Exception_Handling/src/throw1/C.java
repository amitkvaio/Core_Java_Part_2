package throw1;

public class C
{
	static ArithmeticException ae;
	public static void main(String[] args)
	{
		throw ae;
	}
	// It will throws the NPE becz ae is not initialized
}
