package amitsimplyfiedtutorial.com.Hstream;

import java.time.Year;

//# write a program to check the given year is leap year or not. 
public class T {
	public static void main(String[] args) {
		int y = 2000;
		Year year = Year.of(y);	
		System.out.println(year);
		if(year.isLeap()) {
			System.out.println(y+" is leap year");
		}else {
			System.out.println(y + " is not leap year");
		}
	}
}
