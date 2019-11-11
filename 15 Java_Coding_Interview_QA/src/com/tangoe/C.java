package com.tangoe;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C {
	public static void main(String[] args) {
		String str = "Hi I am good and good morning";
		List<String> list = Arrays.asList(str.split(" "));
		list.forEach(s->System.out.println(s));
		
		Map<String, Long> map =list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}
}
