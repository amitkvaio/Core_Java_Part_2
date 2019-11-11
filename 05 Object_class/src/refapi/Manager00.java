package refapi;
class A
{
	
}
public class Manager00
{
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A();
		
		System.out.println("a1="+ a1);
		System.out.println("a2="+ a2);
		System.out.println(a1==a2);//returning false
		System.out.println("...........");
		
		Class c1 = a1.getClass();
		Class c2 = a2.getClass();
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
	
		System.out.println(c1==c2);
		System.out.println(".............");
		
		System.out.println("done");
	}
}

/*

public final Class getClass()
{
	The java.lang.Object.getClass() method returns the runtime class of an object.
}
A is a subclass to object class form the object class getClass() calling by a1 and a2
for A class java.lang CLASS object is same.


*/