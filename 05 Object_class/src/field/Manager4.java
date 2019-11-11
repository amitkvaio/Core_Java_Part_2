package field;

import java.lang.reflect.Modifier;

abstract class E {

}

final class F {

}

class G extends E {

}

public class Manager4 {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("field.E");
		Class c2 = Class.forName("field.F");
		Class c3 = Class.forName("field.G");

		System.out.println("Modifier1=" + Modifier.toString(c1.getModifiers()));
		System.out.println("Modifier2=" + Modifier.toString(c2.getModifiers()));
		System.out.println("Modifier3=" + Modifier.toString(c3.getModifiers()));

		System.out.println(".................................");

		System.out.println(c1.getSuperclass());
		System.out.println(c2.getSuperclass());
		System.out.println(c3.getSuperclass());

		System.out.println(".................");
		System.out.println("DONE");

	}
}
