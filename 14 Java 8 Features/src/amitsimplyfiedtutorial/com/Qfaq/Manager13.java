package amitsimplyfiedtutorial.com.Qfaq;

//List of employee name whose names start with character with A
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Manager13 {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Amit", 20000));
		empList.add(new Employee("Niraj", 3000));
		empList.add(new Employee("Suraj", 15002));
		empList.add(new Employee("Ankit", 7856));
		empList.add(new Employee("Kumar", 200));
		empList.add(new Employee("Ankur", 50000));
		
		empList.stream().filter(emp ->emp.getName().charAt(0)=='A')
		.collect(Collectors.toList()).forEach(x->System.out.println(x));
	}
}
