//Ex:-inside the enum it is possible to provide main method.
enum Z6
{
	Z1,Z2,Z3,Z4;
	private Z6() {

		System.out.println("Z6()-CONSTRUCTOR");
	}
	public static void main(String[] args)
	{
		System.out.println("-----from the main method-----");
		System.out.println(Z1);
		System.out.println(Z1.toString());
		System.out.println(Z6.Z1);
		
		Z6 z1 = Z6.Z1;
		System.out.println(z1);
		System.out.println("-------------------");
		
		Z6[] z6 = Z6.values();
		for (Z6 z62 : z6)
		{
			System.out.println(z62 +"-index-"+z62.ordinal());
		}
	}
}

//inside the enums it is possible to declare group of constants and constructors and main method