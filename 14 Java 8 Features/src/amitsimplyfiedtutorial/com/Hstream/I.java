package amitsimplyfiedtutorial.com.Hstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Customize sorting
public class I {
	public static void main(String[] args) {
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		listEmp.add(new Employee("Samrat", 30, 70.0, true, 65000));
		listEmp.add(new Employee("Deepak", 45, 75.0, false, 75000));
		listEmp.add(new Employee("Triveni", 12, 55.0, true, 85000));
		listEmp.add(new Employee("Raja", 05, 50.0, true, 45000));
		listEmp.add(new Employee("Amit", 40, 62.0, true, 46000));

		System.out.println("Given List of Employee are :");
		display(listEmp);

		List<Employee> listEmp1 = listEmp.stream().sorted((e1, e2) -> e1.geteName().compareTo(e2.geteName()))
				.collect(Collectors.toList());
		System.out.println("After sorting based on emp Name");
		display(listEmp1);
		System.out.println("Sorting based on emp id");
		List<Employee> listEmp2 = listEmp.stream()
				.sorted((e1, e2) -> Integer.valueOf(e1.getEmpId()).compareTo(e2.getEmpId()))
				.collect(Collectors.toList());
		display(listEmp2);
		System.out.println("*******888888888888********");
		List<Employee> listEmp3 = listEmp.stream()
				.sorted((e1, e2) ->e1.compare(e1, e2))
				.collect(Collectors.toList());
		display(listEmp3);
	}

	public static void display(List<Employee> list) {
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}
