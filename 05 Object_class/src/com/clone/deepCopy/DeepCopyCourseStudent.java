package com.clone.deepCopy;

public class DeepCopyCourseStudent {
	public static void main(String[] args) {
		Course course = new Course("Hindi", "English", "Math");
		Student st = new Student(1030, "Amit", course);
		System.out.println("Before deep copy");
		System.out.println("Parent: " + st);
		
		Student stDeepCopy = null;
		try {
			stDeepCopy = (Student) st.clone();
			System.out.println("Clone : " + stDeepCopy);

			stDeepCopy.course.subject1 = "Java";
			stDeepCopy.course.subject2 = "Hibernate";
			stDeepCopy.course.subject3 = "Spring";
			System.out.println("After modification in clone object:");
			System.out.println("Clone : " + stDeepCopy);
			System.out.println("Parent: " + st);
			System.out.println("After change in clone object it does not effects parents object::");

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
