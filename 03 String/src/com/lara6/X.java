package com.lara6;

import java.text.NumberFormat;

public class X
{
	public static void main(String[] args)
	{
		NumberFormat nf = NumberFormat.getInstance();
		
		double num = 245678.25643;
		System.out.println(num);
		System.out.println(nf.format(num));
	}
}
/*
default number  format is us country

*/