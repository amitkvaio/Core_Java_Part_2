package throw1;

public class D
{
	static ArithmeticException ae = new ArithmeticException();
	
	public static void main(String[] args)
	{
		throw ae;
	}
}
