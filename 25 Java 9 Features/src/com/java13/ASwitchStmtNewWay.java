package com.java13;

import java.time.DayOfWeek;
import java.time.LocalDate;

//This is Preview features  in java 12 and 13 as well
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
