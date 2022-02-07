package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given the list of Student, group them by student class name?
public class Q {
	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		System.out.println("Given Student list are>>");
		studentList.forEach(System.out::println);
		System.out.println("************************************************");
		Map<String, List<Student>> stdMap=studentList.stream().collect(Collectors.groupingBy(std->std.getClassName()));
		System.out.println(stdMap);
	}
}
