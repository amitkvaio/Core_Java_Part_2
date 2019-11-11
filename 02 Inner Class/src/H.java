
class H
{
	class I
	{

	}

	static class J
	{

	}
}

class Manager
{
	public static void main(String[] args)
	{
		H.I obj1 = null;
		H.J obj2 = null;

		obj1 = new H().new I();

		H h1 = new H();
		obj1 = h1.new I();

		obj2 = new H.J();
		System.out.println("done");

	}
}
