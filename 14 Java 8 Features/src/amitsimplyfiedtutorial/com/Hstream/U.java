package amitsimplyfiedtutorial.com.Hstream;
//Given a list of employee, write a Java 8 code to partition the Employee who got salary above 50000 from those who didn’t?
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class U {
	public static void main(String[] args) {
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		listEmp.add(new Employee("Samrat", 30, 70.0, true, 65000));
		listEmp.add(new Employee("Deepak", 45, 75.0, false, 75000));
		listEmp.add(new Employee("Triveni", 12, 55.0, true, 85000));
		listEmp.add(new Employee("Raja", 05, 50.0, true, 45000));
		listEmp.add(new Employee("Amit", 40, 62.0, true, 46000));
		
		Map<Boolean, List<Employee>> listMap =
		listEmp.stream().collect(Collectors.partitioningBy(emp->emp.getSalary()>50000));
		System.out.println(listMap);
	}
}
