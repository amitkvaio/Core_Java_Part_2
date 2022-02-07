package amitsimplyfiedtutorial.com.CdefaultMethod;

public interface F {
	/*@Override
	default int hashCode() {
		return 10;
	}*/
}
/*

--	We can’t override object class methods as default methods inside interface otherwise 
--	we get compile time error. 

Reason: 
--	object class methods are by-default available to every java class hence it’s not required to 
		bring through default methods. 
*/
