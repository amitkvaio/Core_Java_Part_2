package com.lara6;
import java.text.NumberFormat;
import java.util.Locale;

public class Z {
	public static void main(String[] args) {
		NumberFormat nf1 = NumberFormat.getInstance();
		NumberFormat nf2 = NumberFormat.getInstance(Locale.FRANCE);
		
		double num = 9876578.98089;
		String s1 = nf1.format(num);
		String s2 = nf2.format(num);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
