package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.List;
import java.util.OptionalInt;

//Find  find maximum age of student
public class M {
	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		System.out.println("Given Student list are>>");
		studentList.forEach(System.out::println);
		System.out.println("************************************************");
		OptionalInt optionstd=studentList.stream().mapToInt(std->std.getAge()).max();
		if(optionstd.isPresent()) {
			System.out.println(optionstd.getAsInt());
		}
	}
}
