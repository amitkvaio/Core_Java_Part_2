package com.java09;

import java.util.List;

public class EDropWhile {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(5, 10, 15, 2, 3, 4, 20);
		numbers.stream().dropWhile(n -> n < 10).forEach(System.out::println);
		System.out.println("***************************");
		
		 //dropWhile: Skip placeholder ratings
        List<Integer> ratings = List.of(0, 0, 0, 3, 4, 5, 2, 0);

        System.out.println("Filtered Ratings:");
        ratings.stream()
               .dropWhile(rating -> rating == 0)
               .forEach(System.out::println);
		
		//dropWhile(rating -> rating == 0): Skips all leading 0s until the first valid rating.
	}
}

/*
dropWhile() – Skip elements while the condition is true
*/