package amitsimplyfiedtutorial.com.Ostream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilders3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		//Returns a sequential Stream with this collection as its source. 
		stream.forEach(p -> System.out.println(p));
	}
}
