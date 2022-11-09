package amitsimplyfiedtutorial.com.Qfaq;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given the list of employee, group them by employee name?
*/
public class Manager17 {
	public static void main(String[] args) {
		List<Employee> empList = getListOfEmployee();
		Map<String, List<Employee>> out = empList.stream().collect(Collectors.groupingBy(emp->emp.getName()));
		System.out.println(out);
	}
	
	
	public static List<Employee> getListOfEmployee(){
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Amit", 20000));
		empList.add(new Employee("kumar", 30000));
		empList.add(new Employee("Kumar", 40002));
		empList.add(new Employee("Niraj", 7856));
		empList.add(new Employee("Amit", 200));
		empList.add(new Employee("Niraj", 50000));
		return empList;

	}
}
