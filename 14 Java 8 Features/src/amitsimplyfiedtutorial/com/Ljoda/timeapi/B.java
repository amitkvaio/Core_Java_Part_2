package amitsimplyfiedtutorial.com.Ljoda.timeapi;

import java.time.LocalDate;

public class B {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		int dd = localDate.getDayOfMonth();
		int mm = localDate.getMonthValue();
		int yy = localDate.getYear();
		System.out.println("dd->"+dd);
		System.out.println("mm-->"+mm);
		System.out.println("yy->"+yy);
	}
}

/*
Once we get LocalDate object we can call the following methods on that object to retrieve Day,month 
and year values separately and its having other method also based on the requirement we call the 
respective methods. 
output :

dd->18
mm-->1
yy->2020
*/

