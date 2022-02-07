package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.List;
import java.util.OptionalInt;

//Find  find minimum age of student
public class N {
	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		System.out.println("Given Student list are>>");
		studentList.forEach(System.out::println);
		System.out.println("************************************************");
		OptionalInt optionstd=studentList.stream().mapToInt(std->std.getAge()).min();
		if(optionstd.isPresent()) {
			System.out.println(optionstd.getAsInt());
		}
	}
}
