package com.java12;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ASwitchStmtOldWay {
	public static void main(String[] args) {
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		String typeOfDay = "";
		switch (dayOfWeek) {
		    case MONDAY:
		    case TUESDAY:
		    case WEDNESDAY:
		    case THURSDAY:
		    case FRIDAY:
		        typeOfDay = "Working Day";
		        break;
		    case SATURDAY:
		    case SUNDAY:
		        typeOfDay = "Day Off";
		}
		
		System.out.println(typeOfDay);
	}
}
