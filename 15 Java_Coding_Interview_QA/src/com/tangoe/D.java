package com.tangoe;

public class D {
	public static void main(String[] args) {
		String[] strArray = {"test","123test","amit","abctest"};
		
		for (String str : strArray) {
			if(str.contains("test")) {
				System.out.println(str);
			}
		}
	}
}
