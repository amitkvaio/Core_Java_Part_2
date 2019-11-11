package getclass;

import java.lang.reflect.Method;
import java.util.Scanner;

class H {
	public void test1() {
		System.out.println("from H.test1");

	}

}

class I {
	public void test2() {
		System.out.println("from I.test2");

	}

}

public class Manager7 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter class name");
		String className = sc.next();
		System.out.println("enter Method name");
		String methodName = sc.next();
		Class c1 = Class.forName(className);
		Object obj = c1.newInstance();
		Method m1 = c1.getDeclaredMethod(methodName);
		m1.invoke(obj);
		System.out.println("done");
	}

}
