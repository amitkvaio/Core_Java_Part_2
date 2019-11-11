//VVI
//Need to remove the person object whose name is John
import java.util.List;

public class PersonClient {
	public static void main(String[] args) {
		List<Person> personList = Person.getPersonList();
		System.out.println(personList);
		/*for (Person person : personList) {
			if(person!=null && "John".equals(person.getName())) {
				personList.remove(person);
			}
		}*/
		//Exception in thread "main" java.util.ConcurrentModificationException
		
		/*Iterator<Person> personIt = personList.iterator();
		while(personIt.hasNext()) {
			Person per = personIt.next();
			if(per!=null && "John".equals(per.getName())) {
				personIt.remove();
			}
		}
		System.out.println(personList);*/
		
		// Using java 8
		personList.removeIf(per->"John".equals(per==null? false :per.getName()));
		System.out.println(personList);
	}
}
