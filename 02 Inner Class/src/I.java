
public class I
{
	public static void main(String[] args)
	{
		class A// L-I-C
		{
			int i = 10;
		}
		A a1 = new A();
		System.out.println(a1.i);
		a1.i = 20;
		System.out.println(a1.i);
	}
}


/*
Method local inner classes:-
1. Declaring the class inside the method is called method local inner classes.
2. In the case of the method local inner classes the class has the scope up to the respective method.
3. Method local inner classes do not have the scope of the outside of the respective method.
4. whenever the method is completed
5. we are able to perform any operations of method local inner class only inside the respective method.

Syntax:-
class Outer
{
	void m1()
	{
		class inner
		{
		};
	}
}

*/