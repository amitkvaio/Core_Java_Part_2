package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.List;
import java.util.stream.Collectors;

//filter all the student whose age is greater than 25 and print the employee names
public class J {
	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		System.out.println("Given Student list are>>");
		studentList.forEach(System.out::println);
		System.out.println("***********************************");
		List<Student> stdList= studentList.stream().filter(std->std.getAge()>25).collect(Collectors.toList());
		stdList.forEach(std->System.out.println(std));
		System.out.println("Done");
	}
}
