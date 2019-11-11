import java.lang.reflect.Constructor;

public class CobjectCreation {
	public void test1() {
		System.out.println("From test1() method!!");
	}

	public static void main(String[] args) throws Exception {
		Constructor<CobjectCreation> constructor = CobjectCreation.class.getConstructor();
		CobjectCreation object = constructor.newInstance();
		object.test1();
		System.out.println("Done");
	}
}
