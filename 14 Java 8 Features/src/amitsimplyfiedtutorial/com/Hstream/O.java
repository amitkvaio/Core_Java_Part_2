package amitsimplyfiedtutorial.com.Hstream;

import java.time.LocalDate;

public class O {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("Current System Date 	:"+localDate);
		System.out.println("Current System Day 		:"+localDate.getDayOfMonth());
		System.out.println("Current System Month 	:"+localDate.getMonthValue());
		System.out.println("Current System Year		:"+localDate.getYear());
		System.out.println("Current System Year Dya :"+localDate.getDayOfYear());
	}
}

/*

Once we get LocalDate object we can call the following methods on that object to retrieve Day,month 
and year values separately. 

*/