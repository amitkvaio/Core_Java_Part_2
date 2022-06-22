package amitsimplyfiedtutorial.com.Hstream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of employee, write a Java 8 code to get the names of top 3 performing Employee?
public class V {
	public static void main(String[] args) {
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		listEmp.add(new Employee("Samrat", 30, 70.0, true, 65000));
		listEmp.add(new Employee("Deepak", 45, 75.0, false, 75000));
		listEmp.add(new Employee("Triveni", 12, 55.0, true, 85000));
		listEmp.add(new Employee("Raja", 05, 50.0, true, 45000));
		listEmp.add(new Employee("Amit", 40, 62.0, true, 46000));
		
		
		 List<Employee> result =
		listEmp.stream()
		.sorted(Comparator.comparingLong(Employee::getSalary).reversed())
		.limit(3)
		.collect(Collectors.toList());
	
		 System.out.println(result);
	}
}
