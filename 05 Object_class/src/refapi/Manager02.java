package refapi;
class C
{
	
}

public class Manager02
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class c1 = Class.forName("refapi.C");//return the runtime class of an object.
		System.out.println("forNmae()="+c1);
		
		C obj1 = new C();
		Class c2 = obj1.getClass();//return the runtime class of an object
		System.out.println("getClass()="+c2);
		
		System.out.println(c1==c2);
	}
}

/*
 public static Class forName(String className)throws ClassNotFoundException
 
 loads the class and returns the runtime Class  of an object  for the specified class. 
 
  Throws: ClassNotFoundException
    If the Class could not be found. 
    
 Returns the runtime Class  of an object  for the specified class. 

*/