package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;

public class FilterTestJava82 {
	public static void main(String[] args) {

		Person [] perArray = {new Person("Amit", 28, 45000),
				new Person("Ajit", 16, 35000),new Person("Rakesh", 24, 45000),
				new Person("Pintu", 29, 30000)};
	
		List<Person> personList = Arrays.asList(perArray);
		
		Person per=personList
			.stream()  // Converting into stream
			.filter(person->"Amit".equals(person.getName())) //Getting the details of Amit
			.findAny() //  if fond then return 
			.orElse(null); // if not found then return as null
		System.out.println("Person Details ::"+per);
		
		
		Person per1=personList
				.stream() 
				.filter(person->"Amit1".equals(person.getName())) 
				.findAny()
				.orElse(null);
			System.out.println("Person Details ::"+per1);
	}

}
