package amitsimplyfiedtutorial.com.Hstream;

import java.util.ArrayList;
import java.util.List;

public class J {
	public static void main(String[] args) {
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		listEmp.add(new Employee("Samrat", 30, 70.0, true, 65000));
		listEmp.add(new Employee("Deepak", 45, 75.0, false, 75000));
		listEmp.add(new Employee("Triveni", 12, 55.0, true, 85000));
		listEmp.add(new Employee("Raja", 05, 50.0, true, 45000));
		listEmp.add(new Employee("Amit", 40, 62.0, true, 46000));

		Employee emp=listEmp.stream().max((e1,e2)-> Long.valueOf(e1.getSalary()).compareTo(e2.getSalary())).get();
		System.out.println("Maximum salary  emp  details : "+emp);
		Employee emp1=listEmp.stream().min((e1,e2)-> Long.valueOf(e1.getSalary()).compareTo(e2.getSalary())).get();
		System.out.println("Minimum salary  emp  details : "+emp1);
	}

	public static void display(List<Employee> list) {
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}
/*

IV.Processing by min() and max() methods 
 
min(Comparator c) 
returns minimum value according to specified comparator. 
 
max(Comparator c) 
returns maximum value according to specified comparator 

String min=l.stream().min((s1,s2) -> s1.compareTo(s2)).get(); 
sop(“minimum value is:”+min); 
 
String max=l.stream().max((s1,s2) -> s1.compareTo(s2)).get(); 
sop(“maximum value is:”+max); 
*/
