package getclass;

class C {

}

public class Manager2 {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("getclass.C");
		System.out.println("c1=" + c1);

		C obj1 = new C();
		Class c2 = obj1.getClass();

		System.out.println("c2=" + c2);
		System.out.println(c1 == c2);

	}
}
/*

first way to create the Class object 

C obj1=new C();
Class c2=obj1.getClass();


2nd way to create the Class object by supplying the class name as argument in the string format

Class c1=Class.forName("getclass.C");
*/