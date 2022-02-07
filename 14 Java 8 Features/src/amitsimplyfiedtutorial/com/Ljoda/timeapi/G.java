package amitsimplyfiedtutorial.com.Ljoda.timeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//We can create ZoneId for a particular zone as follows 
public class G {
	public static void main(String[] args) {
		ZoneId la = ZoneId.of("America/Los_Angeles"); 
		ZonedDateTime zt = ZonedDateTime.now(la); 
		System.out.println(zt); 
	}
}
/*
Output :2020-01-19T06:10:00.727-08:00[America/Los_Angeles]
*/