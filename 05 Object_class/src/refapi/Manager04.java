package refapi;

import java.lang.reflect.Method;

class E
{
	public void test()
	{
		System.out.println("test()");
	}
}

public class Manager04
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("refapi.E");
		System.out.println("c1=" + c1);
		
		Object obj = c1.newInstance();
		System.out.println("obj=" + obj);
		System.out.println(".............");
		
	
		Method m1 = c1.getDeclaredMethod("test");
		m1.invoke(obj);
		System.out.println("done");
	}
}
/*
Invokes the underlying method represented by this Method object, 
on the specified object with the specified parameters. 
Individual parameters are automatically unwrapped to match primitive formal parameters, 
and both primitive and reference parameters are subject to 
method invocation conversions as necessary. 

*/