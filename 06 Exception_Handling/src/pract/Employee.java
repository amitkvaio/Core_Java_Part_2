package pract;

public class Employee {
	int id;
	String name;
	Employee(int id, String name) {
		id = id;
		name = name;
	}
	void show() {
		System.out.println(id + " " + name);
	}
	public static void main(String args[]) {
		Employee e1 = new Employee(111, "Harry");
		Employee e2 = new Employee(112, "Jacy");
		e1.show();
		e2.show();
		 int num1 = 999;
		 int num3 = 9_9_9;
		 System.out.println("num3::"+num3);
	}

}
