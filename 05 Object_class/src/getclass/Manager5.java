package getclass;

import java.lang.reflect.Method;

class F {
	public void test1() {
		System.out.println("test1");
	}

	public void test2() {
		System.out.println("test2");
	}

}

public class Manager5 {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("getclass.F");
		F f1 = (F) c1.newInstance();
		f1.test1();
		f1.test2();
		System.out.println("--------");

		F a1 = new F();
		a1.test1();
		a1.test2();

		
		System.out.println("..............");
		Object obj = c1.newInstance();
		Method m1 = c1.getDeclaredMethod("test1");
		Method m2 = c1.getDeclaredMethod("test2");
		m1.invoke(obj);
		m2.invoke(obj);
		System.out.println("------------------");
		System.out.println("done");

	}

}
