import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*

List of Person
	sort the data by age 
	>=then data should be sorted based on name 
 
*/
public class ASortWipro {
	public static void main(String[] args) {
		List<Person> personList = getPersonList();
		personList.stream().sorted((per1, per2) -> {
			if (per1.getAge() == per2.getAge()) {
				return per1.getName().compareTo(per2.getName());
			} else {
				return per1.getAge() - per2.getAge();
			}
		}).forEach(per -> System.out.println(per));
	}

	public static List<Person> getPersonList() {
		List<Person> peopleList = new ArrayList<Person>();
		peopleList.add(new Person("John", "London", 21));
		peopleList.add(new Person("Swann", "London", 21));
		peopleList.add(new Person("Kevin", "London", 23));
		peopleList.add(new Person("Monobo", "Tokyo", 23));
		peopleList.add(new Person("Sam", "Paris", 23));
		peopleList.add(new Person("Nadal", "Paris", 31));
		peopleList.add(new Person("Akash", "Paris", 31));
		peopleList.add(new Person("Amit", "Paris", 21));
		return peopleList;
	}
}
