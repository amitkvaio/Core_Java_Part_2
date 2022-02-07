package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamReduce03 {
	public static void main(String[] args) {
		 Integer arrSum = Stream.of(10,20,22,12,14).reduce(1000, Integer::sum);
         System.out.println(arrSum);
 
         arrSum = Stream.of(10,20,22,12,14).reduce(1000, (x,y)->x+y);
         System.out.println(arrSum);
 
         String result = Stream.of("java", "c", "c#", "python").reduce("Languages:", (x,y)->x+" | "+y);
         System.out.println(result);
         System.out.println("*************************");
        
	     int[] array = {23,43,56,97,32};
	  	 //Set start value. Result will be start value + sum of array. 
		 int startValue = 100;
		 int sum = Arrays.stream(array).reduce(startValue, (x,y) -> x+y);
		 System.out.println("sum1->"+sum);
		 sum = Arrays.stream(array).reduce(startValue, Integer::sum);
		 System.out.println("sum2->"+sum);
		 sum = Arrays.stream(array).reduce(startValue, StatisticsUtility::addIntData);
		 System.out.println("sum3->"+sum);
	}
}

/*
stream.reduce() with Identity and Accumulator
Here will use an identity and accumulator. 
We will pass the identity as start value. 
Here identity = 1000
*/