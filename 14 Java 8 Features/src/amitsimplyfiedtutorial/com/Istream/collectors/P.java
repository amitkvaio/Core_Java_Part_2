package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.List;
import java.util.stream.Collectors;

//Join the all employee names with “|” using java 8?
public class P {
	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		System.out.println("Given Student list are>>");
		studentList.forEach(System.out::println);
		System.out.println("************************************************");
		String name = studentList.stream().map(std->std.getName()).collect(Collectors.joining("|"));
		System.out.println(name);
	}
}
