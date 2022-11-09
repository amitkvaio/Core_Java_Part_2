package com.lara.app1;

import java.util.Arrays;

public class Ajit {
	public static void main(String[] args) {
		String str ="ajit kumar".toUpperCase();
		
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		int ascci =65;
		System.out.println(Arrays.toString(charArray));
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]==' ')
				continue;
			
			if(charArray[i]!=ascci) {
				ascci++;
			}
			
			if(charArray[i]==ascci)
				continue;
				
		}
		
	}
}
