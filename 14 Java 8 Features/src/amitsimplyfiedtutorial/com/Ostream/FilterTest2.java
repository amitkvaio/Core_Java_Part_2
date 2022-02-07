package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;
//Before Java 8
public class FilterTest2 {
	public static void main(String[] args) {
		Person [] perArray = {new Person("Amit", 28, 45000),
					new Person("Ajit", 16, 35000),new Person("Rakesh", 24, 45000),
					new Person("Pintu", 29, 30000)};
		
		List<Person> personList = Arrays.asList(perArray);
		Person person = searcPersonByName(personList, "Rakesh");
		System.out.println(person);
    }
	
	public static Person searcPersonByName(List<Person> personList,String personName){
		Person per = null;
		for (Person person : personList) {
			if(personName!=null && personName.equals(person.getName())){
				per = person;
			}
		}
		return per;
	}
}
