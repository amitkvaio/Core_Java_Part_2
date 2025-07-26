package com.java12;

import java.time.DayOfWeek;
import java.time.LocalDate;
//This is Preview features
public class ASwitchStmtNewWay {
	public static void main(String[] args) {
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		
		String typeOfDay = switch (dayOfWeek) {
		 case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
		 case SATURDAY, SUNDAY -> "Day Off";
		};
		
		System.out.println(typeOfDay);
	}
}
