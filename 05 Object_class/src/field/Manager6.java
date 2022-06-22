package field;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

class Q {
	private int attr1;
	private double attr2;

	public int getAtt1() {
		return attr1;
	}

	public void setAttr1(int attr1) {
		this.attr1 = attr1;
	}

	public double getAttr2() {
		return attr2;
	}

	public void setAttr2(double attr2) {
		this.attr2 = attr2;
	}

	@Override
	public String toString() {
		return "attr1:" + attr1 + ", attr2:" + attr2;
	}
}

class R {
	private String firstName;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {

		return "firstName:" + firstName + ",age:" + age;
	}

}

public class Manager6 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the class name");

		String className = sc.next();
		Class c1 = Class.forName(className);

		Field[] fields = c1.getDeclaredFields();
		System.out.println("availabe attributes in" + className);

		for (Field f1 : fields) {
			System.out.println(f1.getName());
			System.out.println(f1.getType());
		}

		System.out.println("enter the name of the attrinute");
		String attrName = sc.next();
		System.out.println("enter the attribute values:");
		String attrValue = sc.next();
		Field f1 = c1.getDeclaredField(attrName);

		String methodName = "set" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1);

		Method m1 = c1.getDeclaredMethod(methodName, f1.getType());

		Object obj = c1.newInstance();

		if (f1.getType().equals(int.class)) {
			m1.invoke(obj, Integer.parseInt(attrValue));
		}

		if (f1.getType().equals(Double.class)) {
			m1.invoke(obj, Double.parseDouble(attrValue));

		}

		if (f1.getType().equals(String.class)) {
			m1.invoke(obj, attrValue);
		}
		System.out.println(obj);

	}
}
