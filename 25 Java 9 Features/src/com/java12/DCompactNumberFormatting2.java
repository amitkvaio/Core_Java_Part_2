package com.java12;

import java.text.NumberFormat;
import java.util.Locale;

//Long Format
public class DCompactNumberFormatting2 {
	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		format.setMaximumFractionDigits(1);

		System.out.println(format.format(1000)); // 1K
		System.out.println(format.format(1500000)); // 1.5M
	}
}
/*
1 thousand
1.5 million
*/
