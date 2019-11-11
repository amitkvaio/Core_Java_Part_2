package pack1;

public class C
{
	public static void main(String[] args)
	{
		System.out.println(1);
		assert true;
		
		System.out.println(2);
		System.out.println("done");
	}
}

/*
it will not give the assertion error
because the assert is true
it will only give the assertion error 
when assert become false

*/