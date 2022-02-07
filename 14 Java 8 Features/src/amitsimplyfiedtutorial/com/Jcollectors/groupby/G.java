//Grouping and Filtering Items
package amitsimplyfiedtutorial.com.Jcollectors.groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class G {
	public static void main(String[] args) {
		List<Person> personList = Person.getPersonList();
		Map<String, List<Person>> mapCity = personList.stream().collect(Collectors.groupingBy(Person::getCity));
		Map<Integer, List<Person>> mapAge= personList.stream().collect(Collectors.groupingBy(Person::getAge));
		System.out.println(mapCity);
		System.out.println("---------------");
		System.out.println(mapAge);
	}
}
