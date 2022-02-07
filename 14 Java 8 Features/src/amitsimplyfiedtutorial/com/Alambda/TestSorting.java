package amitsimplyfiedtutorial.com.Alambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {
	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		// sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		System.out.println("After Sort By Age");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		// sort by salary
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getSalary() - o2.getSalary();
			}
		});

		System.out.println("After Sort By Salary");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		// sort by Name
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println("After Sort By Name");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

	}

	private static List<Developer> getDevelopers() {
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("Raja", 70000, 33));
		result.add(new Developer("Amit", 50000, 20));
		result.add(new Developer("Ravi", 45000, 10));
		result.add(new Developer("Bhupathi", 55000, 55));

		return result;

	}
}
