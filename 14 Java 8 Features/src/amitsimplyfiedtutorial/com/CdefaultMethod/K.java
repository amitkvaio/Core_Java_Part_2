package amitsimplyfiedtutorial.com.CdefaultMethod;
// interface with static method
interface J {
	public static void sum(int a ,int b) {
		System.out.println("Interface J static method () sum: "+ ( a+b));
	}
}

public class K implements J{
	public static void main(String[] args) {
		K k  = new K();
		//k.sum(10,20); // CTE
		//K.sum(10,20); // CTE -
		J.sum(10, 20);
	}
}

/*

--	Static methods inside interface: 
--	From 1.8 version onwards in addition to default methods we can write static methods also inside 
	interface to define utility functions. 
	
--	Interface static methods by-default not available to the implementation classes hence by using 
		implementation class reference we can’t call interface static methods.
--	We should call interface static methods by using interface name. 

*/