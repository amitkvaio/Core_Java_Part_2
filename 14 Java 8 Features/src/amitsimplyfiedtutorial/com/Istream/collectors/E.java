package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class E {
	public static void main(String[] args) {
		List<Person> list = Person.getList();
		System.out.println("--Join person name--");
		String result = list.stream().map(p -> p.getName()).collect(Collectors.joining("|"));
		System.out.println(result);
	}
}
