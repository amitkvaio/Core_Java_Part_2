package amitsimplyfiedtutorial.com.Qfaq;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
Given a list of numbers, square them and filter the numbers which are greater 10000 and 
then find average of them

*/
public class Manager15 {
	public static void main(String[] args) {
		Integer[] arr=new Integer[]{100,24,13,44,114,200,40,112};
		List<Integer> listNum = Arrays.asList(arr);
		OptionalDouble average = listNum.stream()
		.mapToInt(n->n*n)
		.filter(n->n>10000)
		.average();
		
		if(average.isPresent())
            System.out.println(average.getAsDouble());
	}
}
