enum V
{
	C1, C2, C3;
	V() {
		System.out.println("V()");
	}
}

class W
{
	public static void main(String[] args)
	{
		//V v1 = V.C3;
		System.out.println(V.C1);
		System.out.println(V.C2);
	}
}
/*
inside the enum it is possible to declare constructors. 
That constructors will be executed for each and every constant. 
If we are declaring 5 constants then 5 times constructor will be executed.

Inside the enum if we are declaring only constants the semicolon is optional.

Inside the enum if we are declaring group of constants and constructors at that 
situation the group of constants must be first line of the enum must ends with semicolon.
*/