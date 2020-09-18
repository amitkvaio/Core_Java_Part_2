package com.lara4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C {
	public static void main(String[] args) {
		String s1 = "hellojava123javadone";
		String s2 = "java";
		Pattern p1 = Pattern.compile(s2);
		Matcher m1 = p1.matcher(s1);
		while (m1.find()) {
			System.out.println("m1=" + m1.start());
			System.out.println(".............");
			System.out.println(m1.group());
			System.out.println("@");
			System.out.println(m1.start());
			System.out.println(".............");
		}
	}
}
