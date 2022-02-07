package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;


public class FilterTestJava83 {
	public static void main(String[] args) {

		Person [] perArray = {new Person("Amit", 28, 45000),
				new Person("Ajit", 16, 35000),new Person("Rakesh", 24, 45000),
				new Person("Pintu", 29, 30000)};
	
		List<Person> personList = Arrays.asList(perArray);
		Person person	=	personList.stream()
					  	.filter(per -> "Amit".equals(per.getName()) && 28 == per.getAge())
					  	.findAny()
					  	.orElse(null);
		System.out.println("Person Details ::"+person);
	}

}
