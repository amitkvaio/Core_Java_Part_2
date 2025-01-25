package amitsimplyfiedtutorial.com.FmethodRefrence;

import java.util.function.Function;

import amitsimplyfiedtutorial.com.Dpredicate.Student;

//Constructor Reference
public class D {
	public static void main(String[] args) {
		Function<String, Student> studentCreator = name -> new Student(name);
        //Function<String, Student> studentCreator = Student::new;
        Student student = studentCreator.apply("Raja");
        System.out.println(student);
        System.out.println("Student Name: " + student.getName());
	}
}
