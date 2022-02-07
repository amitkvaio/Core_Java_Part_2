package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class I {
	public static void main(String[] args) {
		System.out.println("----Group Student on the basis of age----");
		List<Student> list = Student.getStudentList();
        
		Map<Integer, List<Student>> stdByAge = list.stream()
                .collect(Collectors.groupingBy(Student::getAge));
    
    stdByAge.forEach((k,v)->System.out.println("Key:"+k+"  "+ 
            ((List<Student>)v).stream().map(m->m.getName()).collect(Collectors.joining(","))));
	}
}
 	