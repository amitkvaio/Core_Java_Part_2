package amitsimplyfiedtutorial.com.Dpredicate;
//Filter student based on their age,gender,name and id

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class H {
	public static void main(String[] args) {
		List<Student> stdList = Student.getStudentList();
		
		System.out.println("********Below List of Student having age > 30*****");
		Predicate<Student> pAge = (std) -> std.getAge() > 30;
		List<Student> greaterAgeList = getStudentFilter(stdList, pAge);
		greaterAgeList.forEach(std->System.out.println(std));
		
		
		System.out.println("********Below List of Student having age < 30*****");
		Predicate<Student> preAge = (std) -> std.getAge() < 30;
		List<Student> lessAgeList = getStudentFilter(stdList, preAge);
		lessAgeList.forEach(std->System.out.println(std));
		
		System.out.println("******** Male Student List *****");
		Predicate<Student> preGen = (std) -> "Male".equals(std.getGender());
		List<Student> maleStdList = getStudentFilter(stdList, preGen);
		maleStdList.forEach(std->System.out.println(std));
		
		System.out.println("******** Female Student List *****");
		Predicate<Student> preFemale = (std) -> "Female".equals(std.getGender());
		List<Student> femaleList  = getStudentFilter(stdList, preFemale);
		femaleList.forEach(std->System.out.println(std));
		
		
		System.out.println("******** Female Student List having their age > 25 *****");
		Predicate<Student> preFem = (std) -> "Female".equals(std.getGender()) && std.getAge() >25 ;
		List<Student> femList  = getStudentFilter(stdList, preFem);
		femList.forEach(std->System.out.println(std));
	}
	
	public static List<Student> getStudentFilter(List<Student> stdList, Predicate<Student> predicate){
		return stdList.stream().filter(predicate).collect(Collectors.toList());
	}
}
