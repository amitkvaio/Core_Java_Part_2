package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class H {
	public static void main(String[] args) {
		List<Student> list = Student.getStudentList();
		Map<String,List<Student>> st=list.stream()
				.collect(Collectors.groupingBy(Student::getClassName));
		
		st.forEach((k,v)->System.out.println("Key:"+k+"  "+ 
                ((List<Student>)v).stream().map(m->m.getName()).collect(Collectors.joining("|"))));
	
		//list.stream().collect(Collectors.groupingBy(Student::getClassName));
	}	

}

/*
groupingBy is a static method of java.util.stream.Collectors in java 8. 
groupingBy does the grouping of elements on the basis of any given key and returns a Collector
*/
