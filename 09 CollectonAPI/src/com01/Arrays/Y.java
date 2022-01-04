package com01.Arrays;

import java.util.Arrays;

//24
public class Y {
	public static void main(String[] args) {
		String[] x = { "hello", "blue", "yello", 
				"white", "pink", "lara", "java" };
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
			// [blue, hello, java, lara, pink, white, yello]
		int i = Arrays.binarySearch(x, "abc");
		System.out.println("abc:" + i);
		i = Arrays.binarySearch(x, "orange");
		System.out.println("orange:" + i);
		i = Arrays.binarySearch(x, "red");
		System.out.println("red:" + i);
		i = Arrays.binarySearch(x, "java");
		System.out.println("java:" + i);
	}
}


/*
before b=> -1
b-h => -2
h-j =>-3
j-l =>-4
l-p =>-5
p-w	=>-6
w-y =>-7
>y = >-8 

*/