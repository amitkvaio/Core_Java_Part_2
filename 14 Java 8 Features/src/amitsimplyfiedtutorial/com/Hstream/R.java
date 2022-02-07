package amitsimplyfiedtutorial.com.Hstream;

import java.time.ZoneId;
// printing the default zone id
public class R {
	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId.getId());
	}
}
/*

To Represent Zone: 
ZoneId object can be used to represent Zone. 

output 
Asia/Calcutta

*/