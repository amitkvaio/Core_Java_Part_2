package amitsimplyfiedtutorial.com.Ljoda.timeapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class A {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}
}

/*

Date and Time API: (Joda-Time API) 
------------------------------------
until java 1.7version the classes present in java.util package to handle Date and Time(like 
Date,Calendar,TimeZoneetc) are not upto the mark with respect to convenience and performance
 
To overcome  this problem in the 1.8version oracle people introduced Joda-Time API . 
This API developed by joda.org and available in java in the form of java.time package. 

output

2020-01-18
22:17:41.385


*/