package field;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class A {
	int atttr1;
	public String attr2;
	private A a1;
	protected boolean b1;
	private int lara;

	int test1() {
		return 0;
	}

	void test2() {

	}
}

public class Manager1 {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("field.A");

		Method[] methods = c1.getDeclaredMethods();

		for (Method m1 : methods) {
			System.out.println("NAME:" + m1.getName());
			System.out.println("MODIFIER:" + m1.toGenericString());
			System.out.println("TOsTRING=" + m1.toString());
			System.out.println("Method return type:" + m1.getReturnType());
			System.out.println(m1.getDefaultValue());
			System.out.println("................");
		}

	}
}
