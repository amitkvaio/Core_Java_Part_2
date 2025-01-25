package amitsimplyfiedtutorial.com.FmethodRefrence;

import amitsimplyfiedtutorial.com.Dpredicate.Student;

@FunctionalInterface
interface QuadFunction<T, U, V, W, R> {
    R apply(T t, U u, V v, W w);
}

public class E {
	public static void main(String[] args) {
		// Using a lambda expression for custom constructor call
		 QuadFunction<Integer, String, String, Integer, Student> studentCreator = 
		            (id, name, gender, age) -> new Student(id, name, gender, age);
		//QuadFunction<Integer, String, String, Integer, Student> studentCreator = Student::new;
        
        // Create a Student object
        Student student = studentCreator.apply(1, "Amit", "Male", 35);
        System.out.println(student);
	}
}
