package amitsimplyfiedtutorial.com.Hstream;

import java.time.LocalTime;

public class P {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("Current System Time : "+localTime);
		System.out.println("Current System hours : "+localTime.getHour());
		System.out.println("Current System minute : "+localTime.getMinute());
		System.out.println("Current System second : "+localTime.getSecond());
		System.out.println("Current System nanoSecond : "+localTime.getNano());
	}
}

/*

Once we get LocalTime object we can call the above methods on that object. 

*/

