package getclass;

class D {

}

public class Manager3 {
	public static void main(String[] args) {
		D d1 = new D();
		Class c1 = d1.getClass();

		Class c2 = null;
		try {
			c2 = Class.forName("getclass.D");

		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

		Class c3 = D.class;

		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
		System.out.println(c3 == c1);

	}
}
/*
 
 3rd way to create the Class object of the particular class
 
 Class c3=D.class;

 */


