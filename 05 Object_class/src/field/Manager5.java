package field;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class P {
	String firstName;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}
}

public class Manager5 {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("field.P");

		Field f1 = c1.getDeclaredField("firstName");

		Object obj = c1.newInstance();

		if (f1 != null) {
			String methodName = "setFirstName";
			Method m1 = c1.getDeclaredMethod(methodName, f1.getType());

			m1.invoke(obj, "abc");
		}

		String s1 = ((P) obj).getFirstName();
		System.out.println(s1);

	}
}
