import java.lang.reflect.Constructor;

public class CobjectCreation {

	public CobjectCreation() {
		System.out.println("Constructor()");
	}

	public void test1() {
		System.out.println("From test1() method!!");
	}

	public static void main(String[] args) throws Exception {
		Constructor<CobjectCreation> constructor = CobjectCreation.class.getConstructor();
		CobjectCreation object = constructor.newInstance();
		object.test1();
		System.out.println("Done");
		
		//int 89amit=123;
		
		Constructor<Amit> amitObj = Amit.class.getConstructor();
		Amit amit =amitObj.newInstance();
		amit.callme();
	}
}

class Amit {
	public Amit() {
		System.out.println("Default constructor");
	}

	public void callme() {
		System.out.println("Hi Please call me.");
	}

}
