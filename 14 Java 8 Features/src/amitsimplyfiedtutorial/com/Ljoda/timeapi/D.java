package amitsimplyfiedtutorial.com.Ljoda.timeapi;

import java.time.LocalDateTime;

//If we want to represent both Date and Time then we should go for LocalDateTime object. 
public class D {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now(); 
		System.out.println(dt); 
	}
}


/*

Output:
2020-01-19T19:35:35.231

*/