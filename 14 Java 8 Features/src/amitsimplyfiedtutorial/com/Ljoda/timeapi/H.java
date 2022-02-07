package amitsimplyfiedtutorial.com.Ljoda.timeapi;

import java.time.LocalDate;
import java.time.Period;

//Period object can be used to represent quantity of time 
public class H {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); 
		LocalDate birthday = LocalDate.of(1990,03,05); 
		Period p = Period.between(birthday,today); 
		System.out.printf("age is %d year %d months %d days",p.getYears(),p.getMonths(),p.getDays()); 
	}
}
