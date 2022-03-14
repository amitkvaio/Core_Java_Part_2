package com.tricky;

import java.util.ArrayList;
import java.util.List;

//Check if a List of integers contains only odd numbers?
public class Test09 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		//list.add(11);
		System.out.println(checkOdd(list));
		System.out.println(checkOddUsingSteam(list));	
	}

	public static boolean checkOdd(List<Integer> list) {
		for (Integer num : list) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkOddUsingSteam(List<Integer> list) {
		return list.parallelStream().anyMatch(num -> num % 2 != 0);
	}
}


