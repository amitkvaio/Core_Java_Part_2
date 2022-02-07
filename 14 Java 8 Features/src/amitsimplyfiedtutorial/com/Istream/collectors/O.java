package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.List;

//sort all the employee on the basis of age
public class O {
	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		System.out.println("Given Student list are>>");
		studentList.forEach(System.out::println);
		System.out.println("************************************************");
		studentList.sort((std1,std2)->std1.getAge()-std2.getAge());
		studentList.forEach(std->System.out.println(std));
	}
}
