package com.java12;

import java.text.NumberFormat;
import java.util.Locale;
//Short Format
public class DCompactNumberFormatting {
	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getCompactNumberInstance(
			    Locale.US, NumberFormat.Style.SHORT);
			format.setMaximumFractionDigits(1);

			System.out.println(format.format(1000));    // 1K
			System.out.println(format.format(1500000)); // 1.5M
	}
}
/*
Compact Number Formatting (Locale-Based)
New class: NumberFormat.getCompactNumberInstance() for shorter number output like 1K, 1M.
*/