//How to convert List into Map
package amitsimplyfiedtutorial.com.Jcollectors.groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class H {
	public static void main(String[] args) {
		List<Person> personList = Person.getPersonList();
		
		Map<String, Person> mapPerson =
		personList.stream().collect(Collectors.toMap(Person::getName, p->p));
		System.out.println(mapPerson);
	}
}
