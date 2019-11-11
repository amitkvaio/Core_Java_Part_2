package com.clone.shallowCopy;

public class Course {
	String subject1;
	String subject2;
	String subject3;

	public Course(String sub1, String sub2, String sub3) {
		this.subject1 = sub1;
		this.subject2 = sub2;
		this.subject3 = sub3;
	}
	@Override
	public String toString() {
		return "Course [subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + "]";
	}
}
