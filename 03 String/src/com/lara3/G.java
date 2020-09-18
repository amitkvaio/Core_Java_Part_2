package com.lara3;

public class G {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		System.out.println(sb.length());
		System.out.println(sb.capacity());

		sb.append("1234567890123456789012345678");

		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("done");
	}
}
