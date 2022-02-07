package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.List;
import java.util.Optional;

//find the Student with name “Amit”.
public class L {
	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		System.out.println("Given Student list are>>");
		studentList.forEach(System.out::println);
		System.out.println("*******************************************************************");
		Optional<Student> optionStd 
			= studentList.stream().filter(st -> st.getName().equalsIgnoreCase("Amit")).findAny();
		if(optionStd.isPresent()) {
			System.out.println(optionStd.get());
		}
	}
}
