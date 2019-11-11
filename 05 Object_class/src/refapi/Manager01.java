package refapi;
class B
{
	
}

public class Manager01
{
	public static void main(String[] args)
	{
		B b1 = new B();
		B b2= new B();
		B b3 = new B();
		B b4 = new B();
	
		Class c1 = b1.getClass();
		Class c2 = b2.getClass();
		Class c3 = b3.getClass();
		Class c4 = b4.getClass();
		
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		System.out.println(c3==c4);
		System.out.println(c4==c1);
	}
}

//getClass() return the runtime object of an class.