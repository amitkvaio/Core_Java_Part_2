package amitsimplyfiedtutorial.com.Hstream;

import java.time.LocalDate;
import java.time.LocalTime;

//# program for to display System Date and time. 
public class N {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("Current System Date : "+localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println("Current System time : "+localTime);
	}
}

/*

Date and Time API: (Joda-Time API) 
until java 1.7version the classes present in java.util package to handle Date and Time(like 
Date,Calendar,TimeZoneetc) are not upto the mark with respect to convenience and performance. 
 
To overcome  this problem in the 1.8 version oracle people introduced Joda-Time API . This API 
developed by joda.org and available in java in the form of java.time package. 

*/