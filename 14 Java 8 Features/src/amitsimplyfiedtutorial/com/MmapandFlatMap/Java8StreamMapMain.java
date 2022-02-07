package amitsimplyfiedtutorial.com.MmapandFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8StreamMapMain {
	public static void main(String args[]) {
		List<Employee> listOfEmployees = createListOfEmployees();

		Set<String> listOfCities = listOfEmployees.stream()
					.flatMap(e -> e.getListOfCities().stream())
					.collect(Collectors.toSet());
		listOfCities.forEach(System.out::println);
	}

	public static List<Employee> createListOfEmployees() {
		List<Employee> listOfEmployees = new ArrayList<>();
		Employee emp1 = new Employee("Ankit", 20, Arrays.asList("Delhi", "Mumbai"));
		Employee emp2 = new Employee("Shilpa", 24, Arrays.asList("Kolkata", "Pune"));
		Employee emp3 = new Employee("Megha", 20, Arrays.asList("Delhi", "Patna"));
		Employee emp4 = new Employee("Mohan", 20, Arrays.asList("Banglore", "Pune"));
		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);
		listOfEmployees.add(emp4);
		return listOfEmployees;
	}
}
/*
	As per java docs, Stream’s flatMap returns a stream consisting of the results of 
	replacing each element of this stream with the contents of a mapped stream produced 
	by applying the provided mapping function to each element.
*/


