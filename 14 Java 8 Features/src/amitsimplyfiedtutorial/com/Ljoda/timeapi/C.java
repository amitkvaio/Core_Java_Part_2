package amitsimplyfiedtutorial.com.Ljoda.timeapi;

import java.time.LocalTime;

public class C {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		int hh =  time.getHour();
		int mm = time.getMinute();
		int ss = time.getSecond();
		int ns = time.getNano();
		System.out.println("hh-->"+hh);
		System.out.println("mm-->"+mm);
		System.out.println("ss-->"+ss);
		System.out.println("ns-->"+ns);
	}
}

/*
Once we get LocalTime object we can call the following methods on that object. 

hh-->22
mm-->22
ss-->40
ns-->428000000


*/