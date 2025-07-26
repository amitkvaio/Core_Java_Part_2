package com.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class DCompactNumberFormatting3 {
//Locale Specific
	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getCompactNumberInstance(
			    Locale.FRANCE, NumberFormat.Style.SHORT);
			format.setMaximumFractionDigits(1);

			System.out.println(format.format(1000)); // 1 k
	}
}

/*
Feature							Description
Switch Expressions				Use switch as an expression
String.indent()					Indent or de-indent lines
Files.mismatch()				Compare two files byte by byte
Compact Number Formatting		Format numbers as 1K, 1M, etc.
JVM Enhancements				Internal JVM performance optimizations
*/