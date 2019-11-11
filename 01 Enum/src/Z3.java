class Z3
{
	enum E
	{
		t1, t2, t3, t4;

		void method()
		{
			System.out.println("method");
		}
	}

	public static void main(String[] args)
	{
		E e1 = E.t1;
		System.out.println(e1);
		e1.method();
		E e2 = E.t2;
		System.out.println(e2);
		e2.method();
	}
}
