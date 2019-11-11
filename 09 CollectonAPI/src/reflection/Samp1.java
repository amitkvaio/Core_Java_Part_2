package reflection;

public class Samp1
{

}

class Test1
{  
	void printName(Object obj)
	{  
		  Class c=obj.getClass();    
		  System.out.println(c.getName());  
	}  
		  
	public static void main(String args[])throws Exception
	{  
		   Samp1 s=new Samp1();  
		   
		   Test1 t=new Test1();  
		   t.printName(s);  
	}  
}



/*
2) getClass() method of Object class

It returns the instance of Class class. It should be used if you know the type. Moreover, 
it can be used with primitives. 

*/