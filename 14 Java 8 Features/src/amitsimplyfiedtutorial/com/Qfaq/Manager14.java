package amitsimplyfiedtutorial.com.Qfaq;

import java.util.List;
import java.util.stream.Collectors;

/*
Employee {

private int salary;
private String name;
}


listEmp <Employee>

To filter out name of the Employee in capital letter with salary greater than 30000. 
*/
public class Manager14 {
	private static List<String> collect;

	public static void main(String[] args) {
		List<Employee> listEmp = Employee.getListOfEmployee();
		//listEmp.stream().filter(emp->emp.getSalary() > 30000 && emp.getName().toUpperCase()).collect(Collectors.toList()); 
		collect = listEmp.stream().filter(emp->emp.getSalary() == 30000)
				.map(emp->emp.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
	}
}
