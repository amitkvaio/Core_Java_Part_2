package amitsimplyfiedtutorial.com.Qfaq;

import java.util.List;
import java.util.stream.Collectors;

//Join the all employee names with “,” using java 8?
public class Manager18 {
	public static void main(String[] args) {
		List<Employee> empList = Employee.getListOfEmployee();
		String str = empList.stream().map(emp->emp.getName())
		.collect(Collectors.joining(","));
		System.out.println(str);
	}
}
