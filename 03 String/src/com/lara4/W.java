package com.lara4;
public class W {
	public static void main(String[] args) {
		String s1 = "abc1cyx2hello3done";
		String[] s2 = s1.split("\\d");
		for (String s3 : s2) {
			System.out.println(s3);
		}
	}
}

/*
Where ever it will find the digit it will split it

*/
