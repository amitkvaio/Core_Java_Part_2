package amitsimplyfiedtutorial.com.FmethodRefrence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import amitsimplyfiedtutorial.com.Dpredicate.Student;

public class K {
	
	public static void print(Student std) {
		System.out.println(std.getName());
	}
	
	public static void main(String[] args) {
		List<String> listName = Arrays.asList("Amit","Raja","Ajit","Bishnu");
		List<Student> stdList = listName.stream().map(stdName -> new Student(stdName)).collect(Collectors.toList());
		stdList.forEach(K::print);
		System.out.println("********************************************************************");
		List<Student> stdList1 = listName.stream().map(Student::new).collect(Collectors.toList());
		stdList1.forEach(K::print);
	}
}
