
import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private String city;
	private int age;

	public Person(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "(name=" + name + ", city=" + city + ", age=" + age + ")";
	}

	public static List<Person> getPersonList() {
		List<Person> peopleList = new ArrayList<Person>();
		peopleList.add(new Person("John", "London", 21));
		peopleList.add(new Person("Swann", "London", 21));
		peopleList.add(new Person("Kevin", "London", 23));
		peopleList.add(new Person("Monobo", "Tokyo", 23));
		peopleList.add(new Person("Sam", "Paris", 23));
		peopleList.add(new Person("Nadal", "Paris", 31));
		peopleList.add(null);
		return peopleList;
	}

}
