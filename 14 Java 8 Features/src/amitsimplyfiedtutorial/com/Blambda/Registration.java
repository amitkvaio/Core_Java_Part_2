package amitsimplyfiedtutorial.com.Blambda;

@FunctionalInterface
public interface Registration {
	public void register();
	default void resign() {
		
	}
	public static String validateName(String name) {
		//validate the name
		return name;
	}
}

class Student implements Registration {
	@Override
	public void register() {
		// TODO Auto-generated method stub

	}
	@Override
	public void resign() {
		// TODO Auto-generated method stub
		Registration.super.resign();
	}
}

class Employee implements Registration {
	@Override
	public void register() {
		String validateName = Registration.validateName("Raja");
		//
		//
		//

	}
	@Override
	public void resign() {
		// TODO Auto-generated method stub
		Registration.super.resign();
	}
}

class Player implements Registration {
	@Override
	public void register() {
		// TODO Auto-generated method stub

	}
	@Override
	public void resign() {
		// TODO Auto-generated method stub
		Registration.super.resign();
	}
}

/*--
--
---*/
class Worker implements Registration {
	@Override
	public void register() {
		// TODO Auto-generated method stub

	}
}
