package amitsimplyfiedtutorial.com.Alambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Using java 8  sorting in ascending order
public class TestSortingWith28 {
	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		listDevs.forEach(developer->System.out.println(developer));

		Comparator<Developer> revAge = 
				(dev1,dev2)->Integer.valueOf(dev1.getAge()).compareTo(Integer.valueOf(dev2.getAge()));
		listDevs.sort(revAge.reversed());
		System.out.println("After Sort By Age in reverse Order");
		listDevs.forEach(dev->System.out.println(dev));
		
		// Sort by Salary in reverse Order
		Comparator<Developer> revSalary = 
				(dev1, dev2) -> Integer.valueOf(dev1.getSalary()).compareTo(Integer.valueOf(dev2.getSalary()));
		listDevs.sort(revSalary.reversed());
		
		System.out.println("After Sort By Salary in reverse order");
		listDevs.forEach(dev->System.out.println(dev));
		
		// sort by Name in reverse order
		Comparator<Developer> reverseOrder  = (dev1,dev2)->dev1.getName().compareTo(dev2.getName());
		listDevs.sort(reverseOrder.reversed());
		
		System.out.println("After Sort By Name in Reverse Order");
		listDevs.forEach((Developer dev)->System.out.println(dev));
		
	}

	private static List<Developer>getDevelopers() {
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("Raja", 70000, 33));
		result.add(new Developer("Amit", 50000, 20));
		result.add(new Developer("Ravi", 45000, 10));
		result.add(new Developer("Bhupathi", 55000, 55));

		return result;

	}
}
