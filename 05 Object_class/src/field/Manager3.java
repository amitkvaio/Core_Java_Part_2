package field;

import java.lang.reflect.Method;
import java.util.Arrays;

class C {
	void test1() {

	}

	public final double test2(int i) {
		return 20;
	}

	public synchronized static void test3(double d) {

	}

}

public class Manager3 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c1 = Class.forName("field.C");

		Method[] methods = c1.getDeclaredMethods();

		for (Method m1 : methods) {
			System.out.println("NAME=" + m1.getName());
			System.out.println("RETURN TYPE=" + m1.getReturnType());
			// System.out.println("PARAMETER TYPE="+m1.getParameterTypes());
			System.out.println("PARAMETER TYPE1=" + Arrays.toString(m1.getParameterTypes()));

			System.out.println("..................................");

		}
	}
}
