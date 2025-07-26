package com.java14;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ASwitchStmt {
	public static void main(String[] args) {
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		
		String typeOfDay = switch (dayOfWeek) {
		 case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
		 case SATURDAY, SUNDAY -> "Day Off";
		};
		
		System.out.println(typeOfDay);
	}
}

/*
Switch Expressions (Standard – No longer Preview)
Finally became a standard feature after being in preview in Java 12 and 13.
*/