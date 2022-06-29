package amitsimplyfiedtutorial.com.Qfaq;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int salary;
	private String name;

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static List<Employee> getListOfEmployee(){
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("amit", 20000));
		empList.add(new Employee("kumar", 30000));
		empList.add(new Employee("niraj", 40002));
		empList.add(new Employee("sonu", 7856));
		empList.add(new Employee("tiwari", 200));
		empList.add(new Employee("akhil", 50000));
		return empList;

	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}
}
