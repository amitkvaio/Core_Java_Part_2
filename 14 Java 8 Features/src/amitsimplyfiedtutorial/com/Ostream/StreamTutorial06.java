//Find the max, min ,sum, average ,count using java 8
package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamTutorial06 {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(5, 10, 2, 13, 14, 15, 16, 17, 2, 10);
		IntSummaryStatistics statics=intList.stream().mapToInt((num)->num).summaryStatistics();
		System.out.println("Max :"+statics.getMax());
		System.out.println("Min :"+statics.getMin());
		System.out.println("Average : "+statics.getAverage());
		System.out.println("Count : "+statics.getCount());
		System.out.println("Sum :"+statics.getSum());
		System.out.println("After adding two values in statics");
		statics.accept(100);
		statics.accept(1);
		System.out.println("Max :"+statics.getMax());
		System.out.println("Min :"+statics.getMin());
		System.out.println(intList);
		
	}
}
