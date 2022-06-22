package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;

public class FilterTestJava84 {
	public static void main(String[] args) {
		Person [] perArray = {new Person("Amit", 28, 45000),
				new Person("Ajit", 16, 35000),new Person("Rakesh", 24, 45000),
				new Person("Pintu", 29, 30000)};
	
		List<Person> personList = Arrays.asList(perArray);
		Person per	= personList.stream()
						.filter(person->{
							if("Amit".equals(person.getName()) && person.getAge()==28){
								return true;
								// if the if condition become true
								// means required object is available otherwise not
								//if not then returning null
							}else{
								return false;
							}
						})
						.findAny()
						.orElse(null);
		System.out.println("Person Details ::"+per);
		
		
	}
}
