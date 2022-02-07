package amitsimplyfiedtutorial.com.Hstream;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//We can create ZoneId for a particular zone as follows 
public class S {
	public static void main(String[] args) {
		ZoneId la = ZoneId.of("America/Los_Angeles"); 
		ZonedDateTime zt = ZonedDateTime.now(la); 
		System.out.println(zt); 
	}
}
