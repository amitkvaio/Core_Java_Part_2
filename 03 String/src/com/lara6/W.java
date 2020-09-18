package com.lara6;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class W {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 20);
		Date d1 = cal.getTime();
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, new Locale("fr"));
		
		System.out.println(df1.format(d1));
		System.out.println(df2.format(d1));
	}
}

/*

fr=france date 
*/