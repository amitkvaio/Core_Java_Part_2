package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;

public class TestPractice {
	public static void main(String[] args) {
		Person[] perArray = { new Person("Amit", 28, 45000), new Person("Ajit", 16, 35000),
				new Person("Rakesh", 24, 45000), new Person("Pintu", 29, 30000) };
		
		List<Person> perList = Arrays.asList(perArray);
		
		Person per=perList.stream().filter((p)->p.getName().equals("Amit")).findAny().orElse(null);
		Person per1=perList.stream().filter((p)->p.getName().equals("Amit")).findAny().get();
		Boolean status=perList.stream().filter((p)->p.getName().equals("Amit")).findAny().isPresent();
		Person per3=perList.stream().filter((p)->p.getName().equals("Amit")).findAny().get();
		System.out.println(per);
	}
}
