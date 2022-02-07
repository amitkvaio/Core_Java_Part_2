package amitsimplyfiedtutorial.com.Jcollectors.groupby;

import java.util.List;

public class I {
	public static void main(String[] args) {
		List<Person> personList = Person.getPersonList();
		personList.stream().forEach(p->System.out.println(p));
		System.out.println("---------------");
		personList.removeIf(p-> "John".equals(p.getName()));
		
		personList.stream().forEach(p->System.out.println(p));
		
	}
}
