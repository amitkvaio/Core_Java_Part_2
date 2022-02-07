package amitsimplyfiedtutorial.com.Dpredicate;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private String gender;
	private int age;

	public Student(int id, String name, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	public static List<Student> getStudentList() {
		ArrayList<Student> stdList = new ArrayList<>();
		stdList.add(new Student(100, "Raja", "Male", 35));
		stdList.add(new Student(105, "Rakesh", "Male", 30));
		stdList.add(new Student(103, "Pinki", "Female", 28));
		stdList.add(new Student(102, "Tinku", "Female", 24));
		stdList.add(new Student(101, "Nitesh", "Male", 37));
		stdList.add(new Student(107, "Shive", "Male", 42));
		stdList.add(new Student(106, "Sony", "Female", 28));
		return stdList;
	}
}
