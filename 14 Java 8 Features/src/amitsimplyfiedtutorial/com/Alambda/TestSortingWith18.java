package amitsimplyfiedtutorial.com.Alambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Using java 8  sorting in ascending order
public class TestSortingWith18 {
	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		listDevs.forEach(developer->System.out.println(developer));

		// sort by age
		listDevs.sort((dev1,dev2)->dev2.getAge()-dev1.getAge());
		//or
		//listDevs.sort((Developer dev1, Developer dev2)->dev1.getAge()-dev2.getAge());
		
		System.out.println("After Sort By Age");
		listDevs.forEach((Developer dev)->System.out.println(dev));
		
		// Sort by Salary
		listDevs.sort((dev1,dev2)->dev1.getSalary()-dev2.getSalary());
		System.out.println("After Sort By Salary");
		listDevs.forEach(dev->System.out.println(dev));
		
		// Sort by Name
		listDevs.sort((Developer dev1,Developer dev2)->dev1.getName().compareTo(dev2.getName()));
		System.out.println("After Sort By Name");
		listDevs.forEach(dev->System.out.println(dev));
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
