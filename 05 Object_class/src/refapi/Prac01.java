package refapi;

import java.lang.reflect.Method;

class PR
{
	void test()
	{
		System.out.println("from test()");
	}
}

public class Prac01
{
	public static void main(String[] args) throws Exception
	
	{
		Class c1 = Class.forName("refapi.PR");
		//forName() method of class Class loads the class PR into the RAM and 
		//returns a Class object. 
		//The Class object cl refers PR.class.
		
		PR pr =(PR)c1.newInstance();
		pr.test();
		
		Method m2 = c1.getDeclaredMethod("test");
		m2.invoke(pr);
	}  	   
}

/*


Class ref = Class.forName("DemoClass");
DemoClass obj = (DemoClass) ref.newInstance();

Class.forName() loads the class in memory. To create an instance of this class, 
we need to use newInstance().


Class.forName actually loads the class in Java but doesn’t create any Object. 
To Create an Object of the Class you have to use newInstance method of Class class.

*/