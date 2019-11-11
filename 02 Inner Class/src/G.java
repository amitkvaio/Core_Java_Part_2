
public class G
{
	class H
	{
		
	}
	
	static class I
	{
		
	}
	public static void main(String[] args)
	{
		H h1 = null;//h1 is of H type ,here H is using for data type purpose.
		I i1 = null;// i1 is of I type ,here I is using for data type purpose.
		//h1 = new H();//h1 is of H type , but we are not using H is like data type 
		//we are using H for creating the object  of H, so it is not applicable here
		i1 = new I();
		System.out.println("done");
	}
}

/*
if the class is ueses for data type purpose then we can use that class any where

*/