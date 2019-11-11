package getclass;

import java.lang.reflect.Method;

class G {
	public void test(int i, String s1) {
		System.out.println("test:" + i);
		System.out.println("test:" + s1);
	}

}

public class Manager6 {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("getclass.G");
		Object obj = c1.newInstance();
		((G) obj).test(10, "abc");
		System.out.println("========");
		Method m1 = c1.getDeclaredMethod("test", int.class, String.class);
		m1.invoke(obj, 20, "xyz");// calling stmt of test() method

	}

}
