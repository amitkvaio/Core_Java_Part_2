package amitsimplyfiedtutorial.com.Hstream;

import java.time.LocalDateTime;
import java.time.Month;

public class Q {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println("******************");
		System.out.println("After six month : "+dateTime.plusMonths(6));
		System.out.println("Before six month : "+dateTime.minusMonths(6));
		
		
		//We can represent a particular Date and Time by using LocalDateTime object 
		LocalDateTime dt1=LocalDateTime.of(1995,Month.APRIL,28,12,45); 
		System.out.println(dt1);
	}
}

/*

If we want to represent both Date and Time then we should go for LocalDateTime object. 

output :2019-01-06T13:26:43.398

*/