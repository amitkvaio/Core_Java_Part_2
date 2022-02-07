package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.List;
//count number of Student with age 25?
public class K {

	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		System.out.println("Given Student list are>>");
		studentList.forEach(System.out::println);
		System.out.println("***********************************");
		long count = studentList.stream().filter(std->std.getAge()>21).count();
		System.out.println("Total Number of student::"+count);
	}
}
