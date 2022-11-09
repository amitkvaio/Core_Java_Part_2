package amitsimplyfiedtutorial.com.Blambda;
@FunctionalInterface
public interface E {
	public abstract void reg();
}

@FunctionalInterface
interface F extends E{
}

interface Stu extends E{}
interface CEO extends E{}
interface Employee111 extends E{}



/*

--	FunctionalInterface with respect to Inheritance: 
--	If an interface extends FunctionalInterface and child interface doesn’t 
--	contain any abstract method then child interface is also FunctionalInterface 

*/

class IBMEmpl implements Employee111{

	@Override
	public void reg() {
		 
		
	}
	
}