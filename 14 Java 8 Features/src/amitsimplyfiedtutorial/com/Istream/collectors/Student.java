package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int age;
	private String className;

	public Student(String name, String className, int age) {
		this.name = name;
		this.age = age;
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getClassName() {
		return className;
	}
	public static List<Student> getStudentList() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ram", "A", 20));
		list.add(new Student("Mohan", "A", 22));
		list.add(new Student("Mahesh", "C", 20));
		list.add(new Student("Krishna", "B", 21));
		list.add(new Student("Rakesh", "B", 30));
		list.add(new Student("Ram", "C", 21));;
		list.add(new Student("Amit", "B", 30));;
		list.add(new Student("Ajit", "C", 21));;
         
		return list;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", className=" + className + "]";
	}
	
	
}
