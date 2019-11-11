
class G1
{
	class H1
	{
		
	}
	
	static class I1
	{
		
	}
	public static void main(String[] args)
	{
		H1 h1 = null;
		I1 i1=  null;
		
		h1 = new G1().new H1();
	}
}

/*
if we want to create the object of class H1 inside the main method we need outer class
reference variable e.i outer class OBJECT
from G Object we  are creating H1 OBJECT
*/