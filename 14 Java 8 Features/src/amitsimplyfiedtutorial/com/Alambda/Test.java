package amitsimplyfiedtutorial.com.Alambda;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<Developer> dev = getDevelopers();
		
		dev.sort((dev1,dev2)->dev1.getAge()-dev2.getAge());
		dev.forEach((d)->System.out.println(d));
		System.out.println("--------------");
		dev.sort((dev1,dev2)->{
			return dev1.getName().compareTo(dev2.getName());
		});
		dev.forEach((d)->System.out.println(d));
		
	}
	
	
	
	private static List<Developer> getDevelopers() {
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("Raja", 70000, 33));
		result.add(new Developer("Amit", 50000, 20));
		result.add(new Developer("Ravi", 45000, 10));
		result.add(new Developer("Bhupathi", 55000, 55));

		return result;

	}
}
