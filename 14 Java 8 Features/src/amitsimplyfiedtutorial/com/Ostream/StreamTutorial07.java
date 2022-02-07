//Print the 10 random number using java 8
package amitsimplyfiedtutorial.com.Ostream;

import java.util.Random;

public class StreamTutorial07 {
	public static void main(String[] args) {
		Random random = new Random();
		random.ints().limit(10).sorted().forEach((str)->System.out.println(str));
	}
}
