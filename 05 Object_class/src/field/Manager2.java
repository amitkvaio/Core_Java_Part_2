package field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class B {
	int field1;
	protected Double field2;
	public A field3;
	public static final int MAX_VALUE = 20;

}

public class Manager2 {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("field.B");

		Field[] fields = c1.getDeclaredFields();

		for (Field f1 : fields) {
			System.out.println("NAME=" + f1.getName());
			System.out.println("TYPE=" + f1.getType());
			System.out.println("MODIFIER=" + Modifier.toString(f1.getModifiers()));
			System.out.println("...............");
		}
	}
}
