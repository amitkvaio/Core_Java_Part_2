package amitsimplyfiedtutorial.com.Qfaq;

import java.util.ArrayList;
import java.util.List;

public class Manager11 {
	public static void main(String... args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		//list.stream().forEach(x -> System.out.println(Thread.currentThread().getName() + "-->" + x));
		list.parallelStream().forEach(x -> System.out.println(Thread.currentThread().getName() + "-->" + x));
		long timeTaken = System.currentTimeMillis() -start;
		System.out.println("Time Taken by stream is::"+ timeTaken);
		
		
		
		
	}
}
