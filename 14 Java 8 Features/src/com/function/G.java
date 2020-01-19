package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.predicate.Student;

public class G {
	public static void main(String[] args) {
		List<Student> stdList = Student.getStudentList();
		Function<Student, String> stdPred = (std) -> {
			return std.getName();
		};
		List<String> namesList = getStdNamesList(stdList, stdPred);
		namesList.forEach((names) -> System.out.println(names));
	}

	public static List<String> getStdNamesList(List<Student> stdList, Function<Student, String> stdFun) {
		List<String> strList = new ArrayList<String>();
		for (Student student : stdList) {
			strList.add(stdFun.apply(student));
		}
		return strList;
	}
}
