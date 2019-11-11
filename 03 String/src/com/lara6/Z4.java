package com.lara6;

import java.text.NumberFormat;
import java.util.Locale;

public class Z4
{
	public static void main(String[] args)
	{
		double num = 234859.98766;
		NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.CANADA);
		NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.ITALIAN);
		String s1 = nf1.format(num);
		String s2 = nf2.format(num);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
