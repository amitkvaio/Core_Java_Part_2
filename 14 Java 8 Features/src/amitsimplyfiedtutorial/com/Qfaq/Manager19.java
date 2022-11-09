package amitsimplyfiedtutorial.com.Qfaq;

import java.util.List;
import java.util.Optional;

//Given a list of employee, find maximum age of employee?
public class Manager19 {
	public static void main(String[] args) {
		List<Employee> empList = Employee.getListOfEmployee();
		Optional<Employee> emp = empList.stream().max((emp1,emp2)->emp1.getSalary()-emp2.getSalary());
		if(emp.isPresent())
            System.out.println("Maximum age of Employee: "+emp.get());
	}
}
